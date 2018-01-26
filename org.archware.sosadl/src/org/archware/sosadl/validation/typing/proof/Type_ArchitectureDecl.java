package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.validation.typing.Environment;

public class Type_ArchitectureDecl implements Type_architecture {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final ArchitectureDecl a;

	public Type_ArchitectureDecl(Environment gamma, ArchitectureDecl a) {
		super();
		this.gamma = gamma;
		this.a = a;
	}

	public Environment getGamma() {
		return gamma;
	}

	public ArchitectureDecl getA() {
		return a;
	}

}
