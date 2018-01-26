package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.validation.typing.Environment;

public class Type_SequenceType implements Type_datatype {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final DataType t;

	@Mandatory
	private final DataType t2;

	@Mandatory
	private final Type_datatype p;

	public Type_SequenceType(Environment gamma, DataType t, DataType t2, Type_datatype p) {
		super();
		this.gamma = gamma;
		this.t = t;
		this.t2 = t2;
		this.p = p;
	}

	public Environment getGamma() {
		return gamma;
	}

	public DataType getT() {
		return t;
	}

	public DataType getT2() {
		return t2;
	}

	public Type_datatype getP() {
		return p;
	}

}
