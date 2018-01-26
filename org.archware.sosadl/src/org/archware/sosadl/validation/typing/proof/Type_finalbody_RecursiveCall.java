package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

public class Type_finalbody_RecursiveCall implements Type_finalbody_other {
	@Mandatory
	private final Environment gamma;

	public Type_finalbody_RecursiveCall(Environment gamma) {
		super();
		this.gamma = gamma;
	}

	public Environment getGamma() {
		return gamma;
	}

}
