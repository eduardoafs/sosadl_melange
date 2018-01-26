package org.archware.sosadl.validation.typing.proof;

import java.util.List;

import org.archware.sosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.sosADL.MediatorDecl;
import org.archware.sosadl.sosADL.SystemDecl;
import org.archware.sosadl.validation.typing.Environment;

public class Type_EntityBlock_whole implements Type_entityBlock {
	@Mandatory
	private final Environment gamma;

	private final List<DataTypeDecl> datatypes;

	@Mandatory
	private final Environment gamma1;

	private final List<FunctionDecl> funs;

	@Mandatory
	private final Environment gamma2;

	private final List<SystemDecl> systems;

	@Mandatory
	private final Environment gamma3;

	private final List<MediatorDecl> mediators;

	@Mandatory
	private final Environment gamma4;

	private final List<ArchitectureDecl> architectures;

	@Mandatory
	private final Environment gamma5;

	@Mandatory
	private final Incrementally<DataTypeDecl, Type_datatypeDecl> p1;

	@Mandatory
	private final Incrementally<FunctionDecl, Type_function> p2;

	@Mandatory
	private final Incrementally<SystemDecl, Simple_increment<SystemDecl, Type_system>> p3;

	@Mandatory
	private final Incrementally<MediatorDecl, Simple_increment<MediatorDecl, Type_mediator>> p4;

	@Mandatory
	private final Incrementally<ArchitectureDecl, Simple_increment<ArchitectureDecl, Type_architecture>> p5;

	public Type_EntityBlock_whole(Environment gamma, List<DataTypeDecl> datatypes, Environment gamma1,
			List<FunctionDecl> funs, Environment gamma2, List<SystemDecl> systems, Environment gamma3,
			List<MediatorDecl> mediators, Environment gamma4, List<ArchitectureDecl> architectures, Environment gamma5,
			Incrementally<DataTypeDecl, Type_datatypeDecl> p1, Incrementally<FunctionDecl, Type_function> p2,
			Incrementally<SystemDecl, Simple_increment<SystemDecl, Type_system>> p3,
			Incrementally<MediatorDecl, Simple_increment<MediatorDecl, Type_mediator>> p4,
			Incrementally<ArchitectureDecl, Simple_increment<ArchitectureDecl, Type_architecture>> p5) {
		super();
		this.gamma = gamma;
		this.datatypes = datatypes;
		this.gamma1 = gamma1;
		this.funs = funs;
		this.gamma2 = gamma2;
		this.systems = systems;
		this.gamma3 = gamma3;
		this.mediators = mediators;
		this.gamma4 = gamma4;
		this.architectures = architectures;
		this.gamma5 = gamma5;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
	}

	public Environment getGamma() {
		return gamma;
	}

	public List<DataTypeDecl> getDatatypes() {
		return datatypes;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public List<FunctionDecl> getFuns() {
		return funs;
	}

	public Environment getGamma2() {
		return gamma2;
	}

	public List<SystemDecl> getSystems() {
		return systems;
	}

	public Environment getGamma3() {
		return gamma3;
	}

	public List<MediatorDecl> getMediators() {
		return mediators;
	}

	public Environment getGamma4() {
		return gamma4;
	}

	public List<ArchitectureDecl> getArchitectures() {
		return architectures;
	}

	public Environment getGamma5() {
		return gamma5;
	}

	public Incrementally<DataTypeDecl, Type_datatypeDecl> getP1() {
		return p1;
	}

	public Incrementally<FunctionDecl, Type_function> getP2() {
		return p2;
	}

	public Incrementally<SystemDecl, Simple_increment<SystemDecl, Type_system>> getP3() {
		return p3;
	}

	public Incrementally<MediatorDecl, Simple_increment<MediatorDecl, Type_mediator>> getP4() {
		return p4;
	}

	public Incrementally<ArchitectureDecl, Simple_increment<ArchitectureDecl, Type_architecture>> getP5() {
		return p5;
	}

}
