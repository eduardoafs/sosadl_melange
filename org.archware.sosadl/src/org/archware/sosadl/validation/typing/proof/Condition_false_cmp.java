package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_false_cmp implements Condition_false {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression c1;

	@Mandatory
	private final String op;

	@Mandatory
	private final Expression c2;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Condition_true p1;

	public Condition_false_cmp(Environment gamma, Expression c1, String op, Expression c2, Environment gamma1,
			Condition_true p1) {
		super();
		this.gamma = gamma;
		this.c1 = c1;
		this.op = op;
		this.c2 = c2;
		this.gamma1 = gamma1;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getC1() {
		return c1;
	}

	public String getOp() {
		return op;
	}

	public Expression getC2() {
		return c2;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Condition_true getP1() {
		return p1;
	}

}
