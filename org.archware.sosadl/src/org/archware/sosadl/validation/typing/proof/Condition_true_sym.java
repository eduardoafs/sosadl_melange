package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_true_sym implements Condition_true {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression l;

	@Mandatory
	private final String op;

	@Mandatory
	private final Expression r;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Condition_true p1;

	public Condition_true_sym(Environment gamma, Expression l, String op, Expression r, Environment gamma1,
			Condition_true p1) {
		super();
		this.gamma = gamma;
		this.l = l;
		this.op = op;
		this.r = r;
		this.gamma1 = gamma1;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getL() {
		return l;
	}

	public String getOp() {
		return op;
	}

	public Expression getR() {
		return r;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Condition_true getP1() {
		return p1;
	}

}
