package org.archware.sosadl.validation.typing;

import java.util.List;

import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.SosADLPackage;
import org.archware.sosadl.validation.typing.impl.ConnectionEnvContent;
import org.archware.sosadl.validation.typing.impl.GateOrDutyEnvContent;
import org.archware.sosadl.validation.typing.proof.Ex;
import org.archware.sosadl.validation.typing.proof.Mutually_translate;
import org.archware.sosadl.validation.typing.proof.Type_connection;
import org.archware.sosadl.validation.typing.proof.Type_datatype;
import org.archware.sosadl.validation.typing.proof.Type_duty;
import org.archware.sosadl.validation.typing.proof.Type_gate;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.EList;

public abstract class TypeCheckerConnections extends TypeCheckerProtocol {

	private Type_connection type_connection(Environment gamma, Connection c, Connection c1, Environment gamma1,
			Type_datatype p1) {
		return saveProof(c, createType_Connection_simple(gamma, c.getName(), c.isEnvironment(), c.getMode(),
				c.getValueType(), c1.getValueType(), gamma1, p1));
	}

	private Pair<Connection, Type_datatype> translate_connection(Environment gamma, Connection c) {
		if (c.getName() != null && c.getMode() != null && c.getValueType() != null) {
			Pair<DataType, Type_datatype> p = type_datatype(gamma, c.getValueType());
			return new Pair<>(createConnection(c.isEnvironment(), c.getName(), c.getMode(), p.getA()), p.getB());
		} else {
			if (c.getName() == null) {
				error("The connection must have a name", c, SosADLPackage.Literals.CONNECTION__NAME);
			}
			if (c.getMode() == null) {
				error("The connection must have an in/out mode", c, SosADLPackage.Literals.CONNECTION__MODE);
			}
			if (c.getValueType() == null) {
				error("The connection must have a type", c, SosADLPackage.Literals.CONNECTION__VALUE_TYPE);
			}
			return null;
		}
	}

	private Pair<Pair<List<Connection>, Environment>, Mutually_translate<Connection, Type_connection>> type_connections(
			Environment gamma, EList<Connection> l) {
		return proveMutuallyTranslate(gamma, l, this::translate_connection, this::type_connection,
				"SosADL.SosADL.Connection_name", Connection::getName,
				"(fun x => Some (SosADL.TypeSystem.EConnection x))", (c, c1) -> new ConnectionEnvContent(c, c1));
	}

	private Type_gate type_gate(Environment gamma, GateDecl g, GateDecl g1, Environment gamma1,
			Pair<Environment, Mutually_translate<Connection, Type_connection>> p1) {
		return saveProof(g, createType_GateDecl(gamma, g1.getName(), g.getConnections(), g1.getConnections(), p1.getA(),
				g1.getProtocols(), gamma1, p1.getB(), proveForall(g.getProtocols(), (p) -> type_protocol(p1.getA(), p))));
	}

	private Pair<GateDecl, Pair<Environment, Mutually_translate<Connection, Type_connection>>> translate_gate(
			Environment gamma, GateDecl g) {
		if (g.getName() != null) {
			Pair<Pair<List<Connection>, Environment>, Mutually_translate<Connection, Type_connection>> pc = type_connections(
					gamma, g.getConnections());
			if (pc.getA() != null && pc.getA().getA() != null && pc.getA().getB() != null) {
				return new Pair<>(createGateDecl(g.getName(), pc.getA().getA(), g.getProtocols()),
						new Pair<>(pc.getA().getB(), pc.getB()));
			} else {
				return null;
			}
		} else {
			if (g.getName() == null) {
				error("The gate must have a name", g, SosADLPackage.Literals.GATE_DECL__NAME);
			}
			return null;
		}
	}

	private Type_duty type_duty(Environment gamma, DutyDecl g, DutyDecl g1, Environment gamma1,
			Pair<Environment, Mutually_translate<Connection, Type_connection>> p1) {
		return saveProof(g,
				createType_DutyDecl(gamma, g1.getName(), g.getConnections(), g1.getConnections(), p1.getA(),
						g1.getAssertions(), g1.getProtocols(), gamma1, p1.getB(),
						proveForall(g.getAssertions(), (a) -> type_assertion(p1.getA(), a)),
						proveForall(g.getProtocols(), (p) -> type_protocol(p1.getA(), p))));
	}

	private Pair<DutyDecl, Pair<Environment, Mutually_translate<Connection, Type_connection>>> translate_duty(
			Environment gamma, DutyDecl g) {
		if (g.getName() != null) {
			Pair<Pair<List<Connection>, Environment>, Mutually_translate<Connection, Type_connection>> pc = type_connections(
					gamma, g.getConnections());
			if (pc.getA() != null && pc.getA().getA() != null && pc.getA().getB() != null) {
				return new Pair<>(createDutyDecl(g.getName(), pc.getA().getA(), g.getAssertions(), g.getProtocols()),
						new Pair<>(pc.getA().getB(), pc.getB()));
			} else {
				return null;
			}
		} else {
			if (g.getName() == null) {
				error("The duty must have a name", g, SosADLPackage.Literals.DUTY_DECL__NAME);
			}
			return null;
		}
	}

	private Pair<Pair<List<GateDecl>, Environment>, Mutually_translate<GateDecl, Type_gate>> type_gates_(
			Environment gamma, EList<GateDecl> l) {
		return proveMutuallyTranslate(gamma, l, this::translate_gate, this::type_gate, "SosADL.SosADL.GateDecl_name",
				GateDecl::getName, "SosADL.TypeSystem.gateDecl_to_EGateOrDuty", this::gateDecl_to_EGateOrDuty);
	}

	protected Pair<Environment, Ex<List<GateDecl>, Mutually_translate<GateDecl, Type_gate>>> type_gates(
			Environment gamma, EList<GateDecl> l) {
		Pair<Pair<List<GateDecl>, Environment>, Mutually_translate<GateDecl, Type_gate>> r = type_gates_(gamma, l);
		return new Pair<>(r.getA().getB(), createEx_intro(r.getA().getA(), r.getB()));
	}

	private EnvContent gateDecl_to_EGateOrDuty(GateDecl g, GateDecl g1) {
		return new GateOrDutyEnvContent(g, g1.getConnections());
	}

	protected Pair<Environment, Ex<List<DutyDecl>, Mutually_translate<DutyDecl, Type_duty>>> type_duties(
			Environment gamma, EList<DutyDecl> l) {
		Pair<Pair<List<DutyDecl>, Environment>, Mutually_translate<DutyDecl, Type_duty>> r = type_duties_(gamma, l);
		return new Pair<>(r.getA().getB(), createEx_intro(r.getA().getA(), r.getB()));
	}

	private Pair<Pair<List<DutyDecl>, Environment>, Mutually_translate<DutyDecl, Type_duty>> type_duties_(
			Environment gamma, EList<DutyDecl> l) {
		return proveMutuallyTranslate(gamma, l, this::translate_duty, this::type_duty, "SosADL.SosADL.DutyDecl_name",
				DutyDecl::getName, "SosADL.TypeSystem.dutyDecl_to_EGateOrDuty", this::dutyDecl_to_EGateOrDuty);
	}

	private EnvContent dutyDecl_to_EGateOrDuty(DutyDecl g, DutyDecl g1) {
		return new GateOrDutyEnvContent(g, g1.getConnections());
	}
}