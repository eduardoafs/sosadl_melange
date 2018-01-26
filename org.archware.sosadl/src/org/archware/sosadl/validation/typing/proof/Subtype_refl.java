package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;

public class Subtype_refl implements Subtype {
	@Mandatory
	private final DataType t;

	public Subtype_refl(DataType t) {
		super();
		this.t = t;
	}

	public DataType getT() {
		return t;
	}
}
