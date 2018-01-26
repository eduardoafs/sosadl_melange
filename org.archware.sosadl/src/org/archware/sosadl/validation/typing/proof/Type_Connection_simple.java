package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.ModeType;
import org.archware.sosadl.validation.typing.Environment;

public class Type_Connection_simple implements Type_connection {
	@Mandatory private final Environment gamma;
	
	@Mandatory private final String name;
	
	@Mandatory private final boolean k;
	
	@Mandatory private final ModeType m;
	
	@Mandatory private final DataType t;
	
	@Mandatory private final DataType t1;
	
	@Mandatory private final Environment gamma1;
	
	@Mandatory private final Type_datatype p1;

	public Type_Connection_simple(Environment gamma, String name, boolean k, ModeType m, DataType t, DataType t1,
			Environment gamma1, Type_datatype p1) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.k = k;
		this.m = m;
		this.t = t;
		this.t1 = t1;
		this.gamma1 = gamma1;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getName() {
		return name;
	}

	public boolean isK() {
		return k;
	}

	public ModeType getM() {
		return m;
	}

	public DataType getT() {
		return t;
	}

	public DataType getT1() {
		return t1;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Type_datatype getP1() {
		return p1;
	}

}
