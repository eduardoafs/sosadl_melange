package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.ProtocolStatement;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_ProtocolDecl implements Type_protocol {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String name;

	private final EList<ProtocolStatement> body;

	@Mandatory
	private final Type_finalprotocol p1;

	public Type_ProtocolDecl(Environment gamma, String name, EList<ProtocolStatement> body, Type_finalprotocol p1) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.body = body;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getName() {
		return name;
	}

	public EList<ProtocolStatement> getBody() {
		return body;
	}

	public Type_finalprotocol getP1() {
		return p1;
	}

}
