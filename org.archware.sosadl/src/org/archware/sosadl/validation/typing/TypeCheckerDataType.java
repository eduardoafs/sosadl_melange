package org.archware.sosadl.validation.typing;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.archware.sosadl.generator.SosADLPrettyPrinterGenerator;
import org.archware.sosadl.sosADL.BooleanType;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.sosADL.NamedType;
import org.archware.sosadl.sosADL.RangeType;
import org.archware.sosadl.sosADL.SequenceType;
import org.archware.sosadl.sosADL.TupleType;
import org.archware.sosadl.tv.typeCheckerHelper.TypeVariable;
import org.archware.sosadl.validation.typing.impl.TypeEnvContent;
import org.archware.sosadl.validation.typing.interp.InterpInZ;
import org.archware.sosadl.validation.typing.proof.And;
import org.archware.sosadl.validation.typing.proof.Check_datatype;
import org.archware.sosadl.validation.typing.proof.Equality;
import org.archware.sosadl.validation.typing.proof.Ex;
import org.archware.sosadl.validation.typing.proof.Expression_le;
import org.archware.sosadl.validation.typing.proof.Forall;
import org.archware.sosadl.validation.typing.proof.Forall2;
import org.archware.sosadl.validation.typing.proof.Subtype;
import org.archware.sosadl.validation.typing.proof.Type_datatype;
import org.archware.utils.Pair;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.ListExtensions;

public abstract class TypeCheckerDataType extends TypeCheckerInterpretation {

	protected Map<String, NumberGenerator> freshMaker = new ConcurrentHashMap<>();

	private static String labelFor(DataType t) {
		if (t instanceof BooleanType) {
			return "boolean";
		} else if (t instanceof RangeType) {
			RangeType r = (RangeType) t;
			return "integer { " + InterpInZ.eval(r.getVmin()) + " .. " + InterpInZ.eval(r.getVmax()) + " }";
		} else if (t instanceof NamedType) {
			return ((NamedType) t).getName();
		} else if (t instanceof TupleType) {
			TupleType tt = (TupleType) t;
			return "tuple { " + tt.getFields().stream().map((x) -> x.getName() + ": " + labelFor(x.getType()))
					.collect(Collectors.joining(", ")) + " }";
		} else if (t instanceof SequenceType) {
			SequenceType s = (SequenceType) t;
			return "sequence { " + labelFor(s.getType()) + " }";
		} else {
			return "unknown type";
		}
	}

	protected boolean isSubtype(DataType a, DataType b) {
		if (TypeInferenceSolver.containsVariable(a) || TypeInferenceSolver.containsVariable(b)) {
			throw new IllegalArgumentException();
		} else {
			Optional<Subtype> p = new TypeChecker().subtype(a, b, (x) -> {
			});
			return p.isPresent();
		}
	}

	protected Optional<Subtype> subtype(DataType a, DataType b, EObject target, EStructuralFeature targetForError) {
		return subtype(a, b, (m) -> error(m, target, targetForError));
	}

	protected Optional<Subtype> subtype(DataType a, DataType b, Consumer<String> error) {
		if (a instanceof TypeVariable || b instanceof TypeVariable) {
			return Optional
					.of(p(Subtype.class, a, (a_) -> p(Subtype.class, b, (b_) -> subtype(a_, b_, error).orElse(null))));
		} else if (EcoreUtil.equals(a, b)) {
			return Optional.of(createSubtype_refl(a));
		} else if (a instanceof RangeType && b instanceof RangeType && ((RangeType) a).getVmin() != null
				&& ((RangeType) a).getVmax() != null && ((RangeType) b).getVmin() != null
				&& ((RangeType) b).getVmax() != null && isLe(((RangeType) b).getVmin(), ((RangeType) a).getVmin())
				&& isLe(((RangeType) a).getVmax(), ((RangeType) b).getVmax())) {
			return Optional.of(createSubtype_range(((RangeType) a).getVmin(), ((RangeType) a).getVmax(),
					((RangeType) b).getVmin(), ((RangeType) b).getVmax(),
					expression_le(((RangeType) b).getVmin(), ((RangeType) a).getVmin()),
					expression_le(((RangeType) a).getVmax(), ((RangeType) b).getVmax())));
		} else if (a instanceof TupleType && b instanceof TupleType) {
			TupleType l = (TupleType) a;
			TupleType r = (TupleType) b;
			List<Pair<Optional<FieldDecl>, FieldDecl>> fields = ListExtensions
					.map(r.getFields(),
							(f) -> new Pair<>(
									l.getFields().stream().filter((g) -> f.getName().equals(g.getName())).findFirst(),
									f));
			if (fields.stream().allMatch((p) -> p.getA().isPresent())) {
				List<Pair<Pair<FieldDecl, Optional<Subtype>>, FieldDecl>> proofs = ListExtensions
						.map(fields,
								(f) -> new Pair<>(
										new Pair<>(f.getA().get(),
												subtype(f.getA().get().getType(), f.getB().getType(), error)),
										f.getB()));
				if (proofs.stream().allMatch((p) -> p.getA().getB().isPresent())) {
					Forall<FieldDecl, Ex<String, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Subtype>>>>>>> p1 = proveForall(
							r.getFields(), (fr) -> {
								String n = fr.getName();
								DataType tr = fr.getType();
								Pair<FieldDecl, Optional<Subtype>> fl = rassoc(proofs, fr);
								DataType tl = fl.getA().getType();
								Subtype p = fl.getB().get();
								return createEx_intro(n,
										createConj(createReflexivity(),
												createEx_intro(tr, createConj(createReflexivity(),
														createEx_intro(tl, createConj(createReflexivity(), p))))));
							});
					return Optional.of(createSubtype_tuple(l.getFields(), r.getFields(), p1));
				} else {
					return Optional.empty();
				}
			} else {
				error.accept("Some fields are missing: " + fields.stream().filter((p) -> !p.getA().isPresent())
						.map((p) -> p.getB().getName()).sorted().collect(Collectors.joining(" ")));
				return Optional.empty();
			}
		} else if (a instanceof SequenceType && b instanceof SequenceType) {
			SequenceType l = (SequenceType) a;
			SequenceType r = (SequenceType) b;
			Optional<Subtype> p = subtype(l.getType(), r.getType(), error);
			return p.map((p1) -> createSubtype_sequence(l.getType(), r.getType(), p1));
		} else {
			if (a instanceof NamedType) {
				errorForNamedType(labelFor(b), "to", (NamedType) a, error);
			}
			if (b instanceof NamedType) {
				errorForNamedType(labelFor(a), "from", (NamedType) b, error);
			}
			if (a instanceof RangeType && b instanceof RangeType) {
				RangeType ra = (RangeType) a;
				RangeType rb = (RangeType) b;
				if (ra.getVmin() == null) {
					error.accept("The range type must have a lower bound");
				}
				if (ra.getVmax() == null) {
					error.accept("The range type must have an upper bound");
				}
				if (rb.getVmin() == null) {
					error.accept("The range type must have a lower bound");
				}
				if (rb.getVmax() == null) {
					error.accept("The range type must have an upper bound");
				}
				if (ra.getVmin() != null && ra.getVmax() != null && rb.getVmin() != null && rb.getVmax() != null
						&& !(isLe(rb.getVmin(), ra.getVmin()) && isLe(ra.getVmax(), rb.getVmax()))) {
					SosADLPrettyPrinterGenerator pp = new SosADLPrettyPrinterGenerator();
					error.accept("The range [" + pp.compile(ra.getVmin()) + " = " + InterpInZ.eval(ra.getVmin()) + ".. "
							+ pp.compile(ra.getVmax()) + " = " + InterpInZ.eval(ra.getVmax()) + "] is not included in ["
							+ pp.compile(rb.getVmin()) + " = " + InterpInZ.eval(rb.getVmin()) + " .. "
							+ pp.compile(rb.getVmax()) + " = " + InterpInZ.eval(rb.getVmax()) + "]");
				}
			}
			if ((!(a instanceof NamedType) && !(b instanceof NamedType))
					&& !(a instanceof RangeType && b instanceof RangeType)
					&& !(a instanceof TupleType && b instanceof TupleType)
					&& !(a instanceof SequenceType && b instanceof SequenceType)) {
				error.accept("Cannot convert from " + labelFor(a) + " to " + labelFor(b));
			}
			return Optional.empty();
		}
	}

	protected Check_datatype check_datatype(DataType t) {
		if (t instanceof TypeVariable) {
			return p(Check_datatype.class, t, (t_) -> check_datatype(t_));
		} else if (t instanceof NamedType) {
			NamedType n = (NamedType) t;
			if (n.getName() != null) {
				return createCheck_NamedType(n.getName());
			} else {
				error("The named type must have a name", t, null);
				return null;
			}
		} else if (t instanceof TupleType) {
			TupleType tt = (TupleType) t;
			if (noDuplicate(tt.getFields().stream().map(FieldDecl::getName))) {
				return createCheck_TupleType(tt.getFields(), createReflexivity(),
						proveForall(tt.getFields(), (f) -> createEx_intro(f.getType(),
								createConj(createReflexivity(), check_datatype(f.getType())))));
			} else {
				errorFieldClash(tt);
				return null;
			}
		} else if (t instanceof SequenceType) {
			SequenceType s = (SequenceType) t;
			if (s.getType() != null) {
				return createCheck_SequenceType(s.getType(), check_datatype(s.getType()));
			} else {
				error("The sequence type must have a base type", t, null);
				return null;
			}
		} else if (t instanceof RangeType) {
			RangeType r = (RangeType) t;
			if (r.getVmin() != null && r.getVmax() != null) {
				if (isLe(r.getVmin(), r.getVmax())) {
					return createCheck_RangeType_trivial(r.getVmin(), r.getVmax(),
							expression_le(r.getVmin(), r.getVmax()));
				} else {
					error("The lower bound must be smaller than or equal to the upper bound", t, null);
					return null;
				}
			} else {
				if (r.getVmin() == null) {
					error("The range type must have a lower bound", t, null);
				}
				if (r.getVmax() == null) {
					error("The range type must have an upper bound", t, null);
				}
				return null;
			}
		} else if (t instanceof BooleanType) {
			return createCheck_BooleanType();
		} else {
			error("Unknown type", t, null);
			return null;
		}
	}

	private void errorFieldClash(TupleType tt) {
		tt.getFields().stream()
				.filter((p) -> tt.getFields().stream().map(FieldDecl::getName).filter((x) -> x.equals(p.getName()))
						.count() >= 2)
				.forEach((f) -> error("Multiple definitions of field `" + f.getName() + "'", f, null));
	}

	private void errorForNamedType(String label, String tofrom, NamedType t, Consumer<String> error) {
		if (t.getName() == null) {
			error.accept("The named type must have a name");
		} else {
			error.accept("The type `" + t.getName() + "' cannot be converted " + tofrom + " a " + label
					+ " because its definition is opaque");
		}
	}

	protected Pair<DataType, Type_datatype> type_datatype(Environment gamma, DataType type) {
		saveEnvironment(type, gamma);
		// type_NamedType:
		if (type instanceof NamedType) {
			NamedType n = (NamedType) type;
			if (n.getName() == null) {
				error("The named type must have a name", type, null);
				return new Pair<>(null, null);
			} else {
				EnvContent ec = gamma.get(n.getName());
				if (ec == null) {
					error("No type declaration named `" + gamma.get(n.getName()) + "'", type, null);
					return new Pair<>(null, null);
				} else if (ec instanceof TypeEnvContent) {
					TypeEnvContent tec = (TypeEnvContent) ec;
					saveBinder(type, tec.getDataTypeDecl());
					saveType(type, tec.getDataType());
					return new Pair<>(saveType(type, tec.getDataType()),
							saveProof(type,
									p(Type_datatype.class, gamma,
											(gamma_) -> createType_NamedType(gamma_, n.getName(), tec.getDataType(),
													tec.getDataTypeDecl(),
													createEx_intro(tec.getMethods(), createReflexivity())))));
				} else {
					error("`" + n.getName() + "' is not a type declaration", type, null);
					return new Pair<>(null, null);
				}
			}
		}
		// type_TupleType:
		else if (type instanceof TupleType) {
			TupleType t = (TupleType) type;
			if (noDuplicate(t.getFields().stream().map(FieldDecl::getName))) {
				List<Pair<FieldDecl, Pair<DataType, Type_datatype>>> l = ListExtensions.map(t.getFields(),
						(f) -> new Pair<>(f, type_datatype(gamma, f.getType())));
				if (l.stream()
						.allMatch((p) -> p.getB() != null && p.getB().getA() != null && p.getB().getB() != null)) {
					List<FieldDecl> fields2 = ListExtensions.map(l,
							(p) -> createFieldDecl(p.getA().getName(), p.getB().getA()));
					TupleType r = createTupleType(fields2);
					Forall2<FieldDecl, FieldDecl, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Type_datatype>>>>>> p2 = proveForall2(
							l, Pair::getA, (p) -> createFieldDecl(p.getA().getName(), p.getB().getA()),
							(p) -> createConj(createReflexivity(),
									createEx_intro(p.getA().getType(),
											createConj(createReflexivity(), createEx_intro(p.getB().getA(),
													createConj(createReflexivity(), p.getB().getB()))))));
					return new Pair<>(saveType(type, r),
							saveProof(type, p(Type_datatype.class, gamma, (gamma_) -> createType_TupleType(gamma_,
									t.getFields(), r.getFields(), createReflexivity(), p2))));
				} else {
					return new Pair<>(null, null);
				}
			} else {
				errorFieldClash(t);
				return new Pair<>(null, null);
			}
		}
		// type_SequenceType:
		else if (type instanceof SequenceType) {
			SequenceType s = (SequenceType) type;
			if (s.getType() != null) {
				Pair<DataType, Type_datatype> r = type_datatype(gamma, s.getType());
				if (r != null && r.getA() != null && r.getB() != null) {
					return new Pair<>(saveType(type, createSequenceType(r.getA())),
							saveProof(type, p(Type_datatype.class, gamma,
									(gamma_) -> createType_SequenceType(gamma_, s.getType(), r.getA(), r.getB()))));
				} else {
					return new Pair<>(null, null);
				}
			} else {
				error("The sequence type must declare a base type", type, null);
				return new Pair<>(null, null);
			}
		}
		// type_RangeType_trivial
		else if (type instanceof RangeType) {
			RangeType r = (RangeType) type;
			if (r.getVmin() != null && r.getVmax() != null) {
				if (isLe(r.getVmin(), r.getVmax())) {
					saveMin(type, InterpInZ.eval(((RangeType) type).getVmin()));
					saveMax(type, InterpInZ.eval(((RangeType) type).getVmax()));
					Expression_le p1 = expression_le(r.getVmin(), r.getVmax());
					return new Pair<>(saveType(type, type), saveProof(type, p(Type_datatype.class, gamma,
							(gamma_) -> createType_RangeType_trivial(gamma_, r.getVmin(), r.getVmax(), p1))));
				} else {
					error("The lower bound of the range is greater than the upper bound", type, null);
					return new Pair<>(null, null);
				}
			} else {
				if (r.getVmin() == null) {
					error("The range type must have a lower bound", type, null);
				}
				if (r.getVmax() == null) {
					error("The range type must have an upper bound", type, null);
				}
				return new Pair<>(null, null);
			}
		}
		// type_BooleanType:
		else if (type instanceof BooleanType) {
			return new Pair<>(saveType(type, type),
					saveProof(type, p(Type_datatype.class, gamma, (gamma_) -> createType_BooleanType(gamma_))));
		} else {
			error("Type error", type, null);
			return new Pair<>(null, null);
		}
	}

}