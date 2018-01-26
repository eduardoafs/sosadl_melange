package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.ChooseProtocol;
import org.archware.sosadl.sosADL.DoneProtocol;
import org.archware.sosadl.sosADL.IfThenElseProtocol;
import org.archware.sosadl.sosADL.Protocol;
import org.archware.sosadl.sosADL.ProtocolStatement;
import org.archware.sosadl.sosADL.RepeatProtocol;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_finalprotocol_generic implements Type_finalprotocol {
	@Mandatory
	private final Environment gamma;

	private final EList<ProtocolStatement> l;

	@Mandatory
	private final Type_generic_finalbody<Protocol, ProtocolStatement, ChooseProtocol, DoneProtocol, IfThenElseProtocol, RepeatProtocol, Type_finalprotocol_other, Type_protocol_root_expression, Type_bodyprotocol, Type_nonfinalprotocol> p1;

	public Type_finalprotocol_generic(Environment gamma, EList<ProtocolStatement> l,
			Type_generic_finalbody<Protocol, ProtocolStatement, ChooseProtocol, DoneProtocol, IfThenElseProtocol, RepeatProtocol, Type_finalprotocol_other, Type_protocol_root_expression, Type_bodyprotocol, Type_nonfinalprotocol> p1) {
		super();
		this.gamma = gamma;
		this.l = l;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public EList<ProtocolStatement> getL() {
		return l;
	}

	public Type_generic_finalbody<Protocol, ProtocolStatement, ChooseProtocol, DoneProtocol, IfThenElseProtocol, RepeatProtocol, Type_finalprotocol_other, Type_protocol_root_expression, Type_bodyprotocol, Type_nonfinalprotocol> getP1() {
		return p1;
	}

}
