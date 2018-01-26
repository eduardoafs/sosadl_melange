package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

public class Type_BooleanType implements Type_datatype {
	@Mandatory
	private final Environment gamma;

	public Type_BooleanType(Environment gamma) {
		super();
		this.gamma = gamma;
	}

	public Environment getGamma() {
		return gamma;
	}

}
