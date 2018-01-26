package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;

public class Check_SequenceType implements Check_datatype {
	@Mandatory
	private final DataType t;

	@Mandatory
	private final Check_datatype p1;

	public Check_SequenceType(DataType t, Check_datatype p1) {
		super();
		this.t = t;
		this.p1 = p1;
	}

	public DataType getT() {
		return t;
	}

	public Check_datatype getP1() {
		return p1;
	}

}
