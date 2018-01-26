package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.ProtocolDecl;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_GateDecl implements Type_gate {

	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String name;

	private final EList<Connection> conns;

	private final EList<Connection> conns1;

	@Mandatory
	private final Environment gamma2;

	@Mandatory
	private final EList<ProtocolDecl> p;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Mutually_translate<Connection, Type_connection> p1;

	@Mandatory
	private final Forall<ProtocolDecl, Type_protocol> p2;

	public Type_GateDecl(Environment gamma, String name, EList<Connection> conns, EList<Connection> conns1,
			Environment gamma2, EList<ProtocolDecl> p, Environment gamma1, Mutually_translate<Connection, Type_connection> p1,
			Forall<ProtocolDecl, Type_protocol> p2) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.conns = conns;
		this.conns1 = conns1;
		this.gamma2 = gamma2;
		this.p = p;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getName() {
		return name;
	}

	public EList<Connection> getConns() {
		return conns;
	}

	public EList<Connection> getConns1() {
		return conns1;
	}

	public Environment getGamma2() {
		return gamma2;
	}

	public EList<ProtocolDecl> getP() {
		return p;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Mutually_translate<Connection, Type_connection> getP1() {
		return p1;
	}

	public Forall<ProtocolDecl,Type_protocol> getP2() {
		return p2;
	}

}
