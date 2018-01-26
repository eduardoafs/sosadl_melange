package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Condition_true_general implements Condition_true {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression c;

	public Condition_true_general(Environment gamma, Expression c) {
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
