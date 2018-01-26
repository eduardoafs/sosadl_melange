package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Behavior;
import org.archware.sosadl.sosADL.BehaviorStatement;
import org.archware.sosadl.sosADL.ChooseBehavior;
import org.archware.sosadl.sosADL.DoneBehavior;
import org.archware.sosadl.sosADL.IfThenElseBehavior;
import org.archware.sosadl.sosADL.RepeatBehavior;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_finalbody_generic implements Type_finalbody {
	@Mandatory
	private final Environment gamma;

	private final EList<BehaviorStatement> l;

	@Mandatory
	private final Type_generic_finalbody<Behavior, BehaviorStatement, ChooseBehavior, DoneBehavior, IfThenElseBehavior, RepeatBehavior, Type_finalbody_other, Type_expression, Type_bodyprefix, Type_nonfinalbody> p1;

	public Type_finalbody_generic(Environment gamma, EList<BehaviorStatement> l,
			Type_generic_finalbody<Behavior, BehaviorStatement, ChooseBehavior, DoneBehavior, IfThenElseBehavior, RepeatBehavior, Type_finalbody_other, Type_expression, Type_bodyprefix, Type_nonfinalbody> p1) {
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

	public Type_generic_finalbody<Behavior, BehaviorStatement, ChooseBehavior, DoneBehavior, IfThenElseBehavior, RepeatBehavior, Type_finalbody_other, Type_expression, Type_bodyprefix, Type_nonfinalbody> getP1() {
		return p1;
	}

}
