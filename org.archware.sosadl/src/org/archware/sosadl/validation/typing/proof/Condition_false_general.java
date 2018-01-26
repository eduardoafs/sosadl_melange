package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_false_general implements Condition_false {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression c;

	public Condition_false_general(Environment gamma, Expression c) {
		super();
		this.gamma = gamma;
		this.c = c;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getC() {
		return c;
	}

}
