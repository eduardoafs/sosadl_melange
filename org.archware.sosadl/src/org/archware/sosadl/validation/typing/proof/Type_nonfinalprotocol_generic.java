package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.ProtocolStatement;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_nonfinalprotocol_generic implements Type_nonfinalprotocol {
	@Mandatory
	private final Environment gamma;

	private final EList<ProtocolStatement> l;

	@Mandatory
	private final Type_generic_nonfinalbody<ProtocolStatement, Type_bodyprotocol> p1;

	public Type_nonfinalprotocol_generic(Environment gamma, EList<ProtocolStatement> l,
			Type_generic_nonfinalbody<ProtocolStatement, Type_bodyprotocol> p1) {
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

	public Type_generic_nonfinalbody<ProtocolStatement, Type_bodyprotocol> getP1() {
		return p1;
	}

}
