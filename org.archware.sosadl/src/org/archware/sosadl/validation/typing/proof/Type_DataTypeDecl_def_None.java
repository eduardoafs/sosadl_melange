package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.FormalParameter;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_DataTypeDecl_def_None implements Type_datatypeDecl {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String name;

	@Mandatory
	private final String name2;

	private final EList<FunctionDecl> funs;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> p2;

	@Mandatory
	private final Incrementally<FunctionDecl, Type_function> p3;

	public Type_DataTypeDecl_def_None(Environment gamma, String name, String name2, EList<FunctionDecl> funs,
			Environment gamma1, Equality p1, Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> p2,
			Incrementally<FunctionDecl, Type_function> p3) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.name2 = name2;
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

	public String getName2() {
		return name2;
	}

	public EList<FunctionDecl> getFuns() {
		return funs;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Equality getP1() {
		return p1;
	}

	public Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> getP2() {
		return p2;
	}

	public Incrementally<FunctionDecl, Type_function> getP3() {
		return p3;
	}
}
