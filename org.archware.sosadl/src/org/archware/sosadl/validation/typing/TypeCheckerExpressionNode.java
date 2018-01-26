package org.archware.sosadl.validation.typing;

import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.sosADL.IdentExpression;
import org.archware.sosadl.sosADL.IntegerValue;
import org.archware.sosadl.sosADL.Map;
import org.archware.sosadl.sosADL.MethodCall;
import org.archware.sosadl.sosADL.RangeType;
import org.archware.sosadl.sosADL.Select;
import org.archware.sosadl.sosADL.Sequence;
import org.archware.sosadl.sosADL.SequenceType;
import org.archware.sosadl.sosADL.SosADLPackage;
import org.archware.sosadl.sosADL.Tuple;
import org.archware.sosadl.sosADL.TupleElement;
import org.archware.sosadl.sosADL.TupleType;
import org.archware.sosadl.sosADL.UnaryExpression;
import org.archware.sosadl.tv.typeCheckerHelper.TypeVariable;
import org.archware.sosadl.validation.typing.impl.TypeEnvContent;
import org.archware.sosadl.validation.typing.impl.VariableEnvContent;
import org.archware.sosadl.validation.typing.proof.*;
import org.archware.utils.DecaFunction;
import org.archware.utils.IntPair;
import org.archware.utils.ListUtils;
import org.archware.utils.Pair;
import org.archware.utils.PentaFunction;
import org.archware.utils.StreamUtils;
import org.archware.utils.TreDecaFunction;
import org.archware.utils.TriFunction;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.xtext.xbase.lib.ListExtensions;

public abstract class TypeCheckerExpressionNode extends TypeCheckerDataType {

	private class TypeInfo<T> {
		protected abstract class AbstractUnaryTypeInfo<P extends Type_expression_node<T>>
				extends StringBasedUnaryTypeInfo<T, P> {
			private final PentaFunction<Environment, Expression, DataType, T, Subtype, P> prover;

			public AbstractUnaryTypeInfo(String operator,
					PentaFunction<Environment, Expression, DataType, T, Subtype, P> prover) {
				super(operator);
				this.prover = prover;
			}

			@SuppressWarnings("unchecked")
			@Override
			public Type_expression_node<T> prove(Environment gamma, UnaryExpression e, T pOperand, DataType tOperand) {
				return p(Type_expression_node.class, gamma,
						(gamma_) -> p(Type_expression_node.class, tOperand, (tOperand_) -> prover.apply(gamma_,
								e.getRight(), tOperand_, pOperand, createSubtype_refl(tOperand_))));
			}
		}

		private <U> U range_modulo_min(Expression lmin, Expression lmax, Expression rmin, Expression rmax,
				Supplier<U> pos, Supplier<U> zero, Supplier<U> neg, Supplier<U> divByZero) {
			if (isLe(createIntegerValue(1), rmin)) {
				if (isLe(createIntegerValue(0), lmin)) {
					return zero.get();
				} else {
					return pos.get();
				}
			} else if (isLe(rmax, createOpposite(createIntegerValue(1)))) {
				if (isLe(createIntegerValue(0), lmin)) {
					return zero.get();
				} else {
					return neg.get();
				}
			} else {
				return divByZero.get();
			}
		}

		private <U> U range_modulo_max(Expression lmin, Expression lmax, Expression rmin, Expression rmax,
				Supplier<U> pos, Supplier<U> zero, Supplier<U> neg, Supplier<U> divByZero) {
			if (isLe(createIntegerValue(1), rmin)) {
				if (isLe(lmax, createIntegerValue(0))) {
					return zero.get();
				} else {
					return pos.get();
				}
			} else if (isLe(rmax, createOpposite(createIntegerValue(1)))) {
				if (isLe(lmax, createIntegerValue(0))) {
					return zero.get();
				} else {
					return neg.get();
				}
			} else {
				return divByZero.get();
			}
		}

		private final UnaryTypeInfo2<T, ?> unop2Same = new SynthetizingUnaryTypeInfo<>("+",
				(g, e, t, p, s) -> createType_expression_Same(g, e, t, ((RangeType) t).getVmin(),
						((RangeType) t).getVmax(), p, s),
				(e, t) -> Optional.ofNullable(t).flatMap((x) -> toRangeType(e, t)).map((x) -> (DataType) x));

		private Optional<RangeType> toRangeType(UnaryExpression e, DataType t) {
			if (t instanceof RangeType) {
				return Optional.of((RangeType) t);
			} else {
				error("The operand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(t), e, SosADLPackage.Literals.UNARY_EXPRESSION__RIGHT);
				return Optional.empty();
			}
		}

		private final UnaryTypeInfo2<T, ?> unop2Opposite = new SynthetizingUnaryTypeInfo<>("-",
				(g, e, t, p, s) -> createType_expression_Opposite(g, e, t, ((RangeType) t).getVmin(),
						((RangeType) t).getVmax(), p, s),
				(e, t) -> Optional.ofNullable(t).flatMap((x) -> toRangeType(e, x))
						.map((x) -> createRangeType(createOpposite(x.getVmax()), createOpposite(x.getVmin()))));
		private final UnaryTypeInfo2<T, ?> unop2Not = new BooleanUnaryTypeInfo<>("not",
				TypeCheckerExpressionNode.this::createType_expression_Not);

		protected abstract class AbstractBinaryTypeInfo<P extends Type_expression_node<T>>
				extends StringBasedBinaryTypeInfo<T, P> {
			private final DecaFunction<Environment, Expression, DataType, T, Subtype, Expression, DataType, T, Subtype, DataType, P> prover;

			public AbstractBinaryTypeInfo(String operator,
					DecaFunction<Environment, Expression, DataType, T, Subtype, Expression, DataType, T, Subtype, DataType, P> prover) {
				super(operator);
				this.prover = prover;
			}

			@SuppressWarnings("unchecked")
			@Override
			public Type_expression_node<T> prove(Environment gamma, BinaryExpression e, T pLeft, DataType tLeft,
					T pRight, DataType tRight, DataType r) {
				return p(Type_expression_node.class, gamma,
						(gamma_) -> p(Type_expression_node.class, tLeft,
								(tLeft_) -> p(Type_expression_node.class, tRight,
										(tRight_) -> p(Type_expression_node.class, r,
												(r_) -> prover.apply(gamma_, e.getLeft(), tLeft_, pLeft,
														createSubtype_refl(tLeft_), e.getRight(), tRight_, pRight,
														createSubtype_refl(tRight_), r_)))));
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Add = new SynthetizingBinaryTypeInfo<>("+",
				(g, le, lt, lp, ls, re, rt, rp, rs, r) -> createType_expression_Add(g, le, lt,
						((RangeType) lt).getVmin(), ((RangeType) lt).getVmax(), re, rt, ((RangeType) rt).getVmin(),
						((RangeType) rt).getVmax(), lp, ls, rp, rs),
				this::binopSolverAdd);

		private Optional<DataType> binopSolverAdd(BinaryExpression e, DataType l, DataType r) {
			if (l instanceof RangeType) {
				if (r instanceof RangeType) {
					return Optional.of(createRangeType(
							createBinaryExpression(((RangeType) l).getVmin(), "+", ((RangeType) r).getVmin()),
							createBinaryExpression(((RangeType) l).getVmax(), "+", ((RangeType) r).getVmax())));
				} else {
					error("The right-hand operatand of `" + e.getOp() + "' must be a range type, found "
							+ TypeInferenceSolver.typeToString(r), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
					return Optional.empty();
				}
			} else {
				error("The left-hand operatand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(l), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				return Optional.empty();
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Sub = new SynthetizingBinaryTypeInfo<>("-",
				(g, le, lt, lp, ls, re, rt, rp, rs, r) -> createType_expression_Sub(g, le, lt,
						((RangeType) lt).getVmin(), ((RangeType) lt).getVmax(), re, rt, ((RangeType) rt).getVmin(),
						((RangeType) rt).getVmax(), lp, ls, rp, rs),
				this::binopSolverSub);

		private Optional<DataType> binopSolverSub(BinaryExpression e, DataType l, DataType r) {
			if (l instanceof RangeType) {
				if (r instanceof RangeType) {
					return Optional.of(createRangeType(
							createBinaryExpression(((RangeType) l).getVmin(), "-", ((RangeType) r).getVmax()),
							createBinaryExpression(((RangeType) l).getVmax(), "-", ((RangeType) r).getVmin())));
				} else {
					error("The right-hand operatand of `" + e.getOp() + "' must be a range type, found "
							+ TypeInferenceSolver.typeToString(r), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
					return Optional.empty();
				}
			} else {
				error("The left-hand operatand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(l), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				return Optional.empty();
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Mul = new SynthetizingBinaryTypeInfo<>("*", this::binopProverMul,
				this::binopSolverMul);

		private Type_expression_node<T> binopProverMul(Environment g, Expression le, DataType ldt, T lp, Subtype ls,
				Expression re, DataType rdt, T rp, Subtype rs, DataType rd) {
			RangeType lt = (RangeType) ldt;
			RangeType rt = (RangeType) rdt;
			RangeType r = (RangeType) rd;
			Expression c1 = createBinaryExpression(lt.getVmin(), "*", rt.getVmin());
			Expression c2 = createBinaryExpression(lt.getVmin(), "*", rt.getVmax());
			Expression c3 = createBinaryExpression(lt.getVmax(), "*", rt.getVmin());
			Expression c4 = createBinaryExpression(lt.getVmax(), "*", rt.getVmax());
			return createType_expression_Mul(g, le, lt, lt.getVmin(), lt.getVmax(), re, rt, rt.getVmin(), rt.getVmax(),
					r.getVmin(), r.getVmax(), lp, ls, rp, rs, expression_le(r.getVmin(), c1),
					expression_le(r.getVmin(), c2), expression_le(r.getVmin(), c3), expression_le(r.getVmin(), c4),
					expression_le(c1, r.getVmax()), expression_le(c2, r.getVmax()), expression_le(c3, r.getVmax()),
					expression_le(c4, r.getVmax()));
		}

		private Optional<DataType> binopSolverMul(BinaryExpression e, DataType l, DataType r) {
			if (l instanceof RangeType) {
				if (r instanceof RangeType) {
					RangeType lt = (RangeType) l;
					RangeType rt = (RangeType) r;
					Expression c1 = createBinaryExpression(lt.getVmin(), "*", rt.getVmin());
					Expression c2 = createBinaryExpression(lt.getVmin(), "*", rt.getVmax());
					Expression c3 = createBinaryExpression(lt.getVmax(), "*", rt.getVmin());
					Expression c4 = createBinaryExpression(lt.getVmax(), "*", rt.getVmax());
					Expression mi = min(min(c1, c2), min(c3, c4));
					Expression ma = max(max(c1, c2), max(c3, c4));
					return Optional.of(createRangeType(mi, ma));
				} else {
					error("The right-hand operatand of `" + e.getOp() + "' must be a range type, found "
							+ TypeInferenceSolver.typeToString(r), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
					return Optional.empty();
				}
			} else {
				error("The left-hand operatand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(l), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				return Optional.empty();
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Div = new SynthetizingBinaryTypeInfo<>("/", this::binopProverDiv,
				this::binopSolverDiv);

		private Type_expression_node<T> binopProverDiv(Environment g, Expression le, DataType dlt, T lp, Subtype ls,
				Expression re, DataType drt, T rp, Subtype rs, DataType dr) {
			RangeType lt = (RangeType) dlt;
			RangeType rt = (RangeType) drt;
			RangeType r = (RangeType) dr;
			if (isLe(createIntegerValue(1), rt.getVmin())) {
				Expression c1 = createBinaryExpression(lt.getVmin(), "/", rt.getVmin());
				Expression c2 = createBinaryExpression(lt.getVmin(), "/", rt.getVmax());
				Expression c3 = createBinaryExpression(lt.getVmax(), "/", rt.getVmin());
				Expression c4 = createBinaryExpression(lt.getVmax(), "/", rt.getVmax());
				return createType_expression_Div_pos(g, le, lt, lt.getVmin(), lt.getVmax(), re, rt, rt.getVmin(),
						rt.getVmax(), r.getVmin(), r.getVmax(), lp, ls, rp, rs,
						expression_le(createIntegerValue(1), rt.getVmin()), expression_le(r.getVmin(), c1),
						expression_le(r.getVmin(), c2), expression_le(r.getVmin(), c3), expression_le(r.getVmin(), c4),
						expression_le(c1, r.getVmax()), expression_le(c2, r.getVmax()), expression_le(c3, r.getVmax()),
						expression_le(c4, r.getVmax()));
			} else if (isLe(rt.getVmax(), createOpposite(createIntegerValue(1)))) {
				Expression c1 = createBinaryExpression(lt.getVmin(), "/", rt.getVmin());
				Expression c2 = createBinaryExpression(lt.getVmin(), "/", rt.getVmax());
				Expression c3 = createBinaryExpression(lt.getVmax(), "/", rt.getVmin());
				Expression c4 = createBinaryExpression(lt.getVmax(), "/", rt.getVmax());
				return createType_expression_Div_neg(g, le, lt, lt.getVmin(), lt.getVmax(), re, rt, rt.getVmin(),
						rt.getVmax(), r.getVmin(), r.getVmax(), lp, ls, rp, rs,
						expression_le(rt.getVmax(), createOpposite(createIntegerValue(1))),
						expression_le(r.getVmin(), c1), expression_le(r.getVmin(), c2), expression_le(r.getVmin(), c3),
						expression_le(r.getVmin(), c4), expression_le(c1, r.getVmax()), expression_le(c2, r.getVmax()),
						expression_le(c3, r.getVmax()), expression_le(c4, r.getVmax()));
			} else {
				error("The divisor must be different from 0", re, null);
				return null;
			}
		}

		private Optional<DataType> binopSolverDiv(BinaryExpression e, DataType l, DataType r) {
			if (l instanceof RangeType) {
				if (r instanceof RangeType) {
					RangeType lt = (RangeType) l;
					RangeType rt = (RangeType) r;
					if (isLe(createIntegerValue(1), rt.getVmin())
							|| isLe(rt.getVmax(), createOpposite(createIntegerValue(1)))) {
						Expression c1 = createBinaryExpression(lt.getVmin(), "/", rt.getVmin());
						Expression c2 = createBinaryExpression(lt.getVmin(), "/", rt.getVmax());
						Expression c3 = createBinaryExpression(lt.getVmax(), "/", rt.getVmin());
						Expression c4 = createBinaryExpression(lt.getVmax(), "/", rt.getVmax());
						Expression mi = min(min(c1, c2), min(c3, c4));
						Expression ma = max(max(c1, c2), max(c3, c4));
						return Optional.of(createRangeType(mi, ma));
					} else {
						// error("The divisor must be different from 0",
						// e.getRight(), null);
						return Optional.empty();
					}
				} else {
					error("The right-hand operatand of `" + e.getOp() + "' must be a range type, found "
							+ TypeInferenceSolver.typeToString(r), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
					return Optional.empty();
				}
			} else {
				error("The left-hand operatand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(l), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				return Optional.empty();
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Mod = new SynthetizingBinaryTypeInfo<>("mod", this::binopProverMod,
				this::binopSolverMod);

		private Type_expression_node<T> binopProverMod(Environment g, Expression le, DataType dlt, T lp, Subtype ls,
				Expression re, DataType drt, T rp, Subtype rs, DataType dr) {
			RangeType lt = (RangeType) dlt;
			RangeType rt = (RangeType) drt;
			RangeType r = (RangeType) dr;
			Range_modulo_min min = range_modulo_min(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
					() -> createRange_modulo_min_pos(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
							r.getVmin(), expression_le(createIntegerValue(1), rt.getVmin()),
							expression_le(r.getVmin(),
									createBinaryExpression(createIntegerValue(1), "-", rt.getVmax()))),
					() -> createRange_modulo_min_zero(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
							r.getVmin(), expression_le(createIntegerValue(0), lt.getVmin()),
							expression_le(r.getVmin(), createIntegerValue(0))),
					() -> createRange_modulo_min_neg(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
							r.getVmin(),
							expression_le(rt.getVmax(), createOpposite(createIntegerValue(1))), expression_le(
									r.getVmin(), createBinaryExpression(rt.getVmin(), "+", createIntegerValue(1)))),
					() -> {
						error("The divisor must be different from 0", re, null);
						return null;
					});
			if (min != null) {
				Range_modulo_max max = range_modulo_max(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
						() -> createRange_modulo_max_pos(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
								r.getVmax(), expression_le(createIntegerValue(1), rt.getVmin()),
								expression_le(createBinaryExpression(rt.getVmax(), "-", createIntegerValue(1)),
										r.getVmax())),
						() -> createRange_modulo_max_zero(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
								r.getVmax(), expression_le(lt.getVmax(), createIntegerValue(0)),
								expression_le(createIntegerValue(0), r.getVmax())),
						() -> createRange_modulo_max_neg(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
								r.getVmax(), expression_le(rt.getVmax(), createOpposite(createIntegerValue(1))),
								expression_le(createBinaryExpression(createOpposite(createIntegerValue(1)), "-",
										rt.getVmin()), r.getVmax())),
						() -> {
							error("The divisor must be different from 0", re, null);
							return null;
						});
				if (max != null) {
					return createType_expression_Mod(g, le, lt, lt.getVmin(), lt.getVmax(), re, rt, rt.getVmin(),
							rt.getVmax(), r.getVmin(), r.getVmax(), lp, ls, rp, rs, min, max);
				} else {
					return null;
				}
			} else {
				return null;
			}
		}

		private Optional<DataType> binopSolverMod(BinaryExpression e, DataType l, DataType r) {
			if (l instanceof RangeType) {
				if (r instanceof RangeType) {
					RangeType lt = (RangeType) l;
					RangeType rt = (RangeType) r;
					Expression min = range_modulo_min(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
							() -> createBinaryExpression(createIntegerValue(1), "-", rt.getVmax()),
							() -> createIntegerValue(0),
							() -> createBinaryExpression(rt.getVmin(), "+", createIntegerValue(1)), () -> {
								error("The divisor must be different from 0", e.getRight(), null);
								return null;
							});
					if (min != null) {
						Expression max = range_modulo_max(lt.getVmin(), lt.getVmax(), rt.getVmin(), rt.getVmax(),
								() -> createBinaryExpression(rt.getVmax(), "-", createIntegerValue(1)),
								() -> createIntegerValue(0),
								() -> createBinaryExpression(createOpposite(createIntegerValue(1)), "-", rt.getVmin()),
								() -> {
									error("The divisor must be different from 0", e.getRight(), null);
									return null;
								});
						if (max != null) {
							return Optional.of(createRangeType(min, max));
						} else {
							error("Cannot infer the upper-bound of the range", e, null);
							return Optional.empty();
						}
					} else {
						error("Cannot infer the lower-bound of the range", e, null);
						return Optional.empty();
					}
				} else {
					error("The right-hand operatand of `" + e.getOp() + "' must be a range type, found "
							+ TypeInferenceSolver.typeToString(r), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
					return Optional.empty();
				}
			} else {
				error("The left-hand operatand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(l), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				return Optional.empty();
			}
		}

		class BooleanUnaryTypeInfo<P extends Type_expression_node<T>> extends AbstractUnaryTypeInfo<P> {
			public BooleanUnaryTypeInfo(String operator,
					PentaFunction<Environment, Expression, DataType, T, Subtype, P> prover) {
				super(operator, prover);
			}

			@Override
			public Optional<DataType> immediateType(UnaryExpression e, DataType operand) {
				inference.addConstraint(operand, createBooleanType(), e,
						SosADLPackage.Literals.UNARY_EXPRESSION__RIGHT);
				return Optional.of(TypeChecker.createBooleanType());
			}
		}

		class SynthetizingUnaryTypeInfo<P extends Type_expression_node<T>> extends AbstractUnaryTypeInfo<P> {
			private final BiFunction<UnaryExpression, DataType, Optional<DataType>> solver;

			public SynthetizingUnaryTypeInfo(String operator,
					PentaFunction<Environment, Expression, DataType, T, Subtype, P> prover,
					BiFunction<UnaryExpression, DataType, Optional<DataType>> solver) {
				super(operator, prover);
				this.solver = solver;
			}

			@Override
			public Optional<DataType> immediateType(UnaryExpression e, DataType operand) {
				if (TypeInferenceSolver.containsVariable(operand)) {
					TypeVariable v = inference
							.createFreshTypeVariable((lb, ub) -> solver.apply(e, getSubstitute(operand)), e, null);
					TypeInferenceSolver.streamVariables(operand).forEach((x) -> inference.addDependency(v, x));
					return Optional.of(v);
				} else {
					return solver.apply(e, operand);
				}
			}
		}

		class SynthetizingBinaryTypeInfo<P extends Type_expression_node<T>> extends AbstractBinaryTypeInfo<P> {
			private final TriFunction<BinaryExpression, DataType, DataType, Optional<DataType>> solver;

			public SynthetizingBinaryTypeInfo(String operator,
					DecaFunction<Environment, Expression, DataType, T, Subtype, Expression, DataType, T, Subtype, DataType, P> prover,
					TriFunction<BinaryExpression, DataType, DataType, Optional<DataType>> solver) {
				super(operator, prover);
				this.solver = solver;
			}

			@Override
			public Optional<DataType> immediateType(BinaryExpression e, DataType left, DataType right) {
				Collection<TypeVariable> vars = Stream.of(left, right).flatMap(TypeInferenceSolver::streamVariables)
						.collect(Collectors.toCollection(ConcurrentLinkedDeque::new));
				if (vars.isEmpty()) {
					return solver.apply(e, left, right);
				} else {
					TypeVariable v = inference.createFreshTypeVariable(
							(lb, ub) -> solver.apply(e, getSubstitute(left), getSubstitute(right)), e, null);
					vars.forEach((x) -> inference.addDependency(v, x));
					return Optional.of(v);
				}
			}
		}

		class CmpBinaryTypeInfo<P extends Type_expression_node<T>>
				extends SynthetizingBinaryTypeInfo<Type_expression_node<T>> {
			public CmpBinaryTypeInfo(String operator,
					TreDecaFunction<Environment, Expression, DataType, Expression, Expression, Expression, DataType, Expression, Expression, T, Subtype, T, Subtype, Type_expression_node<T>> constructor,
					TriFunction<BinaryExpression, DataType, DataType, Optional<DataType>> solver) {
				super(operator,
						(g, l, lt, lp, ls, r, rt, rp, rs, dr) -> constructor.apply(g, l, lt, ((RangeType) lt).getVmin(),
								((RangeType) lt).getVmax(), r, rt, ((RangeType) rt).getVmin(),
								((RangeType) rt).getVmax(), lp, ls, rp, rs),
						solver);
			}
		}

		class BooleanBinaryTypeInfo<P extends Type_expression_node<T>> extends AbstractBinaryTypeInfo<P> {
			public BooleanBinaryTypeInfo(String operator,
					DecaFunction<Environment, Expression, DataType, T, Subtype, Expression, DataType, T, Subtype, DataType, P> prover) {
				super(operator, prover);
			}

			@Override
			public Optional<DataType> immediateType(BinaryExpression e, DataType left, DataType right) {
				inference.addConstraint(left, createBooleanType(), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				inference.addConstraint(right, createBooleanType(), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
				return Optional.of(TypeChecker.createBooleanType());
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Implies = new BooleanBinaryTypeInfo<>("implies",
				(g, l, lt, lp, ls, r, rt, rp, rs, t) -> createType_expression_Implies(g, l, lt, r, rt, lp, ls, rp, rs));
		private final BinaryTypeInfo2<T, ?> binop2Or = new BooleanBinaryTypeInfo<>("or",
				(g, l, lt, lp, ls, r, rt, rp, rs, t) -> createType_expression_Or(g, l, lt, r, rt, lp, ls, rp, rs));
		private final BinaryTypeInfo2<T, ?> binop2Xor = new BooleanBinaryTypeInfo<>("xor",
				(g, l, lt, lp, ls, r, rt, rp, rs, t) -> createType_expression_Xor(g, l, lt, r, rt, lp, ls, rp, rs));
		private final BinaryTypeInfo2<T, ?> binop2And = new BooleanBinaryTypeInfo<>("and",
				(g, l, lt, lp, ls, r, rt, rp, rs, t) -> createType_expression_And(g, l, lt, r, rt, lp, ls, rp, rs));
		private final BinaryTypeInfo2<T, ?> binop2Equal = new CmpBinaryTypeInfo<>("=",
				TypeCheckerExpressionNode.this::createType_expression_Equal, this::binopSolverCmp);

		private Optional<DataType> binopSolverCmp(BinaryExpression e, DataType l, DataType r) {
			if (l instanceof RangeType) {
				if (r instanceof RangeType) {
					return Optional.of(createBooleanType());
				} else {
					error("The right-hand operatand of `" + e.getOp() + "' must be a range type, found "
							+ TypeInferenceSolver.typeToString(r), e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
					return Optional.empty();
				}
			} else {
				error("The left-hand operatand of `" + e.getOp() + "' must be a range type, found "
						+ TypeInferenceSolver.typeToString(l), e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
				return Optional.empty();
			}
		}

		private final BinaryTypeInfo2<T, ?> binop2Diff = new CmpBinaryTypeInfo<>("<>",
				TypeCheckerExpressionNode.this::createType_expression_Diff, this::binopSolverCmp);
		private final BinaryTypeInfo2<T, ?> binop2Lt = new CmpBinaryTypeInfo<>("<",
				TypeCheckerExpressionNode.this::createType_expression_Lt, this::binopSolverCmp);
		private final BinaryTypeInfo2<T, ?> binop2Le = new CmpBinaryTypeInfo<>("<=",
				TypeCheckerExpressionNode.this::createType_expression_Le, this::binopSolverCmp);
		private final BinaryTypeInfo2<T, ?> binop2Gt = new CmpBinaryTypeInfo<>(">",
				TypeCheckerExpressionNode.this::createType_expression_Gt, this::binopSolverCmp);
		private final BinaryTypeInfo2<T, ?> binop2Ge = new CmpBinaryTypeInfo<>(">=",
				TypeCheckerExpressionNode.this::createType_expression_Ge, this::binopSolverCmp);

		public final Collection<UnaryTypeInfo2<T, ?>> unaryTypeInformations2;

		public final Collection<BinaryTypeInfo2<T, ?>> binaryTypeInformations2;

		public TypeInfo() {
			unaryTypeInformations2 = new LinkedList<>();
			unaryTypeInformations2.add(unop2Same);
			unaryTypeInformations2.add(unop2Opposite);
			unaryTypeInformations2.add(unop2Not);

			binaryTypeInformations2 = new LinkedList<>();
			binaryTypeInformations2.add(binop2Add);
			binaryTypeInformations2.add(binop2Sub);
			binaryTypeInformations2.add(binop2Mul);
			binaryTypeInformations2.add(binop2Div);
			binaryTypeInformations2.add(binop2Mod);
			binaryTypeInformations2.add(binop2Implies);
			binaryTypeInformations2.add(binop2Or);
			binaryTypeInformations2.add(binop2Xor);
			binaryTypeInformations2.add(binop2And);
			binaryTypeInformations2.add(binop2Equal);
			binaryTypeInformations2.add(binop2Diff);
			binaryTypeInformations2.add(binop2Lt);
			binaryTypeInformations2.add(binop2Le);
			binaryTypeInformations2.add(binop2Gt);
			binaryTypeInformations2.add(binop2Ge);
		}
	}

	protected <T extends ProofTerm> Pair<Type_expression_node<T>, DataType> type_expression_node(Environment gamma, Expression e,
			BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		saveEnvironment(e, gamma);
		if (e instanceof IntegerValue) {
			return type_expression_node_IntegerValue(gamma, (IntegerValue) e);
		} else if (e instanceof UnaryExpression) {
			return type_expression_node_UnaryExpression(gamma, (UnaryExpression) e, te);
		} else if (e instanceof BinaryExpression) {
			return type_expression_node_BinaryExpression(gamma, (BinaryExpression) e, te);
		} else if (e instanceof IdentExpression) {
			return type_expression_node_IdentExpression(gamma, (IdentExpression) e);
		} else if (e instanceof MethodCall) {
			return type_expression_node_MethodCall(gamma, (MethodCall) e, te);
		} else if (e instanceof Tuple) {
			return type_expression_node_Tuple(gamma, (Tuple) e, te);
		} else if (e instanceof Sequence) {
			return type_expression_node_Sequence(gamma, (Sequence) e, te);
		} else if (e instanceof org.archware.sosadl.sosADL.Field) {
			return type_expression_node_Field(gamma, (org.archware.sosadl.sosADL.Field) e, te);
		} else if (e instanceof Map) {
			return type_expression_node_Map(gamma, (Map) e, te);
		} else if (e instanceof Select) {
			return type_expression_node_Select(gamma, (Select) e, te);
		} else {
			error("Type error", e, null);
			return new Pair<>(null, null);
		}
	}

	private class SelectTyper<T> implements Typer<T> {
		private final Environment gamma;
		private final Select s;
		private final Expression obj;
		private final DataType sTau;
		private final String x;
		private final Expression e;
		private final T p1;
		private final BiFunction<Environment, Expression, Pair<T, DataType>> typer;

		private DataType tau;
		private T p2;

		public SelectTyper(Environment gamma, Select s, DataType sTau, T p1,
				BiFunction<Environment, Expression, Pair<T, DataType>> typer) {
			super();
			this.gamma = gamma;
			this.s = s;
			this.obj = s.getObject();
			this.sTau = sTau;
			this.x = s.getVariable();
			this.e = s.getCondition();
			this.p1 = p1;
			this.typer = typer;
		}

		private DataType getObjType() {
			if (sTau instanceof TypeVariable) {
				return getSubstitute(sTau);
			} else {
				return sTau;
			}
		}

		private Optional<DataType> lookupAndReturnType() {
			DataType s = getObjType();
			if (s instanceof SequenceType) {
				SequenceType st = (SequenceType) s;
				tau = st.getType();
				Pair<T, DataType> pt2 = typer.apply(gamma.put(x, new VariableEnvContent(s, tau)), e);
				p2 = pt2.getA();
				DataType t2 = pt2.getB();
				if (t2 != null && p2 != null) {
					inference.addConstraint(t2, createBooleanType(), this.s, SosADLPackage.Literals.SELECT__CONDITION);
					return Optional.of(createSequenceType(tau));
				} else {
					return Optional.empty();
				}
			} else {
				error("The object must be a sequence", this.s, SosADLPackage.Literals.SELECT__OBJECT);
				return Optional.empty();
			}
		}

		@Override
		public Optional<DataType> computeReturnType() {
			if (sTau instanceof TypeVariable) {
				TypeVariable v = createFreshTypeVariable(s, null, (lb, ub) -> lookupAndReturnType());
				inference.addDependency(v, (TypeVariable) sTau);
				return Optional.of(v);
			} else {
				return lookupAndReturnType();
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		public Type_expression_node<T> computeProof() {
			return p(Type_expression_node.class, gamma, this::buildProof);
		}

		@SuppressWarnings("unchecked")
		private Type_expression_node<T> buildProof(Environment gamma) {
			return p(Type_expression_node.class, tau,
					(tau_) -> createType_expression_Select(gamma, obj, tau_, x, e, p1, p2));
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_Select(Environment gamma, Select e,
			BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (e.getCondition() != null && e.getObject() != null && e.getVariable() != null) {
			Pair<T, DataType> pt1 = te.apply(gamma, e.getObject());
			T p1 = pt1.getA();
			DataType sTau = pt1.getB();
			if (p1 != null && sTau != null) {
				SelectTyper<T> typer = new SelectTyper<>(gamma, e, sTau, p1, te);
				return typeWithTyper(e, typer);
			} else {
				return new Pair<>(null, null);
			}
		} else {
			if (e.getCondition() == null) {
				error("There must be a predicate expression", e, SosADLPackage.Literals.SELECT__CONDITION);
			}
			if (e.getObject() == null) {
				error("The selection must be applied to a sequence", e, SosADLPackage.Literals.SELECT__OBJECT);
			}
			if (e.getVariable() == null) {
				error("The selection must declare a variable", e, SosADLPackage.Literals.SELECT__VARIABLE);
			}
			return new Pair<>(null, null);
		}
	}

	private class MapTyper<T> implements Typer<T> {
		private final Environment gamma;
		private final Map m;
		private final Expression obj;
		private final DataType sTau;
		private final String x;
		private final Expression e;
		private final T p1;
		private final BiFunction<Environment, Expression, Pair<T, DataType>> typer;

		private DataType tau;
		private DataType tau__e;
		private T p2;

		public MapTyper(Environment gamma, Map m, DataType sTau, T p1,
				BiFunction<Environment, Expression, Pair<T, DataType>> typer) {
			super();
			this.gamma = gamma;
			this.m = m;
			this.obj = m.getObject();
			this.sTau = sTau;
			this.x = m.getVariable();
			this.e = m.getExpression();
			this.p1 = p1;
			this.typer = typer;
		}

		private DataType getObjType() {
			if (sTau instanceof TypeVariable) {
				return getSubstitute(sTau);
			} else {
				return sTau;
			}
		}

		private Optional<DataType> lookupAndReturnType() {
			DataType s = getObjType();
			if (s instanceof SequenceType) {
				SequenceType st = (SequenceType) s;
				tau = st.getType();
				Pair<T, DataType> pt2 = typer.apply(gamma.put(x, new VariableEnvContent(m, tau)), e);
				tau__e = pt2.getB();
				p2 = pt2.getA();
				if (tau__e != null && p2 != null) {
					return Optional.of(createSequenceType(tau__e));
				} else {
					return Optional.empty();
				}
			} else {
				error("The object must be a sequence", m, SosADLPackage.Literals.MAP__OBJECT);
				return Optional.empty();
			}
		}

		@Override
		public Optional<DataType> computeReturnType() {
			if (sTau instanceof TypeVariable) {
				TypeVariable v = createFreshTypeVariable(m, null, (lb, ub) -> lookupAndReturnType());
				inference.addDependency(v, (TypeVariable) sTau);
				return Optional.of(v);
			} else {
				return lookupAndReturnType();
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		public Type_expression_node<T> computeProof() {
			return p(Type_expression_node.class, gamma, this::buildProof);
		}

		@SuppressWarnings("unchecked")
		private Type_expression_node<T> buildProof(Environment gamma) {
			return p(Type_expression_node.class, tau, (tau_) -> p(Type_expression_node.class, tau__e,
					(tau__e_) -> createType_expression_Map(gamma, obj, tau_, x, e, tau__e_, p1, p2)));
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_Map(Environment gamma, Map e,
			BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (e.getExpression() != null && e.getObject() != null && e.getVariable() != null) {
			Pair<T, DataType> pt1 = te.apply(gamma, e.getObject());
			T p1 = pt1.getA();
			DataType sTau = pt1.getB();
			if (p1 != null && sTau != null) {
				MapTyper<T> typer = new MapTyper<>(gamma, e, sTau, p1, te);
				return typeWithTyper(e, typer);
			} else {
				return new Pair<>(null, null);
			}
		} else {
			if (e.getExpression() == null) {
				error("There must be a collected expression", e, SosADLPackage.Literals.MAP__EXPRESSION);
			}
			if (e.getObject() == null) {
				error("The collected expression must be applied to a sequence", e, SosADLPackage.Literals.MAP__OBJECT);
			}
			if (e.getVariable() == null) {
				error("The collected expression must declare a variable", e, SosADLPackage.Literals.MAP__VARIABLE);
			}
			return new Pair<>(null, null);
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_Field(Environment gamma,
			org.archware.sosadl.sosADL.Field f, BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (f.getField() != null && f.getObject() != null) {
			Pair<T, DataType> p1 = te.apply(gamma, f.getObject());
			if (p1.getA() != null && p1.getB() != null) {
				TypeVariable v = createFreshTypeVariable(f, SosADLPackage.Literals.FIELD__FIELD,
						(lb, ub) -> chooseBetweenOrElse(lb, ub, Optional.of(createBooleanType())));
				TupleType t = createTupleType(Stream.of(createFieldDecl(f.getField(), v)));
				inference.addConstraint(p1.getB(), t, f, SosADLPackage.Literals.FIELD__FIELD);
				@SuppressWarnings("unchecked")
				Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
						(gamma_) -> p(Type_expression_node.class, v,
								(v_) -> p(Type_expression_node.class, p1.getB(),
										(tau_) -> createType_expression_Field(gamma_, f.getObject(),
												ECollections.asEList(((TupleType) tau_).getFields().stream()
														.map(this::deepSubstitute).collect(Collectors.toList())),
												f.getField(), v_, p1.getA(), createReflexivity()))));
				return new Pair<>(saveProof(f, proof), v);
			} else {
				return new Pair<>(null, null);
			}
		} else {
			if (f.getField() == null) {
				error("A field name must be provided", f, SosADLPackage.Literals.FIELD__FIELD);
			}
			if (f.getObject() == null) {
				error("An object expression must be provided", f, SosADLPackage.Literals.FIELD__OBJECT);
			}
			return new Pair<>(null, null);
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_Sequence(Environment gamma, Sequence s,
			BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (s.getElements() == null) {
			error("A sequence must have a list of items", s, null);
			return new Pair<>(null, null);
		} else if (s.getElements().stream().anyMatch((x) -> x == null)) {
			error("All the items of the sequence must be present", s, SosADLPackage.Literals.SEQUENCE__ELEMENTS);
			return new Pair<>(null, null);
		} else {
			List<Pair<Expression, Pair<T, DataType>>> elts = s.getElements().stream()
					.map((x) -> new Pair<>(x, te.apply(gamma, x))).collect(Collectors.toList());
			if (elts.stream().allMatch((x) -> x.getB() != null && x.getB().getA() != null && x.getB().getB() != null)) {
				TypeVariable v = createFreshTypeVariable(s, SosADLPackage.Literals.SEQUENCE__ELEMENTS,
						(lb, ub) -> chooseBetweenOrElse(lb, ub, Optional.of(createBooleanType())));
				elts.forEach((p) -> inference.addConstraint(p.getB().getB(), v, p.getA()));
				DataType t = createSequenceType(v);
				@SuppressWarnings("unchecked")
				Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
						(gamma_) -> p(Type_expression_node.class, t, (t_) -> {
							Forall<Expression, Ex<DataType, And<T, Subtype>>> p1 = proveForall(elts, Pair::getA,
									(p) -> {
										DataType pbb = deepSubstitute(p.getB().getB());
										return createEx_intro(pbb,
												createConj(p.getB().getA(),
														subtype(pbb, ((SequenceType) t_).getType(), p.getA(), null)
																.orElse(null)));
									});
							return createType_expression_Sequence(gamma_, s.getElements(),
									((SequenceType) t_).getType(), p1);
						}));
				return new Pair<>(saveProof(s, proof), t);
			} else {
				return new Pair<>(null, null);
			}
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_Tuple(Environment gamma, Tuple t,
			BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (t.getElements() == null) {
			error("A tuple must have a list of elements", t, null);
			return new Pair<>(null, null);
		} else if (t.getElements().stream().anyMatch((x) -> x == null)) {
			error("All the elements of the tuple must be present", t, SosADLPackage.Literals.TUPLE__ELEMENTS);
			return new Pair<>(null, null);
		} else {
			if (noDuplicate(t.getElements().stream().map((f) -> f.getLabel()))) {
				Collection<Pair<TupleElement, Pair<T, DataType>>> elts = t.getElements().stream()
						.map((f) -> new Pair<>(f, te.apply(gamma, f.getValue())))
						.collect(Collectors.toCollection(ConcurrentLinkedQueue::new));
				if (elts.stream().allMatch((p) -> p.getB().getA() != null && p.getB().getB() != null)) {
					List<Pair<TupleElement, Pair<T, FieldDecl>>> elts2 = elts.stream()
							.map((f) -> new Pair<>(f.getA(),
									new Pair<>(f.getB().getA(), createFieldDecl(f.getA().getLabel(), f.getB().getB()))))
							.collect(Collectors.toList());
					TupleType tt = createTupleType(elts2.stream().map((f) -> f.getB().getB()));
					@SuppressWarnings("unchecked")
					Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
							(gamma_) -> p(Type_expression_node.class, tt, (tt_) -> {
								Forall2<TupleElement, FieldDecl, Ex<Expression, And<Equality, Ex<DataType, And<Equality, T>>>>> p3 = proveForall2(
										elts2, (x) -> x.getA(), (x) -> getSubstitute(x.getB().getB()),
										(x) -> createEx_intro(x.getA().getValue(),
												createConj(createReflexivity(),
														createEx_intro(getSubstitute(x.getB().getB().getType()),
																createConj(createReflexivity(), x.getB().getA())))));
								return createType_expression_Tuple(gamma_, t.getElements(),
										((TupleType) tt_).getFields(), createReflexivity(),
										proveForall2(t.getElements(), ((TupleType) tt_).getFields(),
												(x, y) -> createReflexivity()),
										p3);
							}));
					return new Pair<>(saveProof(t, proof), saveType(t, tt));
				} else {
					return new Pair<>(null, null);
				}
			} else {
				t.getElements().stream()
						.filter((p) -> t.getElements().stream().map((x) -> x.getLabel())
								.filter((n) -> n.equals(p.getLabel())).count() >= 2)
						.forEach((f) -> error("Multiple fields named `" + f.getLabel() + "'", f, null));
				return new Pair<>(null, null);
			}
		}
	}

	protected abstract class CommonMethodCall<T> {
		protected final Environment gamma;
		protected final MethodCall mc;
		protected final String methodName;
		protected final DataType selfType;
		protected final List<Pair<Expression, Pair<T, DataType>>> params;

		protected int tecRank;
		protected TypeEnvContent tec;
		protected int mRank;
		protected FunctionDecl decl;

		public CommonMethodCall(Environment gamma, MethodCall mc, String methodName, DataType selfType, List<Pair<Expression, Pair<T, DataType>>> params) {
			this.gamma = gamma;
			this.mc = mc;
			this.methodName = methodName;
			this.selfType = selfType;
			this.params = params;
		}

		protected Optional<DataType> lookupAndReturnType() {
			DataType sSelfType = getSubstitute(selfType);
			List<DataType> sParamsTypes = params.stream().map(Pair::getB).map(Pair::getB)
					.map(TypeCheckerExpressionNode.this::getSubstitute).collect(Collectors.toList());
			Optional<IntPair<Pair<TypeEnvContent, IntPair<FunctionDecl>>>> method = lookupForMethod(gamma, sSelfType,
					methodName, sParamsTypes);
			if (!method.isPresent()) {
				noSuchMethod(mc, sSelfType, methodName, sParamsTypes);
			} else {
				IntPair<Pair<TypeEnvContent, IntPair<FunctionDecl>>> m = method.get();
				tecRank = m.getA();
				tec = m.getB().getA();
				mRank = m.getB().getB().getA();
				decl = m.getB().getB().getB();
				saveBinder(mc, decl);
			}
			return method.map(IntPair::getB).map(Pair::getB).map(IntPair::getB).map(FunctionDecl::getType);
		}

		public Optional<DataType> computeReturnType() {
			if (streamTypes().anyMatch(TypeInferenceSolver::containsVariable)) {
				TypeVariable v = createFreshTypeVariable(mc, null, (lb, ub) -> lookupAndReturnType());
				streamTypes().flatMap(TypeInferenceSolver::streamVariables)
						.forEach((x) -> inference.addDependency(v, x));
				return Optional.of(v);
			} else {
				return lookupAndReturnType();
			}
		}

		private Stream<DataType> streamTypes() {
			return Stream.of(Stream.of(selfType), params.stream().map(Pair::getB).map(Pair::getB)).flatMap((i) -> i);
		}
	}

	private class MethodCallTyper<T extends ProofTerm> extends CommonMethodCall<T> implements Typer<T> {
		private final T selfP;

		public MethodCallTyper(Environment gamma, MethodCall mc, String methodName, DataType selfType, T selfP,
				List<Pair<Expression, Pair<T, DataType>>> params,
				BiFunction<Environment, Expression, Pair<T, DataType>> te) {
			super(gamma, mc, methodName, selfType, params);
			this.selfP = selfP;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.archware.sosadl.validation.typing.Typer#computeProof()
		 */
		@SuppressWarnings("unchecked")
		@Override
		public Type_expression_node<T> computeProof() {
			return p(Type_expression_node.class, gamma, this::buildProof);
		}

		private Type_expression_node<T> buildProof(Environment gamma) {
            List<Pair<Expression, Pair<T, DataType>>> p = params;
			@SuppressWarnings("unchecked")
			Type_expression_node<T> proof = p(Type_expression_node.class, selfType,
					(DataType selfType_) -> p(Type_expression_node.class, decl.getData().getType(),
							(DataType ddt_) -> p(Type_expression_node.class, p,
									(params_) -> doBuildProof(gamma, selfType_, ddt_, params_))));
			return proof;
		}

		private Type_expression_node<T> doBuildProof(Environment gamma, DataType selfType_, DataType ddt_,
				List<Pair<Expression, Pair<T, DataType>>> params_) {
			return createType_expression_MethodCall(gamma, mc.getObject(), selfType_, tec.getDataTypeDecl(), ddt_,
					tec.getMethods(), methodName, decl.getParameters(), decl.getType(), mc.getParameters(), selfP,
					createEx_intro(BigInteger.valueOf(tecRank), createReflexivity()),
					subtype(selfType, decl.getData().getType(), mc, null).orElse(null),
					createEx_intro(BigInteger.valueOf(mRank),
							createConj(createReflexivity(),
									createConj(createReflexivity(),
											createConj(createReflexivity(), createReflexivity())))),
					proveForall2(decl.getParameters(), mc.getParameters(), (fp, p) -> {
						Pair<T, DataType> tp = ListUtils.assoc(params_, p);
						T pp = tp.getA();
						DataType pt = tp.getB();
						return createEx_intro(fp.getType(), createConj(createReflexivity(),
								createEx_intro(pt, createConj(pp, subtype(pt, fp.getType(), mc, null).orElse(null)))));
					}));
		}
	}

	private <T extends ProofTerm> Pair<Type_expression_node<T>, DataType> type_expression_node_MethodCall(Environment gamma,
			MethodCall mc, BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		String methodName = mc.getMethod();
		if (methodName != null) {
			Pair<T, DataType> self = te.apply(gamma, mc.getObject());
			List<Pair<Expression, Pair<T, DataType>>> params = ListExtensions.map(mc.getParameters(),
					(p) -> new Pair<>(p, te.apply(gamma, p)));
			DataType selfType = self.getB();
			if (self.getA() != null && selfType != null
					&& params.stream().allMatch((p) -> p.getA() != null && p.getB() != null)) {
				Typer<T> mct = new MethodCallTyper<>(gamma, mc, methodName, selfType, self.getA(), params, te);
				return typeWithTyper(mc, mct);
			} else {
				return new Pair<>(null, null);
			}
		} else {
			error("A method name must be provided", mc, SosADLPackage.Literals.METHOD_CALL__METHOD);
			return new Pair<>(null, null);
		}
	}

	private interface Typer<T> {

		Optional<DataType> computeReturnType();

		Type_expression_node<T> computeProof();

	}

	private <T> Pair<Type_expression_node<T>, DataType> typeWithTyper(Expression mc, Typer<T> mct) {
		Optional<DataType> oret = mct.computeReturnType();
		if (oret.isPresent()) {
			DataType ret = oret.get();
			return new Pair<>(saveProof(mc, mct.computeProof()), saveType(mc, ret));
		} else {
			return new Pair<>(null, null);
		}
	}

	protected void noSuchMethod(MethodCall mc, DataType sSelfType, String methodName, List<DataType> sParamsTypes) {
		error("No method compatible with signature: `" + TypeInferenceSolver.typeToString(sSelfType) + "::" + methodName
				+ "(" + sParamsTypes.stream().map(TypeInferenceSolver::typeToString).collect(Collectors.joining(", "))
				+ ")'", mc, SosADLPackage.Literals.METHOD_CALL__METHOD);
	}

	protected Optional<IntPair<Pair<TypeEnvContent, IntPair<FunctionDecl>>>> lookupForMethod(Environment gamma,
			DataType selfType, String methodName, List<DataType> params) {
		Stream<IntPair<TypeEnvContent>> indexedTypes = StreamUtils.indexed(gamma.stream()).flatMap((i) -> {
			if (i.getB() instanceof TypeEnvContent) {
				return Stream.of(new IntPair<>(i.getA(), (TypeEnvContent) i.getB()));
			} else {
				return Stream.empty();
			}
		});
		Stream<IntPair<TypeEnvContent>> compatibleIndexedTypes = indexedTypes
				.filter((i) -> isSubtype(selfType, i.getB().getDataType()));
		Optional<IntPair<Pair<TypeEnvContent, IntPair<FunctionDecl>>>> method = compatibleIndexedTypes
				.flatMap((i) -> StreamUtils.indexed(i.getB().getMethods().stream())
						.filter((m) -> m.getB().getName().equals(methodName))
						.filter((m) -> params.size() == m.getB().getParameters().size())
						.filter((m) -> StreamUtils.zip(params.stream(), m.getB().getParameters().stream())
								.allMatch((p) -> isSubtype(p.getA(), p.getB().getType())))
						.map((m) -> new IntPair<>(i.getA(), new Pair<>(i.getB(), m))))
				.findFirst();
		return method;
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_IdentExpression(Environment gamma,
			IdentExpression e) {
		if (e.getIdent() == null) {
			error("The identifier must refer to a name", e, SosADLPackage.Literals.IDENT_EXPRESSION__IDENT);
			return new Pair<>(null, null);
		} else {
			EnvContent ec = gamma.get(e.getIdent());
			if (ec == null) {
				error("The name `" + e.getIdent() + "' is undefined in this context", e,
						SosADLPackage.Literals.IDENT_EXPRESSION__IDENT);
				return new Pair<>(null, null);
			} else if (!(ec instanceof VariableEnvContent)) {
				error("The name `" + e.getIdent() + "' does not refer to a variable in this context", e,
						SosADLPackage.Literals.IDENT_EXPRESSION__IDENT);
				return new Pair<>(null, null);
			} else {
				VariableEnvContent vec = (VariableEnvContent) ec;
				DataType t = vec.getType();
				saveBinder(e, vec.getBinder());
				@SuppressWarnings("unchecked")
				Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
						(gamma_) -> p(Type_expression_node.class, t,
								(t_) -> createType_expression_Ident(gamma_, e.getIdent(), t_, createReflexivity())));
				return new Pair<>(saveProof(e, proof), saveType(e, t));
			}
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_BinaryExpression(Environment gamma,
			BinaryExpression e, BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (e.getLeft() == null) {
			error("The binary operator must have a left operand", e, SosADLPackage.Literals.BINARY_EXPRESSION__LEFT);
			return new Pair<>(null, null);
		} else if (e.getOp() == null) {
			error("The binary operator must have an operator", e, SosADLPackage.Literals.BINARY_EXPRESSION__OP);
			return new Pair<>(null, null);
		} else if (e.getRight() == null) {
			error("The binary operator must have a right operand", e, SosADLPackage.Literals.BINARY_EXPRESSION__RIGHT);
			return new Pair<>(null, null);
		} else {
			Pair<T, DataType> pp1 = te.apply(gamma, e.getLeft());
			T p1 = pp1.getA();
			DataType t1 = pp1.getB();
			Pair<T, DataType> pp3 = te.apply(gamma, e.getRight());
			T p3 = pp3.getA();
			DataType t3 = pp3.getB();
			if (p1 != null && t1 != null && p3 != null && t3 != null) {
				TypeInfo<T> ti = new TypeInfo<>();
				for (BinaryTypeInfo2<T, ?> i : ti.binaryTypeInformations2) {
					if (i.isCandidate(e.getOp(), t1, t3)) {
						Optional<DataType> or = i.immediateType(e, t1, t3);
						if (or.isPresent()) {
							DataType r = or.get();
							@SuppressWarnings("unchecked")
							Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
									(gamma_) -> p(Type_expression_node.class, t1,
											(t1_) -> p(Type_expression_node.class, t3,
													(t3_) -> p(Type_expression_node.class, r,
															(r_) -> i.prove(gamma_, e, p1, t1_, p3, t3_, r_)))));
							return new Pair<>(saveProof(e, proof), saveType(e, r));
						}
					}
				}
				error("Unknown binary operator with types " + TypeInferenceSolver.typeToString(t1) + " `" + e.getOp()
						+ "' " + TypeInferenceSolver.typeToString(t3), e, SosADLPackage.Literals.BINARY_EXPRESSION__OP);
				return new Pair<>(null, null);
			} else {
				return new Pair<>(null, null);
			}
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_UnaryExpression(Environment gamma,
			UnaryExpression e, BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		if (e.getRight() == null) {
			error("The unary operator must have a right operand", e, SosADLPackage.Literals.UNARY_EXPRESSION__RIGHT);
			return new Pair<>(null, null);
		} else if (e.getOp() == null) {
			error("The unary expression must have an operator", e, SosADLPackage.Literals.UNARY_EXPRESSION__OP);
			return new Pair<>(null, null);
		} else {
			Pair<T, DataType> pp1 = te.apply(gamma, e.getRight());
			T p1 = pp1.getA();
			DataType t1 = pp1.getB();
			if (p1 != null && t1 != null) {
				TypeInfo<T> ti = new TypeInfo<>();
				for (UnaryTypeInfo2<T, ?> i : ti.unaryTypeInformations2) {
					if (i.isCandidate(e.getOp(), t1)) {
						Optional<DataType> or = i.immediateType(e, t1);
						if (or.isPresent()) {
							DataType r = or.get();
							@SuppressWarnings("unchecked")
							Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
									(gamma_) -> p(Type_expression_node.class, t1,
											(t1_) -> i.prove(gamma_, e, p1, t1_)));
							return new Pair<>(saveProof(e, proof), saveType(e, r));
						}
					}
				}
				error("Unknown unary operator `" + e.getOp() + "' applied to type "
						+ TypeInferenceSolver.typeToString(t1), e, SosADLPackage.Literals.UNARY_EXPRESSION__OP);
				return new Pair<>(null, null);
			} else {
				return new Pair<>(null, null);
			}
		}
	}

	private <T> Pair<Type_expression_node<T>, DataType> type_expression_node_IntegerValue(Environment gamma,
			IntegerValue e) {
		DataType t = createRangeType(e, e);
		@SuppressWarnings("unchecked")
		Type_expression_node<T> proof = p(Type_expression_node.class, gamma,
				(gamma_) -> createType_expression_IntegerValue(gamma_,
						BigInteger.valueOf(((IntegerValue) e).getAbsInt())));
		return new Pair<>(saveProof(e, proof), saveType(e, t));
	}

}