package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.Environment;

public class Type_bodyprefix_generic implements Type_bodyprefix {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final BehaviorStatement s;

    @Mandatory
    private final Environment gamma1;

    @Mandatory
    private final Type_generic_prefixstatement<Behavior, BehaviorStatement, ActionSuite, Action, ChooseBehavior, DoExprBehavior, ForEachBehavior, IfThenElseBehavior, ValuingBehavior, SendAction, ReceiveAction, Type_bodyprefix_other, Type_expression, Type_nonfinalbody> p1;

    public Type_bodyprefix_generic(Environment gamma, BehaviorStatement s, Environment gamma1, Type_generic_prefixstatement<Behavior, BehaviorStatement, ActionSuite, Action, ChooseBehavior, DoExprBehavior, ForEachBehavior, IfThenElseBehavior, ValuingBehavior, SendAction, ReceiveAction, Type_bodyprefix_other, Type_expression, Type_nonfinalbody> p1) {
        this.gamma = gamma;
        this.s = s;
        this.gamma1 = gamma1;
        this.p1 = p1;
    }

    public Environment getGamma() {
        return gamma;
    }

    public BehaviorStatement getS() {
        return s;
    }

    public Environment getGamma1() {
        return gamma1;
    }

    public Type_generic_prefixstatement<Behavior, BehaviorStatement, ActionSuite, Action, ChooseBehavior, DoExprBehavior, ForEachBehavior, IfThenElseBehavior, ValuingBehavior, SendAction, ReceiveAction, Type_bodyprefix_other, Type_expression, Type_nonfinalbody> getP1() {
        return p1;
    }
}
