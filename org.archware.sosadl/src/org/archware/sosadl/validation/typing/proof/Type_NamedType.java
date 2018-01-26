package org.archware.sosadl.validation.typing.proof;

import java.util.List;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.validation.typing.Environment;

public class Type_NamedType implements Type_datatype {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String n;

	@Mandatory
	private final DataType u;

	@Mandatory
	private final DataTypeDecl t;

	@Mandatory
	private final Ex<List<FunctionDecl>, Equality> p;

	public Type_NamedType(Environment gamma, String n, DataType u, DataTypeDecl t, Ex<List<FunctionDecl>, Equality> p) {
		super();
		this.gamma = gamma;
		this.n = n;
		this.u = u;
		this.t = t;
		this.p = p;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getN() {
		return n;
	}

	public DataType getU() {
		return u;
	}

	public DataTypeDecl getT() {
		return t;
	}

	public Ex<List<FunctionDecl>, Equality> getP() {
		return p;
	}

}
