package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Type_expression_Div_neg<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression l;

	@Mandatory
	private final DataType l__tau;

	@Mandatory
	private final Expression l__min;

	@Mandatory
	private final Expression l__max;

	@Mandatory
	private final Expression r;

	@Mandatory
	private final DataType r__tau;

	@Mandatory
	private final Expression r__min;

	@Mandatory
	private final Expression r__max;

	@Mandatory
	private final Expression min;

	@Mandatory
	private final Expression max;

	@Mandatory
	private final T p1;

	@Mandatory
	private final Subtype p2;

	@Mandatory
	private final T p3;

	@Mandatory
	private final Subtype p4;

	@Mandatory
	private final Expression_le p5;

	@Mandatory
	private final Expression_le p6;

	@Mandatory
	private final Expression_le p7;

	@Mandatory
	private final Expression_le p8;

	@Mandatory
	private final Expression_le p9;

	@Mandatory
	private final Expression_le pa;

	@Mandatory
	private final Expression_le pb;

	@Mandatory
	private final Expression_le pc;

	@Mandatory
	private final Expression_le pd;

	public Type_expression_Div_neg(Environment gamma, Expression l, DataType l__tau, Expression l__min,
			Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max, Expression min,
			Expression max, T p1, Subtype p2, T p3, Subtype p4, Expression_le p5, Expression_le p6, Expression_le p7,
			Expression_le p8, Expression_le p9, Expression_le pa, Expression_le pb, Expression_le pc,
			Expression_le pd) {
		super();
		this.gamma = gamma;
		this.l = l;
		this.l__tau = l__tau;
		this.l__min = l__min;
		this.l__max = l__max;
		this.r = r;
		this.r__tau = r__tau;
		this.r__min = r__min;
		this.r__max = r__max;
		this.min = min;
		this.max = max;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		this.pa = pa;
		this.pb = pb;
		this.pc = pc;
		this.pd = pd;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getL() {
		return l;
	}

	public DataType getL__tau() {
		return l__tau;
	}

	public Expression getL__min() {
		return l__min;
	}

	public Expression getL__max() {
		return l__max;
	}

	public Expression getR() {
		return r;
	}

	public DataType getR__tau() {
		return r__tau;
	}

	public Expression getR__min() {
		return r__min;
	}

	public Expression getR__max() {
		return r__max;
	}

	public Expression getMin() {
		return min;
	}

	public Expression getMax() {
		return max;
	}

	public T getP1() {
		return p1;
	}

	public Subtype getP2() {
		return p2;
	}

	public T getP3() {
		return p3;
	}

	public Subtype getP4() {
		return p4;
	}

	public Expression_le getP5() {
		return p5;
	}

	public Expression_le getP6() {
		return p6;
	}

	public Expression_le getP7() {
		return p7;
	}

	public Expression_le getP8() {
		return p8;
	}

	public Expression_le getP9() {
		return p9;
	}

	public Expression_le getPa() {
		return pa;
	}

	public Expression_le getPb() {
		return pb;
	}

	public Expression_le getPc() {
		return pc;
	}

	public Expression_le getPd() {
		return pd;
	}

}
