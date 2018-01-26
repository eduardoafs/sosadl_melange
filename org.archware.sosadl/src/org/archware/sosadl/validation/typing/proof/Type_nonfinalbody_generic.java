package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.BehaviorStatement;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_nonfinalbody_generic implements Type_nonfinalbody {
	@Mandatory
	private final Environment gamma;

	private final EList<BehaviorStatement> l;

	@Mandatory
	private final Type_generic_nonfinalbody<BehaviorStatement, Type_bodyprefix> p1;

	public Type_nonfinalbody_generic(Environment gamma, EList<BehaviorStatement> l,
			Type_generic_nonfinalbody<BehaviorStatement, Type_bodyprefix> p1) {
		super();
		this.gamma = gamma;
		this.l = l;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public EList<BehaviorStatement> getL() {
		return l;
	}

	public Type_generic_nonfinalbody<BehaviorStatement, Type_bodyprefix> getP1() {
		return p1;
	}

}
