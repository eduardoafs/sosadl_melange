package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_true_ge implements Condition_true {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String x;

	@Mandatory
	private final Expression x_min;

	@Mandatory
	private final Expression x_min_;

	@Mandatory
	private final Expression x_max;

	@Mandatory
	private final Expression r;

	@Mandatory
	private final Expression r_min;

	@Mandatory
	private final Expression r_max;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Type_expression p1;

	@Mandatory
	private final Type_expression p2;

	@Mandatory
	private final Greatest p3;

	@Mandatory
	private final Check_datatype p4;

	@Mandatory
	private final Condition_true p5;

	public Condition_true_ge(Environment gamma, String x, Expression x_min, Expression x_min_, Expression x_max,
			Expression r, Expression r_min, Expression r_max, Environment gamma1, Type_expression p1,
			Type_expression p2, Greatest p3, Check_datatype p4, Condition_true p5) {
		super();
		this.gamma = gamma;
		this.x = x;
		this.x_min = x_min;
		this.x_min_ = x_min_;
		this.x_max = x_max;
		this.r = r;
		this.r_min = r_min;
		this.r_max = r_max;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getX() {
		return x;
	}

	public Expression getX_min() {
		return x_min;
	}

	public Expression getX_min_() {
		return x_min_;
	}

	public Expression getX_max() {
		return x_max;
	}

	public Expression getR() {
		return r;
	}

	public Expression getR_min() {
		return r_min;
	}

	public Expression getR_max() {
		return r_max;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Type_expression getP1() {
		return p1;
	}

	public Type_expression getP2() {
		return p2;
	}

	public Greatest getP3() {
		return p3;
	}

	public Check_datatype getP4() {
		return p4;
	}

	public Condition_true getP5() {
		return p5;
	}

}
