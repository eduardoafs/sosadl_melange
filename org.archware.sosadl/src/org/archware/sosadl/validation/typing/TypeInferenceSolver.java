package org.archware.sosadl.validation.typing;

import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.archware.sosadl.sosADL.BooleanType;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.sosADL.NamedType;
import org.archware.sosadl.sosADL.RangeType;
import org.archware.sosadl.sosADL.SequenceType;
import org.archware.sosadl.sosADL.SosADLFactory;
import org.archware.sosadl.sosADL.TupleType;
import org.archware.sosadl.tv.typeCheckerHelper.TypeCheckerHelperFactory;
import org.archware.sosadl.tv.typeCheckerHelper.TypeVariable;
import org.archware.sosadl.validation.ErrorCollector;
import org.archware.sosadl.validation.typing.interp.InterpInZ;
import org.archware.utils.MapUtils;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Implementation of a type inference solver for SoSADL.
 * 
 * <p>
 * The type inference solver mechanism assumes the following protocol:
 * <ol>
 * <li>Type variables are created by one of the
 * {@link #createFreshTypeVariable(BinaryOperator, EObject, EStructuralFeature)}
 * or {@link #createFreshDependency(BinaryOperator, TypeVariable)} methods. The
 * solver does not allow any type variable created by another process. The
 * binary operator is used to customize the actual inference solver. Each type
 * variable is attached to a node in the abstract syntax tree for the purpose of
 * error reports.</li>
 * <li>The subtyping constraints are first all collected during the traversal of
 * the abstract syntax tree. Such constraints are added by calling either
 * {@link #addConstraint(DataType, DataType, EObject) or
 * {@link #addConstraint(DataType, DataType, EObject, EStructuralFeature)}.</li>
 * <li>When all the constraints are issued, the {@link #solve()} method must be
 * called to invoke the solver.</li>
 * <li>After the solver returns, the {@link #isSolved()} method returns
 * {@value true} if the inference problem is successfully solved. The
 * {@link #deepSubstitute(DataType)} method can then be used in order to
 * retrieve a fully substituted type.</li>
 * </ol>
 * 
 * <p>
 * The algorithm repeatedly performs the following tasks. At the end of each
 * step, the solver loops back to the beginning of its algorithm in order to
 * take into account the constraints issued at the previous step.
 * <ol>
 * <li>The solver first checks the constraints that do not involve any type
 * variable. When any of the checked type is built using a recursive type
 * constructor, i.e., {@link SequenceType} or {@link TupleType}, new type
 * variables and constraints are issued to trigger the recursive checking. The
 * solver tries to check as many constraints as possible, and to report as many
 * error messages as possible before bailing out.</li>
 * <li>When all the constraints involve at least one type variable, the solver
 * tries to compute a lower bound and an upper bound for each type variable. To
 * do so, when several constraints provide a lower bound to a given type
 * variable, the solver replaces all these constraints with a single one with
 * the union of the lower bounds. It performs the same task for the upper
 * bounds, computing the intersection of the types. After the replacement, the
 * solver goes back to the first step.</li>
 * <li>When all the constraints involve at least one type variable, and each
 * type variable is constrained by at most one lower bound and one upper bound,
 * the solver tries to infer one of the type variable. To select the type
 * variable to be substituted, the solver considers only the non-substituted
 * type variables that do not depend on any non-substituted type variable. Among
 * this type variables, the algorithm choose preferably one that has both lower
 * and upper bounds. If no such type variable exists, it selects one that has at
 * least one bound. If no such type variable exists, it chooses a type variable
 * with no bound.</li>
 * </ol>
 * The algorithm terminates when no more type variable can be inferred.
 * 
 * <p>
 * To implement this algorithm, the constraint are organized in four
 * collections:
 * <ul>
 * <li>{@link #determinedConstraints} contains the constraints that do not
 * involve type variables</li>
 * <li>{@link #lowerBounds} and {@link #upperBounds} map variable names to the
 * lists of constraints, of which one side of the inequation is the
 * corresponding type variable</li>
 * <li>{@link #varVarConstraints} contains the constraints where both sides of
 * inequations are type variables</li>
 * </ul>
 * 
 * <p>
 * Inference errors are reported to a given instance of {@link ErrorCollector}.
 * 
 * @author Jeremy Buisson
 */
public final class TypeInferenceSolver {
	/**
	 * Constraint used by the type inference solver.
	 * 
	 * <p>
	 * In the context of the type inference solver, a constraint is an
	 * inequation stating that type {@value sub} must be a subtype of type
	 * {@value sup}. In addition, the constraint refers to a node in the
	 * abstract syntax tree. This is the one at which errors are reported when
	 * the constraint cannot be satisfied.
	 * 
	 * @author Jeremy Buisson
	 */
	private static final class Constraint {
		public final DataType sub;
		public final DataType sup;
		public final EObject originObject;
		public final EStructuralFeature originFeature;

		public Constraint(DataType sub, DataType sup, EObject originObject, EStructuralFeature originFeature) {
			super();
			this.sub = sub;
			this.sup = sup;
			this.originObject = originObject;
			this.originFeature = originFeature;
		}
	}

	private final ErrorCollector log;
	private final Map<String, DataType> substitutions;
	private final Map<String, TypeVariable> variables;
	private Map<String, Deque<Constraint>> upperBounds;
	private Map<String, Deque<Constraint>> lowerBounds;
	private Deque<Constraint> varVarConstraints;
	private Deque<Constraint> determinedConstraints;
	private final NameGenerator nameGenerator;

	/**
	 * Builds a new instance of the type inference problem
	 * 
	 * <p>
	 * The newly created instance owns no type variable and contains no
	 * constraint.
	 * 
	 * @param log
	 *            collector used to report type errors
	 */
	public TypeInferenceSolver(ErrorCollector log) {
		this.log = log;
		this.substitutions = new ConcurrentHashMap<>();
		this.variables = new ConcurrentHashMap<>();
		this.upperBounds = new ConcurrentHashMap<>();
		this.lowerBounds = new ConcurrentHashMap<>();
		this.varVarConstraints = new ConcurrentLinkedDeque<>();
		this.determinedConstraints = new ConcurrentLinkedDeque<>();
		this.nameGenerator = new SequentialNameGenerator();
	}

	/**
	 * Returns a {@link Stream} that iterates over the type variables owned by
	 * the type inference solver.
	 * 
	 * @return a {@link Stream} of type variables
	 */
	public Stream<TypeVariable> getVariables() {
		return variables.values().stream();
	}

	/**
	 * Records a new constraint.
	 * 
	 * <p>
	 * The new constraint states that {@value sub} is a subtype of {@value sup}.
	 * This method is equivalent to calling
	 * {@link #addConstraint(DataType, DataType, EObject, EStructuralFeature)}
	 * with a null feature.
	 * 
	 * @param sub
	 *            smallest type in the inequation
	 * @param sup
	 *            biggest type in the inequation
	 * @param origin
	 *            node in the abstract syntax tree to which the constraint is
	 *            attached, for error reports
	 */
	public void addConstraint(DataType sub, DataType sup, EObject origin) {
		addConstraint(sub, sup, origin, null);
	}

	/**
	 * Records a new constraint.
	 * 
	 * <p>
	 * The new constraint states that {@value sub} is a subtype of {@value sup}.
	 * 
	 * @param sub
	 *            smallest type in the inequation
	 * @param sup
	 *            biggest type in the inequation
	 * @param originObject
	 *            node in the abstract syntax tree to which the constraint is
	 *            attached, for error reports
	 * @param originFeature
	 *            out-edge of the node in the abstract sytax tree to which the
	 *            constraint is attached, for error reports
	 */
	public void addConstraint(DataType sub, DataType sup, EObject originObject, EStructuralFeature originFeature) {
		Constraint c = new Constraint(reprOrSubstitute(sub), reprOrSubstitute(sup), originObject, originFeature);
		addConstraint(c);
	}

	/**
	 * Records a new constraint.
	 * 
	 * <p>
	 * In the newly created constraint, the smallest type in the inequation is
	 * the owned type variable identified by its name {@value n}. The constraint
	 * is attached to the object and feature to which the type variable is
	 * attached.
	 * 
	 * @param n
	 *            name of the type variable to be used as the smallest type in
	 *            the inequation
	 * @param t
	 *            biggest type in the inequation
	 */
	private void addConstraint(String n, DataType t) {
		TypeVariable v = variables.get(n);
		addConstraint(v, t, v.getConcernedObject(), v.eContainingFeature());
	}

	/**
	 * Records a new constraint.
	 * 
	 * <p>
	 * In the newly created constraint, the greatest type in the inequation is
	 * the owned type variable identified by its name {@value n}. The constraint
	 * is attached to the object and feature to which the type variable is
	 * attached.
	 * 
	 * @param t
	 *            biggest type in the inequation
	 * @param n
	 *            name of the type variable to be used as the greatest type in
	 *            the inequation
	 */
	private void addConstraint(DataType t, String n) {
		TypeVariable v = variables.get(n);
		addConstraint(t, v, v.getConcernedObject(), v.eContainingFeature());
	}

	/**
	 * Records an already existing constraint.
	 * 
	 * This method should be called only by one of
	 * {@link #addConstraint(String, DataType)},
	 * {@link #addConstraint(DataType, DataType, EObject)} or
	 * {@link #addConstraint(DataType, DataType, EObject, EStructuralFeature)}.
	 * It is not intended to be called directly.
	 * 
	 * Depending on the characteristics of the constraint, it is added to:
	 * <ul>
	 * <li>{@link #determinedConstraints} if the two sides of the inequation are
	 * either regular types, or already substituted type variables</li>
	 * <li>{@link #lowerBounds} if the left-hand side of the inequation is
	 * either a regular type or an already substituted type variable, and the
	 * right-hand side is a non-substituted type variable</li>
	 * <li>{@link #upperBounds} if the left-hand side of the inequation is a
	 * non-substituted type variable, and the right-hand side is either a
	 * regular type or an already substituted type variable</li>
	 * <li>{@link #varVarConstraints} if the two sides of the inequation are
	 * non-substituted type variables
	 * </ul>
	 * 
	 * <p>
	 * If the two sides of the inequation refer to the same type object, the
	 * constraint is discarded.
	 * 
	 * @param c
	 *            to-be-added constraint
	 */
	private void addConstraint(Constraint c) {
		debug(typeToString(c.sub) + " <= " + typeToString(c.sup));
		if (c.originObject == null) {
			throw new NullPointerException();
		}
		if (c.originObject.eContainer() == null) {
			throw new IllegalArgumentException(
					"The given EObject (" + c.originObject.toString() + ") is not contained in any object");
		}
		if (c.sub != c.sup) {
			if (isDetermined(c.sub)) {
				if (isDetermined(c.sup)) {
					determinedConstraints.add(c);
				} else {
					TypeVariable sup = (TypeVariable) c.sup;
					if (contains(c.sub, sup)) {
						log.error(nameOf(sup) + ": constraint " + typeToString(c.sub) + "<=" + typeToString(sup)
								+ " contains a cycle", c.originObject, c.originFeature);
					} else {
						multimapAdd(lowerBounds, nameOf(sup), c);
					}
				}
			} else {
				if (isDetermined(c.sup)) {
					TypeVariable sub = (TypeVariable) c.sub;
					if (contains(c.sup, sub)) {
						log.error(nameOf(sub) + ": constraint " + typeToString(sub) + "<=" + typeToString(c.sup)
								+ " contains a cycle", c.originObject, c.originFeature);
					} else {
						multimapAdd(upperBounds, nameOf(sub), c);
					}
				} else {
					varVarConstraints.add(c);
				}
			}
		}
	}

	/**
	 * Checks whether a type is determined.
	 * 
	 * <p>
	 * A type is determined either if it is a regular type, or if it is a
	 * substituted type variable.
	 * 
	 * @param t
	 *            to-be-checked type
	 * @return {@value true} if the type is determined, {@value false} otherwise
	 */
	private boolean isDetermined(DataType t) {
		return substitute(t) != null;
	}

	/**
	 * Returns a representative of a type.
	 * 
	 * <p>
	 * The representative of a type is itself if it is a regular type. The
	 * representative of a type variable is the last type variable in the
	 * substitution chain.
	 * 
	 * @param t
	 *            a type
	 * @return the representative of {@value t}
	 */
	private DataType reprOrType(DataType t) {
		if (t instanceof TypeVariable) {
			return repr((TypeVariable) t);
		} else {
			return t;
		}
	}

	private DataType reprOrSubstitute(DataType t) {
		if (t instanceof TypeVariable) {
			TypeVariable v = repr((TypeVariable) t);
			DataType s = substitute(v);
			if (s == null) {
				return v;
			} else {
				return s;
			}
		} else {
			return t;
		}
	}

	/**
	 * Returns a representative of a type variable.
	 * 
	 * <p>
	 * When a type variable is substituted with another type variable, its
	 * representative is the last type variable in the substitution chain.
	 * 
	 * @param v
	 *            a type variable
	 * @return the representative of {@value v}
	 */
	public TypeVariable repr(TypeVariable v) {
		TypeVariable n = variables.get(v.getName());
		if (n == v || n.getName().equals(v.getName())) {
			DataType r = getLLSubstitute(v);
			if (r != null && r instanceof TypeVariable) {
				TypeVariable x = repr((TypeVariable) r);
				setLLSubstitute(v, x);
				return x;
			} else {
				return v;
			}
		} else {
			TypeVariable r = repr(n);
			setLLSubstitute(v, r);
			return r;
		}
	}

	/**
	 * Returns the name of a type variable.
	 * 
	 * @param v
	 *            a type variable
	 * @return the name of {@value v}
	 */
	private String nameOf(DataType v) {
		return repr((TypeVariable) v).getName();
	}

	/**
	 * Returns the substitute of a type.
	 * 
	 * @param t
	 *            a type
	 * @return the substitute of the representative of {@value t} if {@value t}
	 *         is a type variable, or {@value t} otherwise
	 */
	private DataType substitute(DataType t) {
		if (t != null && t instanceof TypeVariable) {
			TypeVariable r = repr((TypeVariable) t);
			DataType s = getLLSubstitute(r);
			if (s instanceof TypeVariable) {
				throw new IllegalArgumentException();
			}
			return s;
		} else {
			return t;
		}
	}

	/**
	 * Performs complete substitution in a type.
	 * 
	 * <p>
	 * The substitution is done out-of-place, copying the complete structure of
	 * the type. Any occurrence of a type variable is replaced by its
	 * substitute.
	 * 
	 * @param t
	 *            to-be-substituted type
	 * @return the copy of {@value t} in which any type variable is substituted
	 */
	public DataType deepSubstitute(DataType t) {
		if (t == null) {
			throw new IllegalArgumentException();
		} else if (t instanceof TypeVariable) {
			return deepSubstitute(substitute(t));
		} else if (t instanceof RangeType) {
			return copy(t);
		} else if (t instanceof SequenceType) {
			SequenceType s = (SequenceType) t;
			DataType i = deepSubstitute(s.getType());
			return createSequenceType(i);
		} else if (t instanceof BooleanType) {
			return copy(t);
		} else if (t instanceof TupleType) {
			TupleType tt = (TupleType) t;
			return createTupleType(
					tt.getFields().stream().map((f) -> createFieldDecl(f.getName(), deepSubstitute(f.getType())))
							.collect(Collectors.toList()));
		} else if (t instanceof NamedType) {
			return copy(t);
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Streams the type variables that occur in a type.
	 * 
	 * @param t
	 *            to-be-scanned type
	 * @return {@Stream} of type variables.
	 */
	public static Stream<TypeVariable> streamVariables(DataType t) {
		if (t instanceof TypeVariable) {
			return Stream.of((TypeVariable) t);
		} else if (t instanceof SequenceType) {
			return streamVariables(((SequenceType) t).getType());
		} else if (t instanceof TupleType) {
			return ((TupleType) t).getFields().stream().map(FieldDecl::getType)
					.flatMap(TypeInferenceSolver::streamVariables);
		} else {
			return Stream.empty();
		}
	}

	/**
	 * Checks whether a type contains some type variable.
	 * 
	 * @param t
	 *            to-be-checked type
	 * @return {@value true} if {@value t} contains some type variable,
	 *         {@value false} otherwise
	 */
	public static boolean containsVariable(DataType t) {
		if (t instanceof TypeVariable) {
			return true;
		} else if (t instanceof SequenceType) {
			return containsVariable(((SequenceType) t).getType());
		} else if (t instanceof TupleType) {
			return ((TupleType) t).getFields().stream().anyMatch((f) -> containsVariable(f.getType()));
		} else {
			return false;
		}
	}

	/**
	 * Adds an item to a multimap.
	 * 
	 * <p>
	 * The multimap is a map whose values are {@link Deque} of items.
	 * 
	 * @param mm
	 *            the multimap
	 * @param k
	 *            the key of the new item
	 * @param v
	 *            the new item
	 */
	private static <K, V> void multimapAdd(Map<K, Deque<V>> mm, K k, V v) {
		mm.computeIfAbsent(k, (a) -> new ConcurrentLinkedDeque<>()).add(v);
	}

	/**
	 * Creates a new type variable with a unique fresh name.
	 * 
	 * <p>
	 * The name of the new type variable is generated by {@link #nameGenerator}.
	 * Its solver is the given parameter.
	 * 
	 * <p>
	 * The methods performs sanity check to ensure the freshness of the
	 * generated name. It also ensures the ownership of the created type
	 * variable.
	 * 
	 * <p>
	 * This method is not intended to be called directly as it does not attach
	 * the created variable to any node and out-edge in the abstract syntax
	 * tree. Methods
	 * {@link #createFreshTypeVariable(BinaryOperator, EObject, EStructuralFeature)}
	 * or {@link #createFreshDependency(BinaryOperator, TypeVariable)} should be
	 * used instead.
	 * 
	 * @param solver
	 *            function used to compute the substitute for the new type
	 *            variable
	 * @return the newly created type variable
	 */
	private TypeVariable createFreshTypeVariable(BinaryOperator<Optional<DataType>> solver) {
		TypeVariable r = TypeCheckerHelperFactory.eINSTANCE.createTypeVariable();
		r.setName(nameGenerator.get());
		if (variables.put(r.getName(), r) != null) {
			throw new IllegalArgumentException("the variable name is not fresh");
		}
		setLLSolver(r, solver);
		return r;
	}

	/**
	 * Creates a new type variable with a unique fresh name.
	 * 
	 * @param solver
	 *            function used to compute the substitute for the new type
	 *            variable
	 * @param concernedObject
	 *            the node in the abstract syntax tree to which the new type
	 *            variable is attached
	 * @param concernedFeature
	 *            the out-edge of the node in the abstract syntax tree to which
	 *            the new type variable is attached
	 * @return the newly created type variable
	 */
	public TypeVariable createFreshTypeVariable(BinaryOperator<Optional<DataType>> solver, EObject concernedObject,
			EStructuralFeature concernedFeature) {
		TypeVariable v = createFreshTypeVariable(solver);
		v.setConcernedObject(concernedObject);
		v.setConcernedStructuralFeature(concernedFeature);
		return v;
	}

	/**
	 * Creates a new type variable with a unique fresh name and add it to the
	 * dependencies of another type variable.
	 * 
	 * <p>
	 * The created type variable is added to the dependencies of
	 * {@value dependent}. It is attached to the same object and feature as
	 * {@value dependent}.
	 * 
	 * @param solver
	 *            function used to compute the substitute for the new type
	 *            variable
	 * @param dependent
	 *            a type variable that is going to depend on the newly created
	 *            type variable
	 * @return the created type variable
	 */
	public TypeVariable createFreshDependency(BinaryOperator<Optional<DataType>> solver, TypeVariable dependent) {
		TypeVariable v = createFreshTypeVariable(solver, dependent.getConcernedObject(),
				dependent.getConcernedStructuralFeature());
		getLLDependencies(dependent).add(v);
		return v;
	}

	/**
	 * Checks whether the inference problem is solved.
	 * 
	 * <p>
	 * The inference problem is solved if all the type variables it owns are
	 * substituted.
	 * 
	 * @return {@value true} if the problem is solved, {@value false} otherwise
	 */
	public boolean isSolved() {
		return variables.values().stream().allMatch(this::isDetermined);
	}

	/**
	 * A specification to infer a specific type variable.
	 * 
	 * <p>
	 * The specification contains a reference to the type variable, and
	 * optionally a lower bound and an upper bound for this type variable.
	 * 
	 * @author Jeremy Buisson
	 */
	private static class VariableSpec {
		public final String name;
		public final Optional<Constraint> lowerBound;
		public final boolean hasSmallerVariables;
		public final TypeVariable variable;
		public final Optional<Constraint> upperBound;
		public final boolean hasGreaterVariables;

		public VariableSpec(String name, Optional<Constraint> lowerBound, boolean hasSmallerVariables,
				TypeVariable variable, Optional<Constraint> upperBound, boolean hasGreaterVariables) {
			super();
			this.name = name;
			this.lowerBound = lowerBound;
			this.hasSmallerVariables = hasSmallerVariables;
			this.variable = variable;
			this.upperBound = upperBound;
			this.hasGreaterVariables = hasGreaterVariables;
		}
	}

	/**
	 * Returns the optional value of a collection.
	 * 
	 * <p>
	 * This method assumes and checks that the given collection contains at most
	 * one value.
	 * 
	 * @param c
	 *            a collection
	 * @return the value contained by {@value c}, or {@value Optional.empty()}
	 *         if the collection if empty.
	 */
	private static <T> Optional<T> getTheOneOf(Collection<T> c) {
		if (c.size() > 1) {
			throw new IllegalArgumentException("the collection is assumed to contain at most one value");
		} else {
			return c.stream().findAny();
		}
	}

	/**
	 * Infers a type for each type variable.
	 * 
	 * <p>
	 * This method implements the inference algorithm. At each step, the
	 * algorithm first checks for the constraints that have determined types in
	 * both sides using {@link #checkDeterminedConstraint(Constraint)}. When
	 * there are not such constraints anymore, the method looks for type
	 * variables that are constrained by either at least two lower bounds or at
	 * least two upper bounds. The sets of lower or upper bounds are collapsed
	 * using {@link #union(String, Deque)} and {@link #intersect(String, Deque)}
	 * respectively. When there are not such type variables anymore, the method
	 * tries to substitute one variable. The more a type variable has bounds
	 * (either lower bound, upper bound, both or none), the more it is likely
	 * selected by the algorithm. The chosen type variable is inferred by a
	 * custom solver {@link TypeVariable#getSolver()}, which is specific to the
	 * variable. After {@link #doSubstitute(TypeVariable, DataType)} records the
	 * substitution, {@link #reSortConstraints()} is invoked to rebuild the sets
	 * of constraints.
	 * 
	 * <p>
	 * The algorithm is repeated until all the type variables are substituted,
	 * according to {@link #isSolved()}.
	 */
	public void solve() {
		for (;;) {
			if (!determinedConstraints.isEmpty()) {
				// 1) check the constraints that are fully determined, if any
				Deque<Constraint> dc = determinedConstraints;
				determinedConstraints = new ConcurrentLinkedDeque<>();
				// use reduce instead of allMatch in order to ensure that all
				// the constraints are tested, and therefore report as many
				// errors as possible in a single step
				if (dc.stream().reduce(true, (b, x) -> checkDeterminedConstraint(x) && b, (a, b) -> a && b)) {
					continue;
				} else {
					return;
				}
			} else {
				Optional<Pair<Constraint, Constraint>> p = varVarConstraints.stream()
						.map((l) -> varVarConstraints.stream().filter((r) -> l != r).filter((r) -> l.sup == r.sub)
								.filter((r) -> varVarConstraints.stream()
										.noneMatch((c) -> c.sub == l.sub && c.sup == r.sup))
								.findAny().map((r) -> new Pair<>(l, r)))
						.filter(Optional::isPresent).findAny().flatMap((x) -> x);
				if (p.isPresent()) {
					// 2) find two var-var constraints x <= y /\ y <= z such
					// that x <= z is not in the set of constraints yet
					Pair<Constraint, Constraint> cc = p.get();
					TypeVariable l = (TypeVariable) cc.getA().sub;
					TypeVariable r = (TypeVariable) cc.getB().sup;
					if (l == r) {
						// 2.a) if x = z, then substitute x/z with y
						debug(typeToString(l) + " := " + typeToString(r));
						doSubstituteVars(l, (TypeVariable) cc.getA().sup);
						reSortConstraints();
						continue;
					} else {
						// 2.b) otherwise, add the new constraint x <= z
						addConstraint(l, r, cc.getA().originObject, cc.getA().originFeature);
						continue;
					}
				} else {
					Optional<Map.Entry<String, Deque<Constraint>>> cub = upperBounds.entrySet().stream()
							.filter((e) -> e.getValue().size() >= 2).findAny();
					if (cub.isPresent()) {
						// 3) merge the constraints when a single variable has
						// several (at least two) upper bounds
						Map.Entry<String, Deque<Constraint>> e = cub.get();
						Deque<Constraint> constraints = upperBounds.remove(e.getKey());
						Optional<DataType> inter = intersect(e.getKey(), constraints);
						inter.ifPresent((i) -> addConstraint(e.getKey(), i));
						if (!inter.isPresent()) {
							return;
						} else {
							continue;
						}
					} else {
						Optional<Map.Entry<String, Deque<Constraint>>> clb = lowerBounds.entrySet().stream()
								.filter((e) -> e.getValue().size() >= 2).findAny();
						if (clb.isPresent()) {
							// 4) merge the constraints when a single variable
							// has
							// several (at least two) lower bounds
							Map.Entry<String, Deque<Constraint>> e = clb.get();
							Deque<Constraint> constraints = lowerBounds.remove(e.getKey());
							Optional<DataType> union = union(e.getKey(), constraints);
							union.ifPresent((i) -> addConstraint(i, e.getKey()));
							if (!union.isPresent()) {
								return;
							} else {
								continue;
							}
						} else {
							// each type variable has at most one lower bound
							// and
							// one upper bound; find the variables whose
							// dependencies are determined
							Deque<VariableSpec> v = variables.entrySet().stream()
									.filter((e) -> getLLSubstitute(e.getValue()) == null
											&& getLLDependencies(e.getValue()).stream().allMatch(this::isDetermined))
									.map((e) -> new VariableSpec(e.getKey(),
											getTheOneOf(lowerBounds.getOrDefault(e.getKey(),
													new ConcurrentLinkedDeque<>())),
											varVarConstraints.stream()
													.anyMatch((c) -> contains(c.sup, repr(e.getValue()))),
											e.getValue(),
											getTheOneOf(upperBounds.getOrDefault(e.getKey(),
													new ConcurrentLinkedDeque<>())),
											varVarConstraints.stream()
													.anyMatch((c) -> contains(c.sub, repr(e.getValue())))))
									.collect(Collectors.toCollection(ConcurrentLinkedDeque::new));
							// try first those variables that have a lower bound
							// and
							// an upper bound, but do not appear in any var-var
							// constraint
							Optional<VariableSpec> toSolve = v.stream().filter((x) -> x.lowerBound.isPresent()
									&& x.upperBound.isPresent() && !x.hasSmallerVariables && !x.hasGreaterVariables)
									.findAny();
							if (!toSolve.isPresent()) {
								// if no such variable exist, try to find one
								// that
								// has either a lower bound or an upper bound,
								// but
								// no variable as the same kind of bound
								toSolve = v.stream().filter((x) -> (x.lowerBound.isPresent() && !x.hasSmallerVariables)
										|| (x.upperBound.isPresent() && !x.hasGreaterVariables)).findAny();
								if (!toSolve.isPresent()) {
									toSolve = v.stream().findAny();
									if (!toSolve.isPresent()) {
										if (isSolved()) {
											return;
										} else {
											// if there is no eligible type
											// variable,
											// then don't know what to do...
											// the situation is probably due
											// to
											// the
											// fact
											// that there is a dependency
											// cycle
											// between
											// type variables
											throw new IllegalArgumentException(
													"there is probably a dependency cycle between type variables");
										}
									}
								}
							}
							VariableSpec x = toSolve.get();
							Optional<DataType> lb = x.lowerBound.map((c) -> c.sub);
							Optional<DataType> ub = x.upperBound.map((c) -> c.sup);
							Optional<DataType> rlb = lb.filter(
									(t) -> (!x.hasSmallerVariables) || (!ub.isPresent()) || x.hasGreaterVariables);
							Optional<DataType> rub = ub.filter(
									(t) -> (!x.hasGreaterVariables) || (!lb.isPresent()) || x.hasSmallerVariables);
							Optional<DataType> solution = getLLSolver(x.variable).apply(rlb, rub);
							if (solution.isPresent()) {
								DataType t = solution.get();
								if (contains(t, repr(x.variable))) {
									// the substitute is not allowed to contain
									// the
									// substituted variable
									log.error(
											x.name + ": cannot substitute " + typeToString(x.variable) + " with "
													+ typeToString(t),
											x.variable.getConcernedObject(),
											x.variable.getConcernedStructuralFeature());
									return;
								} else {
									// don't remove any of the
									// taken-into-account
									// constraints, since reSortConstraints will
									// move these constraints (after
									// substitution)
									// to the determined set, such that the
									// correctness
									// of the solution is checked at the next
									// iteration
									debug(typeToString(x.variable) + " := " + typeToString(t) + "[" + typeToString(rlb)
											+ " ... " + typeToString(rub) + "] [" + typeToString(lb) + " / "
											+ x.hasSmallerVariables + " ... " + typeToString(ub) + " / "
											+ x.hasGreaterVariables + "]");
									doSubstitute(x.variable, t);
									reSortConstraints();
									continue;
								}
							} else {
								// if the variable-specific solver does not
								// return a
								// inferred type, this is the indication that an
								// error has occurred... nothing else can be
								// done in
								// such a case. just in case, issue an
								// additional
								// error message
								log.error(x.variable.getName() + ": cannot infer the type",
										x.variable.getConcernedObject(), x.variable.getConcernedStructuralFeature());
								return;
							}
						}
					}
				}
			}
		}
	}

	private void doSubstituteVars(TypeVariable a, TypeVariable b) {
		TypeVariable ra = repr(a);
		if (ra != a) {
			throw new IllegalArgumentException();
		} else if (getLLSubstitute(ra) != null) {
			throw new IllegalArgumentException();
		}
		TypeVariable rb = repr(b);
		if (rb != b) {
			throw new IllegalArgumentException();
		} else if (getLLSubstitute(rb) != null) {
			throw new IllegalArgumentException();
		}
		String na = ra.getName();
		String nb = rb.getName();
		int cmp = na.compareTo(nb);
		if (cmp < 0) {
			setLLSubstitute(a, b);
		} else if (cmp > 0) {
			setLLSubstitute(b, a);
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Records a substitution.
	 * 
	 * <p>
	 * The method checks that the type variable has not been substituted
	 * already.
	 * 
	 * @param a
	 *            the substituted variable
	 * @param b
	 *            the substitute type
	 */
	private void doSubstitute(TypeVariable a, DataType b) {
		if (getLLSubstitute(a) != null) {
			throw new IllegalArgumentException("the type variable should not have been substituted already");
		} else {
			if (b instanceof TypeVariable) {
				throw new IllegalArgumentException();
			}
			setLLSubstitute(a, reprOrType(b));
		}
	}

	/**
	 * Checks whether two types are equal after substitution of all the type
	 * variables.
	 * 
	 * @param l
	 *            a type
	 * @param r
	 *            another type
	 * @return {@value true} if the types are equal, {@value false} otherwise
	 */
	public boolean equalsUpToSubst(DataType l, DataType r) {
		if (l == r) {
			return true;
		} else if (l instanceof BooleanType && r instanceof BooleanType) {
			return true;
		} else if (l instanceof NamedType && r instanceof NamedType) {
			return ((NamedType) l).getName().equals(((NamedType) r).getName());
		} else if (l instanceof RangeType && r instanceof RangeType) {
			RangeType rl = (RangeType) l;
			RangeType rr = (RangeType) r;
			return isEq(rl.getVmin(), rr.getVmin()) && isEq(rl.getVmax(), rr.getVmax());
		} else if (l instanceof SequenceType && r instanceof SequenceType) {
			return equalsUpToSubst(((SequenceType) l).getType(), ((SequenceType) r).getType());
		} else if (l instanceof TupleType && r instanceof TupleType) {
			Map<String, Optional<FieldDecl>> lm = getFieldMap((TupleType) l);
			Map<String, Optional<FieldDecl>> rm = getFieldMap((TupleType) r);
			return MapUtils.merge(lm, rm).entrySet().stream().anyMatch((e) -> e.getValue().a.isPresent()
					&& e.getValue().b.isPresent() && e.getValue().a.get().isPresent()
					&& e.getValue().b.get().isPresent()
					&& equalsUpToSubst(e.getValue().a.get().get().getType(), e.getValue().b.get().get().getType()));
		} else if (l instanceof TypeVariable) {
			if (r instanceof TypeVariable) {
				return ((TypeVariable) l).getName().equals(((TypeVariable) r).getName());
			} else {
				DataType ls = getLLSubstitute((TypeVariable) l);
				if (ls == null) {
					return false;
				} else {
					return equalsUpToSubst(ls, r);
				}
			}
		} else if (r instanceof TypeVariable) {
			DataType rs = getLLSubstitute((TypeVariable) r);
			if (rs == null) {
				return false;
			} else {
				return equalsUpToSubst(l, rs);
			}
		} else {
			return false;
		}
	}

	/**
	 * Checks whether a type contains a given type variable.
	 * 
	 * @param r
	 *            a type
	 * @param l
	 *            a type variable
	 * @return {@value true} if {@value r} contains {@value l}, {@value false}
	 *         otherwise
	 */
	public boolean contains(DataType r, TypeVariable l) {
		if (l == r) {
			return true;
		} else if (r instanceof TypeVariable) {
			return repr((TypeVariable) r).getName().equals(l.getName());
		} else if (r instanceof BooleanType) {
			return false;
		} else if (r instanceof RangeType) {
			return false;
		} else if (r instanceof NamedType) {
			return false;
		} else if (r instanceof SequenceType) {
			return contains(((SequenceType) r).getType(), l);
		} else if (r instanceof TupleType) {
			return ((TupleType) r).getFields().stream().map(FieldDecl::getType).anyMatch((x) -> contains(x, l));
		} else {
			throw new IllegalArgumentException("unknown type");
		}
	}

	/**
	 * Rebuilds the sets of constraints.
	 * 
	 * <p>
	 * After a substitution, some constraint may not be in the right set. This
	 * method is intended to fix this issue. To do so, it clears all the sets,
	 * and adds again all the constraints.
	 */
	private void reSortConstraints() {
		Map<String, Deque<Constraint>> oldUpperBounds = upperBounds;
		Map<String, Deque<Constraint>> oldLowerBounds = lowerBounds;
		Deque<Constraint> oldVarVarConstraints = varVarConstraints;
		upperBounds = new ConcurrentHashMap<>();
		lowerBounds = new ConcurrentHashMap<>();
		varVarConstraints = new ConcurrentLinkedDeque<>();
		Stream<Stream<Deque<Constraint>>> s = Stream.of(oldUpperBounds.values().stream(),
				oldLowerBounds.values().stream(), Stream.of(oldVarVarConstraints));
		s.flatMap((x) -> x).flatMap(Deque::stream)
				.forEach((c) -> addConstraint(c.sub, c.sup, c.originObject, c.originFeature));
	}

	/**
	 * Solves a type variable.
	 * 
	 * <p>
	 * This solver returns the upper bound is present. If not, it returns the
	 * lower bound if present. If not, it reports it cannot infer any type for
	 * the considered type variable.
	 * 
	 * @param lower
	 *            lower bound of the type variable
	 * @param upper
	 *            upper bound of the type variable
	 * @return the inferred type
	 */
	public static Optional<DataType> upperOrLowerSolver(Optional<DataType> lower, Optional<DataType> upper) {
		if (upper.isPresent()) {
			return upper;
		} else if (lower.isPresent()) {
			return lower;
		} else {
			return Optional.empty();
		}
	}

	/**
	 * Returns the union of the left-hand sides of a collection of constraints.
	 * 
	 * <p>
	 * The union of a collection of types is a type that contains all those of
	 * the collection. Namely, the union of range types is the union of the
	 * ranges. Sequence types are covariant, so the union of sequence types is
	 * the sequence type whose item type is the union of the item types. The
	 * union of tuple types contains only the intersection of the sets of
	 * fields; the resulting type of a field is the union of the types of this
	 * field.
	 * 
	 * @param n
	 *            name of the concerned type variable
	 * @param constraints
	 *            collection of constraints
	 * @return the union type
	 */
	private Optional<DataType> union(String n, Deque<Constraint> constraints) {
		TypeVariable v = variables.get(n);
		if (constraints.stream().allMatch((x) -> x.sub instanceof SequenceType)) {
			TypeVariable beta = createFreshDependency(TypeInferenceSolver::upperOrLowerSolver, v);
			constraints.stream().forEach(
					(c) -> addConstraint(((SequenceType) c.sub).getType(), beta, c.originObject, c.originFeature));
			return Optional.of(createSequenceType(beta));
		} else if (constraints.stream().allMatch((x) -> x.sub instanceof BooleanType)) {
			return Optional.of(createBooleanType());
		} else if (constraints.stream().allMatch((x) -> x.sub instanceof RangeType)) {
			Expression mi = constraints.stream().map((x) -> ((RangeType) x.sub).getVmin())
					.reduce(TypeInferenceSolver::min).get();
			Expression ma = constraints.stream().map((x) -> ((RangeType) x.sub).getVmax())
					.reduce(TypeInferenceSolver::max).get();
			return Optional.of(createRangeType(mi, ma));
		} else if (constraints.stream().allMatch((x) -> x.sub instanceof TupleType)) {
			return constraints.stream().map((c) -> (TupleType) c.sub).reduce((a, b) -> tupleTypeUnion(a, b, v))
					.map((x) -> (DataType) x);
		} else if (constraints.stream().allMatch((x) -> x.sub instanceof NamedType)) {
			List<String> names = constraints.stream().map((x) -> ((NamedType) x.sub).getName()).distinct()
					.collect(Collectors.toList());
			if (names.size() == 1) {
				return constraints.stream().findAny().map((x) -> x.sub);
			} else {
				return incompatibleTypeConstraintsSub(n, constraints, v);
			}
		} else {
			return incompatibleTypeConstraintsSub(n, constraints, v);
		}
	}

	private Optional<DataType> incompatibleTypeConstraintsSub(String n, Deque<Constraint> constraints, TypeVariable v) {
		String err = n + ": incompatible type constraints ("
				+ constraints.stream().map((c) -> c.sub).flatMap(TypeInferenceSolver::typeConstructor).distinct()
						.map((s) -> s + " <= " + typeToString(v)).collect(Collectors.joining(", "))
				+ ")";
		constraints.forEach((c) -> {
			log.error(err, c.originObject, c.originFeature);
		});
		return Optional.empty();
	}

	/**
	 * Returns the union of two tuple types.
	 * 
	 * <p>
	 * The union of tuple types contains only the intersection of the sets of
	 * fields; the resulting type of a field is the union of the types of this
	 * field.
	 * 
	 * @param t1
	 *            a tuple type
	 * @param t2
	 *            another tuple type
	 * @param w
	 *            the concerned type variable
	 * @return the union of {@value t1} and {@value t2}
	 */
	private TupleType tupleTypeUnion(TupleType t1, TupleType t2, TypeVariable w) {
		Map<String, Optional<FieldDecl>> f2 = getFieldMap(t2);
		List<FieldDecl> fields = t1.getFields().stream().flatMap((l) -> {
			Optional<FieldDecl> r = f2.getOrDefault(l.getName(), Optional.empty());
			Optional<FieldDecl> s = r.map((y) -> {
				TypeVariable v = createFreshDependency(TypeInferenceSolver::upperOrLowerSolver, w);
				addConstraint(l.getType(), v, v.getConcernedObject(), v.getConcernedStructuralFeature());
				addConstraint(y.getType(), v, v.getConcernedObject(), v.getConcernedStructuralFeature());
				return createFieldDecl(l.getName(), v);
			});
			Optional<Stream<FieldDecl>> x = s.map(Stream::of);
			return x.orElse(Stream.empty());
		}).collect(Collectors.toList());
		return createTupleType(fields);
	}

	/**
	 * Returns a map of the field declarations of a tuple type, indexed by their
	 * name.
	 * 
	 * @param t1
	 *            a tuple type
	 * @return the map of field declarations
	 */
	private static Map<String, Optional<FieldDecl>> getFieldMap(TupleType t1) {
		return t1.getFields().stream().collect(Collectors.toConcurrentMap(FieldDecl::getName, Optional::of));
	}

	/**
	 * Returns the intersection of the right-hand sides of a collection of
	 * constraints.
	 * 
	 * <p>
	 * The intersection of a collection of types is a type whose values are
	 * instances of all types in that collection. Namely, the intersection of
	 * range types is the intersection of the ranges. Sequence types are
	 * covariant, so the intersection of sequence types is the sequence type
	 * whose item type is the intersection of the item types. The intersection
	 * of tuple types contains the fields of all the tuple types; the resulting
	 * type of a field is the intersection of the types of this field.
	 * 
	 * @param n
	 *            name of the concerned type variable
	 * @param constraints
	 *            collection of constraints
	 * @return the intersection type
	 */
	private Optional<DataType> intersect(String n, Deque<Constraint> constraints) {
		TypeVariable v = variables.get(n);
		if (constraints.stream().allMatch((x) -> x.sup instanceof SequenceType)) {
			TypeVariable beta = createFreshDependency(TypeInferenceSolver::upperOrLowerSolver, v);
			constraints.stream().forEach(
					(c) -> addConstraint(beta, ((SequenceType) c.sup).getType(), c.originObject, c.originFeature));
			return Optional.of(createSequenceType(beta));
		} else if (constraints.stream().allMatch((x) -> x.sup instanceof BooleanType)) {
			return Optional.of(createBooleanType());
		} else if (constraints.stream().allMatch((x) -> x.sup instanceof RangeType)) {
			Expression mi = constraints.stream().map((x) -> ((RangeType) x.sup).getVmin())
					.reduce(TypeInferenceSolver::max).get();
			Expression ma = constraints.stream().map((x) -> ((RangeType) x.sup).getVmax())
					.reduce(TypeInferenceSolver::min).get();
			if (isLe(mi, ma)) {
				return Optional.of(createRangeType(mi, ma));
			} else {
				constraints.forEach((c) -> {
					log.error(n + ": the intersection of the ranges is empty", c.originObject, c.originFeature);
				});
				return Optional.empty();
			}
		} else if (constraints.stream().allMatch((x) -> x.sup instanceof TupleType)) {
			Stream<Pair<Constraint, FieldDecl>> s = constraints.stream().flatMap(TypeInferenceSolver::getFieldDecls);
			Map<String, List<Pair<Constraint, FieldDecl>>> fields = s
					.collect(Collectors.groupingBy((f) -> f.b.getName()));
			return Optional.of(createTupleType(fields.entrySet().stream().map((e) -> {
				TypeVariable b = createFreshDependency(TypeInferenceSolver::upperOrLowerSolver, v);
				e.getValue().forEach((f) -> {
					addConstraint(b, f.b.getType(), f.a.originObject, f.a.originFeature);
				});
				return createFieldDecl(e.getKey(), v);
			}).collect(Collectors.toList())));
		} else if (constraints.stream().allMatch((x) -> x.sup instanceof NamedType)) {
			List<String> names = constraints.stream().map((x) -> ((NamedType) x.sup).getName()).distinct()
					.collect(Collectors.toList());
			if (names.size() == 1) {
				return constraints.stream().findAny().map((x) -> x.sup);
			} else {
				return incompatibleTypeConstraintSup(n, constraints, v);
			}
		} else {
			return incompatibleTypeConstraintSup(n, constraints, v);
		}
	}

	private Optional<DataType> incompatibleTypeConstraintSup(String n, Deque<Constraint> constraints, TypeVariable v) {
		String err = n + ": incompatible type constraints ("
				+ constraints.stream().map((c) -> c.sup).flatMap(TypeInferenceSolver::typeConstructor).distinct()
						.map((s) -> typeToString(v) + "<=" + s).collect(Collectors.joining(", "))
				+ ")";
		constraints.forEach((c) -> {
			log.error(err, c.originObject, c.originFeature);
		});
		return Optional.empty();
	}

	/**
	 * Returns a compact string representation of a string, wrapped in a
	 * {@link Stream}.
	 * 
	 * @param t
	 *            a type
	 * @return the string representation of {@value t}
	 */
	private static Stream<String> typeConstructor(DataType t) {
		if (t instanceof BooleanType) {
			return Stream.of("boolean");
		} else if (t instanceof TupleType) {
			return Stream.of("tuple");
		} else if (t instanceof SequenceType) {
			return Stream.of("sequence");
		} else if (t instanceof RangeType) {
			return Stream.of("integer");
		} else if (t instanceof NamedType) {
			return Stream.of(((NamedType) t).getName());
		} else {
			throw new IllegalArgumentException("unknown type constructor");
		}
	}

	/**
	 * Returns a {@link Stream} of pairs of field declarations taken from a
	 * constraint involving a tuple type.
	 * 
	 * @param x
	 *            a constraint
	 * @return the produced {@link Stream}
	 */
	private static Stream<Pair<Constraint, FieldDecl>> getFieldDecls(Constraint x) {
		Stream<FieldDecl> s = ((TupleType) x.sup).getFields().stream();
		return s.map((y) -> new Pair<>(x, y));
	}

	/**
	 * Returns the smallest expression.
	 * 
	 * @param l
	 *            an expression
	 * @param r
	 *            another expression
	 * @return the smallest expression of {@value l} and {@value r}
	 */
	private static Expression min(Expression l, Expression r) {
		if (InterpInZ.le(l, r)) {
			return l;
		} else {
			return r;
		}
	}

	/**
	 * Returns the greatest expression.
	 * 
	 * @param l
	 *            an expression
	 * @param r
	 *            another expression
	 * @return the greatest expression of {@value l} and {@value r}
	 */
	private static Expression max(Expression l, Expression r) {
		if (InterpInZ.le(r, l)) {
			return l;
		} else {
			return r;
		}
	}

	/**
	 * Checks a constraint whose two sides are determined types.
	 * 
	 * This methods checks whether the two types of the constraints are
	 * compatible, after substitution. In case the types are range types, the
	 * methods checks for range inclusion. In the case of sequence types, the
	 * method issues a new constraint for the item types. In the case of tuple
	 * types, the method checks for the inclusion for the sets of field
	 * declarations. It issues a new constraint for each field declaration.
	 * 
	 * @param c
	 *            a constraint
	 * @return {@value true} if the constraint is satisfied, {@value false} if
	 *         an error is detected
	 */
	private boolean checkDeterminedConstraint(Constraint c) {
		DataType sub = substitute(c.sub);
		DataType sup = substitute(c.sup);
		if (sub == sup) {
			return true;
		} else if (sub instanceof BooleanType && sup instanceof BooleanType) {
			return true;
		} else if (sub instanceof NamedType && sup instanceof NamedType) {
			return ((NamedType) sub).getName().equals(((NamedType) sup).getName());
		} else if (sub instanceof SequenceType && sup instanceof SequenceType) {
			addConstraint(((SequenceType) sub).getType(), ((SequenceType) sup).getType(), c.originObject,
					c.originFeature);
			return true;
		} else if (sub instanceof TupleType && sup instanceof TupleType) {
			TupleType l = (TupleType) sub;
			TupleType r = (TupleType) sup;
			Map<String, Optional<FieldDecl>> lfields = getFieldMap(l);
			// use reduce rather than allMatch in order to ensure that all the
			// fields are checked, such that all the detectable errors are
			// reported at once
			return r.getFields().stream().reduce(true, (b, rf) -> {
				Optional<FieldDecl> olf = lfields.getOrDefault(rf.getName(), Optional.empty());
				if (olf.isPresent()) {
					olf.ifPresent((lf) -> addConstraint(lf.getType(), rf.getType(), c.originObject, c.originFeature));
					return b;
				} else {
					log.error("incompatible tuple types: field `" + rf.getName() + "' is missing", c.originObject,
							c.originFeature);
					return false;
				}
			}, (a, b) -> a && b);
		} else if (sub instanceof RangeType && sup instanceof RangeType) {
			RangeType l = (RangeType) sub;
			RangeType r = (RangeType) sup;
			if (!isLe(r.getVmin(), l.getVmin()) || !isLe(l.getVmax(), r.getVmax())) {
				log.error("incompatible ranges: {" + InterpInZ.eval(l.getVmin()) + ".." + InterpInZ.eval(l.getVmax())
						+ "} is not included in {" + InterpInZ.eval(r.getVmin()) + ".." + InterpInZ.eval(r.getVmax())
						+ "}", c.originObject, c.originFeature);
				return false;
			} else {
				return true;
			}
		} else if (sub instanceof BooleanType && sup instanceof BooleanType) {
			return true;
		} else {
			log.error("type " + typeToString(sub) + " is not a subtype of " + typeToString(sup), c.originObject,
					c.originFeature);
			return false;
		}
	}

	/**
	 * Checks whether an expression is smaller or equal to another one.
	 * 
	 * @param l
	 *            an expression
	 * @param r
	 *            another expression
	 * @return {@value true} if {@value l} is smaller or equal to {@value r},
	 *         {@value false} otherwise
	 */
	private static boolean isLe(Expression l, Expression r) {
		return InterpInZ.le(l, r);
	}

	/**
	 * Checks whether an expression is equal to another one.
	 * 
	 * @param l
	 *            an expression
	 * @param r
	 *            another expression
	 * @return {@value true} if {@value l} is equal to {@value r},
	 *         {@value false} otherwise
	 */
	private static boolean isEq(Expression l, Expression r) {
		return InterpInZ.eq(l, r);
	}

	/**
	 * Returns a string representation of a type.
	 * 
	 * @param t
	 *            a type
	 * @return a string representation of {@value t}
	 */
	public static String typeToString(DataType t) {
		if (t instanceof BooleanType) {
			return "boolean";
		} else if (t instanceof RangeType) {
			RangeType r = (RangeType) t;
			return "integer { " + InterpInZ.eval(r.getVmin()) + " .. " + InterpInZ.eval(r.getVmax()) + " }";
		} else if (t instanceof TupleType) {
			TupleType tt = (TupleType) t;
			return "tuple { " + tt.getFields().stream().map((x) -> x.getName() + ": " + typeToString(x.getType()))
					.collect(Collectors.joining(", ")) + " }";
		} else if (t instanceof SequenceType) {
			SequenceType s = (SequenceType) t;
			return "sequence { " + typeToString(s.getType()) + " }";
		} else if (t instanceof TypeVariable) {
			return "'" + ((TypeVariable) t).getName();
		} else if (t instanceof NamedType) {
			return ((NamedType) t).getName();
		} else {
			return "unknown type";
		}
	}

	private static String typeToString(Optional<DataType> t) {
		return t.map(TypeInferenceSolver::typeToString).orElse("-");
	}

	/**
	 * Copy of a type, unless it is a type variable.
	 * 
	 * @param x
	 *            a type
	 * @return a copy of {@value x}
	 */
	public static <T extends EObject> T copy(T x) {
		return EcoreUtil.copy(x);
	}

	private static SequenceType createSequenceType(DataType t) {
		SequenceType ret = SosADLFactory.eINSTANCE.createSequenceType();
		ret.setType(copy(t));
		return ret;
	}

	private static BooleanType createBooleanType() {
		return SosADLFactory.eINSTANCE.createBooleanType();
	}

	private static RangeType createRangeType(Expression mi, Expression ma) {
		RangeType ret = SosADLFactory.eINSTANCE.createRangeType();
		ret.setVmin(copy(mi));
		ret.setVmax(copy(ma));
		return ret;
	}

	private static FieldDecl createFieldDecl(String name, DataType t) {
		FieldDecl ret = SosADLFactory.eINSTANCE.createFieldDecl();
		ret.setName(name);
		ret.setType(copy(t));
		return ret;
	}

	private static TupleType createTupleType(List<FieldDecl> f) {
		TupleType ret = SosADLFactory.eINSTANCE.createTupleType();
		ret.getFields().addAll(f.stream().map(TypeInferenceSolver::copy).collect(Collectors.toList()));
		return ret;
	}

	private DataType getLLSubstitute(TypeVariable v) {
		return substitutions.get(v.getName());
	}

	private void setLLSubstitute(TypeVariable v, DataType t) {
		substitutions.put(v.getName(), t);
	}

	private void setLLSolver(TypeVariable v, BinaryOperator<Optional<DataType>> solver) {
		variables.get(v.getName()).setSolver(solver);
	}

	private BinaryOperator<Optional<DataType>> getLLSolver(TypeVariable v) {
		return variables.get(v.getName()).getSolver();
	}

	private EList<TypeVariable> getLLDependencies(TypeVariable dependent) {
		return variables.get(dependent.getName()).getDependencies();
	}

	public void addDependency(TypeVariable dependent, TypeVariable dependence) {
		getLLDependencies(dependent).add(dependence);
	}

	private static void debug(String msg) {
		// System.out.println("TypeInferenceSolver: " + msg);
	}
}
