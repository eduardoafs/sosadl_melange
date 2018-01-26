package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.BehaviorStatement;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_BehaviorDecl implements Type_behavior {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String name;

	private final EList<BehaviorStatement> b;

	@Mandatory
	private final Type_finalbody p1;

	public Type_BehaviorDecl(Environment gamma, String name, EList<BehaviorStatement> b, Type_finalbody p1) {
		super();
		this.gamma = gamma;
		this.name = name;
		this.b = b;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getName() {
		return name;
	}

	public EList<BehaviorStatement> getB() {
		return b;
	}

	public Type_finalbody getP1() {
		return p1;
	}

}
