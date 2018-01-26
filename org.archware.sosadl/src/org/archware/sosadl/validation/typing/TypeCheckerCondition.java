package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.IdentExpression;
import org.archware.sosadl.sosADL.RangeType;
import org.archware.sosadl.sosADL.UnaryExpression;
import org.archware.sosadl.validation.typing.impl.VariableEnvContent;
import org.archware.sosadl.validation.typing.proof.Check_datatype;
import org.archware.sosadl.validation.typing.proof.Condition_false;
import org.archware.sosadl.validation.typing.proof.Condition_true;
import org.archware.sosadl.validation.typing.proof.Greatest;
import org.archware.sosadl.validation.typing.proof.Smallest;
import org.archware.sosadl.validation.typing.proof.Type_expression;
import org.archware.utils.Pair;
import org.eclipse.emf.ecore.EObject;

public abstract class TypeCheckerCondition extends TypeCheckerExpression {

	public TypeCheckerCondition() {
		super();
	}

	protected Pair<Environment, Condition_false> condition_false(Environment gamma, Expression c, EObject branch) {
		return condition_false(gamma, c, true, branch);
	}

	protected Pair<Environment, Condition_true> condition_true(Environment gamma, Expression c, EObject branch) {
		return condition_true(gamma, c, true, branch);
	}

	protected Pair<Environment, Condition_false> condition_false(Environment gamma, Expression c, boolean sym,
			EObject branch) {
		if (c instanceof UnaryExpression) {
			UnaryExpression u = (UnaryExpression) c;
			String op = u.getOp();
			Expression r = u.getRight();
			if (op != null && r != null) {
				if ("not".equals(op)) {
					Pair<Environment, Condition_true> p = condition_true(gamma, r, sym, branch);
					return new Pair<>(p.getA(), p(Condition_false.class, gamma, (gamma_) -> p(Condition_false.class,
							p.getA(), (gamma1_) -> createCondition_false_not(gamma_, r, gamma1_, p.getB()))));
				}
			}
		} else if (c instanceof BinaryExpression) {
			BinaryExpression b = (BinaryExpression) c;
			Expression l = b.getLeft();
			String op = b.getOp();
			Expression r = b.getRight();
			if (l != null && op != null && r != null) {
				if ("or".equals(op)) {
					Pair<Environment, Condition_false> p1 = condition_false(gamma, l, sym, branch);
					Pair<Environment, Condition_false> p2 = condition_false(p1.getA(), r, sym, branch);
					return new Pair<>(p2.getA(),
							p(Condition_false.class, gamma,
									(gamma_) -> p(Condition_false.class, p1.getA(),
											(gamma1_) -> p(Condition_false.class, p2.getA(),
													(gamma2_) -> createCondition_false_or(gamma_, l, gamma1_, r,
															gamma2_, p1.getB(), p2.getB())))));
				} else {
					String negated = negatedComparison(op);
					if (negated != null) {
						Pair<Environment, Condition_true> p1 = condition_true(gamma,
								createBinaryExpression(l, negated, r), sym, branch);
						return new Pair<>(p1.getA(),
								p(Condition_false.class, gamma, (gamma_) -> p(Condition_false.class, p1.getA(),
										(gamma1_) -> createCondition_false_cmp(gamma_, l, op, r, gamma1_, p1.getB()))));
					}
				}
			}
		}
		return new Pair<>(gamma, p(Condition_false.class, gamma, (gamma_) -> createCondition_false_general(gamma_, c)));
	}

	private String negatedComparison(String op) {
		switch (op) {
		case "<":
			return ">=";
		case "<=":
			return ">";
		case ">":
			return "<=";
		case ">=":
			return "<";
		case "=":
			return "<>";
		case "<>":
			return "=";
		default:
			return null;
		}
	}

	protected Pair<Environment, Condition_true> condition_true(Environment gamma, Expression c, boolean sym,
			EObject branch) {
		if (c instanceof UnaryExpression) {
			UnaryExpression u = (UnaryExpression) c;
			String op = u.getOp();
			Expression r = u.getRight();
			if (op != null && r != null) {
				if ("not".equals(op)) {
					Pair<Environment, Condition_false> p = condition_false(gamma, r, sym, branch);
					return new Pair<>(p.getA(), p(Condition_true.class, gamma, (gamma_) -> p(Condition_true.class,
							p.getA(), (gamma1_) -> createCondition_true_not(gamma_, r, gamma1_, p.getB()))));
				}
			}
		} else if (c instanceof BinaryExpression) {
			BinaryExpression b = (BinaryExpression) c;
			Expression l = b.getLeft();
			String op = b.getOp();
			Expression r = b.getRight();
			if (l != null && op != null && r != null) {
				if ("and".equals(op)) {
					Pair<Environment, Condition_true> p1 = condition_true(gamma, l, sym, branch);
					Pair<Environment, Condition_true> p2 = condition_true(p1.getA(), r, sym, branch);
					return new Pair<>(p2.getA(),
							p(Condition_true.class, gamma,
									(gamma_) -> p(Condition_true.class, p1.getA(),
											(gamma1_) -> p(Condition_true.class, p2.getA(),
													(gamma2_) -> createCondition_true_and(gamma_, l, gamma1_, r,
															gamma2_, p1.getB(), p2.getB())))));
				} else {
					String symmetric = symmetricComparison(op);
					if (symmetric != null) {
						Expression symExpr = createBinaryExpression(r, symmetric, l);
						if (l instanceof IdentExpression) {
							IdentExpression i = (IdentExpression) l;
							String x = i.getIdent();
							if (x != null) {
								Pair<Type_expression, DataType> pt1 = type_expression(gamma, i);
								Type_expression p1 = pt1.getA();
								DataType t1 = pt1.getB();
								if (p1 != null && t1 != null) {
									if (t1 instanceof RangeType) {
										RangeType rt1 = (RangeType) t1;
										Expression x_min = rt1.getVmin();
										Expression x_max = rt1.getVmax();
										Pair<Type_expression, DataType> pt2 = type_expression(gamma, r);
										Type_expression p2 = pt2.getA();
										DataType t2 = pt2.getB();
										if (p2 != null && t2 != null) {
											if (t2 instanceof RangeType) {
												RangeType rt2 = (RangeType) t2;
												Expression r_min = rt2.getVmin();
												Expression r_max = rt2.getVmax();
												return doComparisons(gamma, c, sym, branch, op, r, symExpr, x, p1,
														x_min, x_max, p2, r_min, r_max);
											}
										} else {
											throw new IllegalArgumentException();
										}
									}
								} else {
									throw new IllegalArgumentException();
								}
							}
						} else if (sym) {
							Pair<Environment, Condition_true> p1 = condition_true(gamma, symExpr, false, branch);
							return new Pair<>(p1.getA(), p(Condition_true.class, gamma, (gamma_) -> p(
									Condition_true.class, p1.getA(),
									(gamma1_) -> createCondition_true_sym(gamma_, l, op, r, gamma1_, p1.getB()))));
						}
					}
				}
			}
		}
		return new Pair<>(gamma, p(Condition_true.class, gamma, (gamma_) -> createCondition_true_general(gamma_, c)));
	}

	private Pair<Environment, Condition_true> doComparisons(Environment gamma, Expression c, boolean sym,
			EObject branch, String op, Expression r, Expression symExpr, String x, Type_expression p1, Expression x_min,
			Expression x_max, Type_expression p2, Expression r_min, Expression r_max) {
		if ("<".equals(op)) {
			Pair<Expression, Smallest> ep3 = smallest(x_max, createBinaryExpression(r_max, "-", 1));
			Expression x_max_ = ep3.getA();
			Smallest p3 = ep3.getB();
			if (x_max_ != null && p3 != null) {
				if (isLe(x_min, x_max_)) {
					RangeType t = createRangeType(x_min, x_max_);
					Check_datatype p4 = check_datatype(t);
					if (p4 != null) {
						Pair<Environment, Condition_true> p5 = maybe_condition_true(rebindVariable(gamma, x, t),
								symExpr, sym, branch);
						return new Pair<>(p5.getA(),
								p(Condition_true.class, gamma,
										(gamma_) -> p(Condition_true.class, p5.getA(),
												(gamma1_) -> createCondition_true_lt(gamma_, x, x_min, x_max, x_max_, r,
														r_min, r_max, gamma1_, p1, p2, p3, p4, p5.getB()))));
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					error("This branch is dead", branch, null);
					return new Pair<>(gamma, null);
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if ("<=".equals(op)) {
			Pair<Expression, Smallest> ep3 = smallest(x_max, r_max);
			Expression x_max_ = ep3.getA();
			Smallest p3 = ep3.getB();
			if (x_max_ != null && p3 != null) {
				if (isLe(x_min, x_max_)) {
					RangeType t = createRangeType(x_min, x_max_);
					Check_datatype p4 = check_datatype(t);
					if (p4 != null) {
						Pair<Environment, Condition_true> p5 = maybe_condition_true(rebindVariable(gamma, x, t),
								symExpr, sym, branch);
						return new Pair<>(p5.getA(),
								p(Condition_true.class, gamma,
										(gamma_) -> p(Condition_true.class, p5.getA(),
												(gamma1_) -> createCondition_true_le(gamma_, x, x_min, x_max, x_max_, r,
														r_min, r_max, gamma1_, p1, p2, p3, p4, p5.getB()))));
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					error("This branch is dead", branch, null);
					return new Pair<>(gamma, null);
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (">".equals(op)) {
			Pair<Expression, Greatest> ep3 = greatest(x_min, createBinaryExpression(r_min, "+", 1));
			Expression x_min_ = ep3.getA();
			Greatest p3 = ep3.getB();
			if (x_min_ != null && p3 != null) {
				if (isLe(x_min_, x_max)) {
					RangeType t = createRangeType(x_min_, x_max);
					Check_datatype p4 = check_datatype(t);
					if (p4 != null) {
						Pair<Environment, Condition_true> p5 = maybe_condition_true(rebindVariable(gamma, x, t),
								symExpr, sym, branch);
						return new Pair<>(p5.getA(),
								p(Condition_true.class, gamma,
										(gamma_) -> p(Condition_true.class, p5.getA(),
												(gamma1_) -> createCondition_true_gt(gamma_, x, x_min, x_min_, x_max, r,
														r_min, r_max, gamma1_, p1, p2, p3, p4, p5.getB()))));
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					error("This branch is dead", branch, null);
					return new Pair<>(gamma, null);
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (">=".equals(op)) {
			Pair<Expression, Greatest> ep3 = greatest(x_min, r_min);
			Expression x_min_ = ep3.getA();
			Greatest p3 = ep3.getB();
			if (x_min_ != null && p3 != null) {
				if (isLe(x_min_, x_max)) {
					RangeType t = createRangeType(x_min_, x_max);
					Check_datatype p4 = check_datatype(t);
					if (p4 != null) {
						Pair<Environment, Condition_true> p5 = maybe_condition_true(rebindVariable(gamma, x, t),
								symExpr, sym, branch);
						return new Pair<>(p5.getA(),
								p(Condition_true.class, gamma,
										(gamma_) -> p(Condition_true.class, p5.getA(),
												(gamma1_) -> createCondition_true_ge(gamma_, x, x_min, x_min_, x_max, r,
														r_min, r_max, gamma1_, p1, p2, p3, p4, p5.getB()))));
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					error("This branch is dead", branch, null);
					return new Pair<>(gamma, null);
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if ("=".equals(op)) {
			Pair<Expression, Greatest> ep3 = greatest(x_min, r_min);
			Expression x_min_ = ep3.getA();
			Greatest p3 = ep3.getB();
			Pair<Expression, Smallest> ep4 = smallest(x_max, r_max);
			Expression x_max_ = ep4.getA();
			Smallest p4 = ep4.getB();
			if (x_min_ != null && x_max_ != null && p3 != null && p4 != null) {
				if (isLe(x_min_, x_max_)) {
					RangeType t = createRangeType(x_min_, x_max_);
					Check_datatype p5 = check_datatype(t);
					if (p5 != null) {
						Pair<Environment, Condition_true> p6 = maybe_condition_true(rebindVariable(gamma, x, t),
								symExpr, sym, branch);
						return new Pair<>(p6.getA(),
								p(Condition_true.class, gamma,
										(gamma_) -> p(Condition_true.class, p6.getA(),
												(gamma1_) -> createCondition_true_eq(gamma_, x, x_min, x_min_, x_max,
														x_max_, r, r_min, r_max, gamma1_, p1, p2, p3, p4, p5,
														p6.getB()))));
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					error("This branch is dead", branch, null);
					return new Pair<>(gamma, null);
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			return new Pair<>(gamma,
					p(Condition_true.class, gamma, (gamma_) -> createCondition_true_general(gamma_, c)));
		}
	}

	private Pair<Environment, Condition_true> maybe_condition_true(Environment gamma, Expression c, boolean sym,
			EObject branch) {
		if (sym) {
			return condition_true(gamma, c, false, branch);
		} else {
			return new Pair<>(gamma,
					p(Condition_true.class, gamma, (gamma_) -> createCondition_true_general(gamma_, c)));
		}
	}

	private Environment rebindVariable(Environment gamma, String x, DataType t) {
		EnvContent c = gamma.get(x);
		if (c != null && c instanceof VariableEnvContent) {
			return gamma.put(x, new VariableEnvContent(((VariableEnvContent) c).getBinder(), t));
		} else {
			throw new IllegalArgumentException();
		}
	}

	private Pair<Expression, Smallest> smallest(Expression l, Expression r) {
		if (isLe(l, r)) {
			return new Pair<>(l, createSmallest_l(l, l, r, expression_le(l, l), expression_le(l, r)));
		} else {
			return new Pair<>(r, createSmallest_r(r, l, r, expression_le(r, r), expression_le(r, l)));
		}
	}

	private Pair<Expression, Greatest> greatest(Expression l, Expression r) {
		if (isLe(l, r)) {
			return new Pair<>(r, createGreatest_r(r, l, r, expression_le(r, r), expression_le(l, r)));
		} else {
			return new Pair<>(l, createGreatest_l(l, l, r, expression_le(l, l), expression_le(r, l)));
		}
	}

	private String symmetricComparison(String op) {
		switch (op) {
		case "<":
			return ">";
		case "<=":
			return ">=";
		case ">":
			return "<";
		case ">=":
			return "<=";
		case "=":
			return "=";
		default:
			return null;
		}
	}

}