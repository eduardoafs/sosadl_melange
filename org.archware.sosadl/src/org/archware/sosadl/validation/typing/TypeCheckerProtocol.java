package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.proof.*;
import org.archware.utils.OctaFunction;
import org.archware.utils.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;

import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class TypeCheckerProtocol extends TypeCheckerProtocolExpression {

	private Type_finalprotocol type_finalprotocol(Environment gamma, EList<ProtocolStatement> b, Protocol behavior,
			@SuppressWarnings("unused") int index) {
		Function<Protocol, EList<ProtocolStatement>> getBlock = Protocol::getStatements;
		BiFunction<Environment, ProtocolStatement, Type_finalprotocol_other> proveOther = this::final_other;
		BiFunction<Environment, ProtocolStatement, Pair<Environment, Type_bodyprotocol>> gp = this::type_bodyprotocol;
		BiFunction<Environment, Protocol, Type_nonfinalprotocol> gnf = this::type_nonfinalprotocol;
		Function<ChooseProtocol, EList<Protocol>> getBranches = ChooseProtocol::getBranches;
		Function<IfThenElseProtocol, Expression> getCondition = IfThenElseProtocol::getCondition;
		Function<IfThenElseProtocol, Protocol> getThen = IfThenElseProtocol::getIfTrue;
		Function<IfThenElseProtocol, Protocol> getElse = IfThenElseProtocol::getIfFalse;
		Function<RepeatProtocol, Protocol> getRepeated = RepeatProtocol::getRepeated;
		Type_generic_finalbody<Protocol, ProtocolStatement, ChooseProtocol, DoneProtocol, IfThenElseProtocol, RepeatProtocol, Type_finalprotocol_other, Type_protocol_root_expression, Type_bodyprotocol, Type_nonfinalprotocol> p1 = type_generic_finalbody(
				Protocol.class, ProtocolStatement.class, getBlock, "Protocol", ChooseProtocol.class, getBranches,
				DoneProtocol.class, IfThenElseProtocol.class, getCondition,
				SosADLPackage.Literals.IF_THEN_ELSE_PROTOCOL__CONDITION, getThen,
				SosADLPackage.Literals.IF_THEN_ELSE_PROTOCOL__IF_TRUE, getElse,
				SosADLPackage.Literals.IF_THEN_ELSE_PROTOCOL__IF_FALSE, RepeatProtocol.class, getRepeated,
				SosADLPackage.Literals.REPEAT_PROTOCOL__REPEATED, Type_finalprotocol_other.class, proveOther,
				Type_protocol_root_expression.class, this::type_protocol_root_expression, Type_bodyprotocol.class, gp,
				Type_nonfinalprotocol.class, gnf, gamma, b, behavior, SosADLPackage.Literals.PROTOCOL__STATEMENTS, 0);
		Type_finalprotocol proof = p(Type_finalprotocol.class, gamma,
				(gamma_) -> createType_finalprotocol_generic(gamma_, b, p1));
		return saveProof(behavior, proof);
	}

	private Type_finalprotocol_other final_other(Environment gamma, ProtocolStatement s) {
		error("Protocol statement `" + labelOf(s) + "' not allowed at tail position", s, null);
		return null;
	}

	private Type_nonfinalprotocol type_nonfinalprotocol(Environment gamma, Protocol p) {
		Type_generic_nonfinalbody<ProtocolStatement, Type_bodyprotocol> p1 = type_generic_nonfinalbody(gamma,
				p.getStatements(), Type_bodyprotocol.class, this::type_bodyprotocol);
		Type_nonfinalprotocol proof = p(Type_nonfinalprotocol.class, gamma,
				(gamma_) -> createType_nonfinalprotocol_generic(gamma_, p.getStatements(), p1));
		return saveProof(p, proof);
	}

	private Pair<Environment, Type_protocolprefix_other> prefix_other(Environment gamma, ProtocolStatement s) {
		if (s instanceof ProtocolAction) {
			ProtocolAction a = (ProtocolAction) s;
			OctaFunction<Environment, ProtocolAction, ComplexName, ProtocolActionSuite, Type_connectionname, Boolean, ModeType, DataType, Pair<Environment, Type_protocolprefix_other>> doIt = this::doReceiveAny;
			Function<ProtocolAction, ComplexName> getComplexName = ProtocolAction::getComplexName;
			Function<ProtocolAction, ProtocolActionSuite> getSuite = ProtocolAction::getSuite;
			return genericAction(getComplexName, SosADLPackage.Literals.PROTOCOL_ACTION__COMPLEX_NAME, getSuite,
					SosADLPackage.Literals.PROTOCOL_ACTION__SUITE, gamma, a, doIt);
		} else if (s instanceof RepeatProtocol) {
			RepeatProtocol r = (RepeatProtocol) s;
			Protocol p = r.getRepeated();
			if (p != null) {
				Type_nonfinalprotocol p1 = type_nonfinalprotocol(gamma, r.getRepeated());
				Type_protocolprefix_other proof = p(Type_protocolprefix_other.class, gamma,
						(gamma_) -> createType_protocolprefix_Repeat(gamma_, p.getStatements(), p1));
				return new Pair<>(gamma, proof);
			} else {
				error("There must be a repeated behavior", r, SosADLPackage.Literals.REPEAT_PROTOCOL__REPEATED);
				return null;
			}
		} else if (s instanceof AnyAction) {
			Type_protocolprefix_other proof = p(Type_protocolprefix_other.class, gamma,
					this::createType_protocolprefix_AnyAction);
			return new Pair<>(gamma, proof);
		} else {
			error("Protocol statement `" + labelOf(s) + "' not allowed at non-tail position", s, null);
			return null;
		}
	}

	private Pair<Environment, Type_protocolprefix_other> doReceiveAny(Environment gamma, ProtocolAction a_,
			ComplexName cn, ProtocolActionSuite as, Type_connectionname p1, Boolean is_env, ModeType mode,
			DataType conn__tau) {
		if (as instanceof ReceiveAnyProtocolAction) {
			Type_protocolprefix_other proof = p(Type_protocolprefix_other.class, gamma,
					(gamma_) -> p(Type_protocolprefix_other.class, conn__tau,
							(conn__tau_) -> createType_protocolprefix_ReceiveAny(gamma_, cn, is_env, mode, conn__tau_,
									p1, proveReceiveMode(mode, cn))));
			return new Pair<>(gamma, proof);
		} else {
			error("Unknown action command", as, null);
			return null;
		}
	}

	private Pair<Environment, Type_bodyprotocol> type_bodyprotocol(Environment gamma, ProtocolStatement first) {
		Function<Protocol, EList<ProtocolStatement>> getStatements = Protocol::getStatements;
		Function<ProtocolAction, ComplexName> getComplexName = ProtocolAction::getComplexName;
		Function<ProtocolAction, ProtocolActionSuite> getSuite = ProtocolAction::getSuite;
		Function<ChooseProtocol, EList<Protocol>> getBranches = ChooseProtocol::getBranches;
		Function<DoExprProtocol, Expression> getExpression = DoExprProtocol::getExpression;
		Function<ForEachProtocol, String> getVariable = ForEachProtocol::getVariable;
		Function<ForEachProtocol, Expression> getSetOfValues = ForEachProtocol::getSetOfValues;
		Function<ForEachProtocol, Protocol> getRepeated = ForEachProtocol::getRepeated;
		Function<IfThenElseProtocol, Expression> getCondition = IfThenElseProtocol::getCondition;
		Function<IfThenElseProtocol, Protocol> getIfTrue = IfThenElseProtocol::getIfTrue;
		Function<IfThenElseProtocol, Protocol> getIfFalse = IfThenElseProtocol::getIfFalse;
		Function<ValuingProtocol, Valuing> getValuing = ValuingProtocol::getValuing;
		Function<SendProtocolAction, Expression> getExpression1 = SendProtocolAction::getExpression;
		Function<ReceiveProtocolAction, String> getVariable1 = ReceiveProtocolAction::getVariable;
		BiFunction<Environment, ProtocolStatement, Pair<Environment, Type_protocolprefix_other>> prefix_other = this::prefix_other;
		BiFunction<Environment, Protocol, Type_nonfinalprotocol> type_nonfinalprotocol = this::type_nonfinalprotocol;
		Pair<Environment, Type_generic_prefixstatement<Protocol, ProtocolStatement, ProtocolActionSuite, ProtocolAction, ChooseProtocol, DoExprProtocol, ForEachProtocol, IfThenElseProtocol, ValuingProtocol, SendProtocolAction, ReceiveProtocolAction, Type_protocolprefix_other, Type_protocol_root_expression, Type_nonfinalprotocol>> p1 = type_generic_prefix(
				Protocol.class, ProtocolStatement.class, getStatements, "SosADL.SosADL.Protocol",
				ProtocolActionSuite.class, ProtocolAction.class, getComplexName,
				SosADLPackage.Literals.PROTOCOL_ACTION__COMPLEX_NAME, getSuite,
				SosADLPackage.Literals.PROTOCOL_ACTION__SUITE, ChooseProtocol.class, getBranches, DoExprProtocol.class,
				getExpression, SosADLPackage.Literals.DO_EXPR_PROTOCOL__EXPRESSION, ForEachProtocol.class, getVariable,
				SosADLPackage.Literals.FOR_EACH_PROTOCOL__VARIABLE, getSetOfValues,
				SosADLPackage.Literals.FOR_EACH_PROTOCOL__SET_OF_VALUES, getRepeated,
				SosADLPackage.Literals.FOR_EACH_PROTOCOL__REPEATED, IfThenElseProtocol.class, getCondition,
				SosADLPackage.Literals.IF_THEN_ELSE_PROTOCOL__CONDITION, getIfTrue,
				SosADLPackage.Literals.IF_THEN_ELSE_PROTOCOL__IF_TRUE, getIfFalse,
				SosADLPackage.Literals.IF_THEN_ELSE_PROTOCOL__IF_FALSE, ValuingProtocol.class, getValuing,
				SosADLPackage.Literals.VALUING_PROTOCOL__VALUING, SendProtocolAction.class, getExpression1,
				SosADLPackage.Literals.SEND_PROTOCOL_ACTION__EXPRESSION, ReceiveProtocolAction.class, getVariable1,
				SosADLPackage.Literals.RECEIVE_PROTOCOL_ACTION__VARIABLE, Type_protocolprefix_other.class, prefix_other,
				Type_protocol_root_expression.class, this::type_protocol_root_expression, Type_nonfinalprotocol.class,
				type_nonfinalprotocol, gamma, first);
		if (p1 != null) {
			Environment gamma1 = p1.getA();
			Type_bodyprotocol proof = p(Type_bodyprotocol.class, gamma, (gamma_) -> p(Type_bodyprotocol.class, gamma1,
					(gamma1_) -> createType_bodyprotocol_generic(gamma_, first, gamma1_, p1.getB())));
			return new Pair<>(gamma1, proof);
		} else {
			return new Pair<>(gamma, null);
		}
	}

	protected Type_protocol type_protocol(Environment gamma, ProtocolDecl protocol) {
		saveEnvironment(protocol, gamma);
		String name = protocol.getName();
		Protocol p = protocol.getBody();
		if (name != null && p != null) {
			EList<ProtocolStatement> l = p.getStatements();
			Type_finalprotocol p1 = type_finalprotocol(gamma, l, p, 0);
			return saveProof(protocol,
					p(Type_protocol.class, gamma, (gamma_) -> createType_ProtocolDecl(gamma_, name, l, p1)));
		} else {
			if (name == null) {
				error("The protocol must have a name", protocol, SosADLPackage.Literals.PROTOCOL_DECL__NAME);
			}
			if (p == null) {
				error("The protocol must have a body", protocol, SosADLPackage.Literals.PROTOCOL_DECL__BODY);
			}
			return null;
		}
	}

	protected Type_assertion type_assertion(Environment gamma, AssertionDecl assertion) {
		saveEnvironment(assertion, gamma);
		String name = assertion.getName();
		Protocol p = assertion.getBody();
		if (name != null && p != null) {
			EList<ProtocolStatement> l = p.getStatements();
			Type_finalprotocol p1 = type_finalprotocol(gamma, l, p, 0);
			return saveProof(assertion,
					p(Type_assertion.class, gamma, (gamma_) -> createType_AssertionDecl(gamma_, name, l, p1)));
		} else {
			if (name == null) {
				error("The assertion must have a name", assertion, SosADLPackage.Literals.ASSERTION_DECL__NAME);
			}
			if (p == null) {
				error("The assertion must have a body", assertion, SosADLPackage.Literals.ASSERTION_DECL__BODY);
			}
			return null;
		}
	}

	private String labelOf(ProtocolStatement s) {
		if (s instanceof ValuingProtocol) {
			return "value";
		} else if (s instanceof RepeatProtocol) {
			return "repeat";
		} else if (s instanceof IfThenElseProtocol) {
			return "if";
		} else if (s instanceof ChooseProtocol) {
			return "choose";
		} else if (s instanceof ForEachProtocol) {
			return "foreach";
		} else if (s instanceof DoExprProtocol) {
			return "do";
		} else if (s instanceof DoneProtocol) {
			return "done";
		} else if (s instanceof ProtocolAction) {
			return "via";
		} else {
			return "(unknown statement " + s.getClass().getSimpleName() + ")";
		}
	}

}