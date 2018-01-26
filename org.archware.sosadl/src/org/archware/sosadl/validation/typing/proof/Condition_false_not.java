package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_false_not implements Condition_false {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression c;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Condition_true p1;

	public Condition_false_not(Environment gamma, Expression c, Environment gamma1, Condition_true p1) {
		super();
		this.gamma = gamma;
		this.c = c;
		this.gamma1 = gamma1;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getC() {
		return c;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Condition_true getP1() {
		return p1;
	}

}
