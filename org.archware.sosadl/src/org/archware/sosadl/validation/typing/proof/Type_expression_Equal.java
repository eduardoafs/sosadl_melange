package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Type_expression_Equal<T> implements Type_expression_node<T> {
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
	private final T p1;

	@Mandatory
	private final Subtype p2;

	@Mandatory
	private final T p3;

	@Mandatory
	private final Subtype p4;

	public Type_expression_Equal(Environment gamma, Expression l, DataType l__tau, Expression l__min, Expression l__max,
			Expression r, DataType r__tau, Expression r__min, Expression r__max, T p1, Subtype p2, T p3, Subtype p4) {
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
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
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

}
