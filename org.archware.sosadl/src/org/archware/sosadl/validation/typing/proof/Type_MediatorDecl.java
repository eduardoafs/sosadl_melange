package org.archware.sosadl.validation.typing.proof;

import java.util.List;

import org.archware.sosadl.sosADL.AssertionDecl;
import org.archware.sosadl.sosADL.BehaviorDecl;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.FormalParameter;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_MediatorDecl implements Type_mediator {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String name;

	private final EList<FormalParameter> params;

	private final EList<FormalParameter> params2;

	@Mandatory
	private final Environment gamma1;

	private final EList<DataTypeDecl> datatypes;

	@Mandatory
	private final Environment gamma2;

	private final EList<DutyDecl> duties;

	@Mandatory
	private final Environment gamma3;

	@Mandatory
	private final BehaviorDecl bhv;

	private final EList<AssertionDecl> assump;

	private final EList<AssertionDecl> assrt;

	@Mandatory
	private final Mutually_translate<FormalParameter, Type_formalParameter> p1;

	@Mandatory
	private final Incrementally<DataTypeDecl, Type_datatypeDecl> p2;

	@Mandatory
	private final Ex<List<DutyDecl>, Mutually_translate<DutyDecl, Type_duty>> p3;

	@Mandatory
	private final Type_behavior p4;

	@Mandatory
	private final Forall<AssertionDecl, Type_assertion> p5;

	@Mandatory
	private final Forall<AssertionDecl, Type_assertion> p6;

	public Type_MediatorDecl(Environment gamma, String name, EList<FormalParameter> params,
			EList<FormalParameter> params2, Environment gamma1, EList<DataTypeDecl> datatypes, Environment gamma2,
			EList<DutyDecl> duties, Environment gamma3, BehaviorDecl bhv, EList<AssertionDecl> assump, EList<AssertionDecl> assrt,
			Mutually_translate<FormalParameter, Type_formalParameter> p1,
			Incrementally<DataTypeDecl, Type_datatypeDecl> p2,
			Ex<List<DutyDecl>, Mutually_translate<DutyDecl, Type_duty>> p3, Type_behavior p4,
			Forall<AssertionDecl, Type_assertion> p5, Forall<AssertionDecl, Type_assertion> p6) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.params = params;
		this.params2 = params2;
		this.gamma1 = gamma1;
		this.datatypes = datatypes;
		this.gamma2 = gamma2;
		this.duties = duties;
		this.gamma3 = gamma3;
		this.bhv = bhv;
		this.assump = assump;
		this.assrt = assrt;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getName() {
		return name;
	}

	public EList<FormalParameter> getParams() {
		return params;
	}

	public EList<FormalParameter> getParams2() {
		return params2;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public EList<DataTypeDecl> getDatatypes() {
		return datatypes;
	}

	public Environment getGamma2() {
		return gamma2;
	}

	public EList<DutyDecl> getDuties() {
		return duties;
	}

	public Environment getGamma3() {
		return gamma3;
	}

	public BehaviorDecl getBhv() {
		return bhv;
	}

	public EList<AssertionDecl> getAssump() {
		return assump;
	}

	public EList<AssertionDecl> getAssrt() {
		return assrt;
	}

	public Mutually_translate<FormalParameter, Type_formalParameter> getP1() {
		return p1;
	}

	public Incrementally<DataTypeDecl, Type_datatypeDecl> getP2() {
		return p2;
	}

	public Ex<List<DutyDecl>, Mutually_translate<DutyDecl, Type_duty>> getP3() {
		return p3;
	}

	public Type_behavior getP4() {
		return p4;
	}

	public Forall<AssertionDecl, Type_assertion> getP5() {
		return p5;
	}

	public Forall<AssertionDecl, Type_assertion> getP6() {
		return p6;
	}

}
