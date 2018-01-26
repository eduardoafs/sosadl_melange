package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FormalParameter;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_DataTypeDecl_def implements Type_datatypeDecl {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String name;

	@Mandatory
	private final DataType t;

	@Mandatory
	private final DataType t2;

	private final EList<FunctionDecl> funs;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Type_datatype p1;

	@Mandatory
	private final Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> p2;

	@Mandatory
	private final Incrementally<FunctionDecl, Type_function> p3;

	public Type_DataTypeDecl_def(Environment gamma, String name, DataType t, DataType t2, EList<FunctionDecl> funs,
			Environment gamma1, Type_datatype p1, Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> p2,
			Incrementally<FunctionDecl, Type_function> p3) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.t = t;
		this.t2 = t2;
		this.funs = funs;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getName() {
		return name;
	}

	public DataType getT() {
		return t;
	}

	public DataType getT2() {
		return t2;
	}

	public EList<FunctionDecl> getFuns() {
		return funs;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Type_datatype getP1() {
		return p1;
	}

	public Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> getP2() {
		return p2;
	}

	public Incrementally<FunctionDecl, Type_function> getP3() {
		return p3;
	}

}
