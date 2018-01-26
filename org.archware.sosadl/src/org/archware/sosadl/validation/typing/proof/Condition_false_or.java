package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_false_or implements Condition_false {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression c1;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Expression c2;

	@Mandatory
	private final Environment gamma2;

	@Mandatory
	private final Condition_false p1;

	@Mandatory
	private final Condition_false p2;

	public Condition_false_or(Environment gamma, Expression c1, Environment gamma1, Expression c2, Environment gamma2,
			Condition_false p1, Condition_false p2) {
		super();
		this.gamma = gamma;
		this.c1 = c1;
		this.gamma1 = gamma1;
		this.c2 = c2;
		this.gamma2 = gamma2;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getC1() {
		return c1;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Expression getC2() {
		return c2;
	}

	public Environment getGamma2() {
		return gamma2;
	}

	public Condition_false getP1() {
		return p1;
	}

	public Condition_false getP2() {
		return p2;
	}

}
