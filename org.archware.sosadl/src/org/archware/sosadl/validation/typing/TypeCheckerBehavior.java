package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.proof.*;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.EList;

import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class TypeCheckerBehavior extends TypeCheckerGenericBehavior {

    protected Type_behavior type_behavior(Environment gamma, BehaviorDecl b) {
        if (b.getName() != null && b.getBody() != null) {
            return saveProof(b, createType_BehaviorDecl(gamma, b.getName(), b.getBody().getStatements(),
                    type_finalbody(gamma, b.getBody().getStatements(), b.getBody(), 0)));
        } else {
            if (b.getName() == null) {
                error("The behavior must have a name", b, SosADLPackage.Literals.BEHAVIOR_DECL__NAME);
            }
            if (b.getBody() == null) {
                error("The behavior must have a body", b, SosADLPackage.Literals.BEHAVIOR_DECL__BODY);
            }
            return null;
        }
    }

    private Type_finalbody type_finalbody(Environment gamma, EList<BehaviorStatement> b, Behavior behavior, int index) {
        Function<Behavior, EList<BehaviorStatement>> getBlock = Behavior::getStatements;
        BiFunction<Environment, BehaviorStatement, Type_finalbody_other> proveOther = this::final_other;
        BiFunction<Environment, BehaviorStatement, Pair<Environment, Type_bodyprefix>> gp = this::type_bodyprefix;
        BiFunction<Environment, Behavior, Type_nonfinalbody> gnf = this::type_nonfinalbody;
        Function<ChooseBehavior, EList<Behavior>> getBranches = ChooseBehavior::getBranches;
        Function<IfThenElseBehavior, Expression> getCondition = IfThenElseBehavior::getCondition;
        Function<IfThenElseBehavior, Behavior> getThen = IfThenElseBehavior::getIfTrue;
        Function<IfThenElseBehavior, Behavior> getElse = IfThenElseBehavior::getIfFalse;
        Function<RepeatBehavior, Behavior> getRepeated = RepeatBehavior::getRepeated;
        Type_generic_finalbody<Behavior, BehaviorStatement, ChooseBehavior, DoneBehavior, IfThenElseBehavior, RepeatBehavior, Type_finalbody_other, Type_expression, Type_bodyprefix, Type_nonfinalbody> p1 = type_generic_finalbody(
                Behavior.class, BehaviorStatement.class, getBlock, "Behavior", ChooseBehavior.class, getBranches,
                DoneBehavior.class, IfThenElseBehavior.class, getCondition,
                SosADLPackage.Literals.IF_THEN_ELSE_BEHAVIOR__CONDITION, getThen,
                SosADLPackage.Literals.IF_THEN_ELSE_BEHAVIOR__IF_TRUE, getElse,
                SosADLPackage.Literals.IF_THEN_ELSE_BEHAVIOR__IF_FALSE, RepeatBehavior.class, getRepeated,
                SosADLPackage.Literals.REPEAT_BEHAVIOR__REPEATED, Type_finalbody_other.class, proveOther,
                Type_expression.class, this::type_expression, Type_bodyprefix.class, gp, Type_nonfinalbody.class, gnf,
                gamma, b, behavior, SosADLPackage.Literals.PROTOCOL__STATEMENTS, 0);
        Type_finalbody proof = p(Type_finalbody.class, gamma, (gamma_) -> createType_finalbody_generic(gamma_, b, p1));
        return saveProof(behavior, proof);
    }

    private Type_finalbody_other final_other(Environment gamma, BehaviorStatement s) {
        if (s instanceof RecursiveCall) {
            RecursiveCall rc = (RecursiveCall) s;
            if (rc.getParameters().isEmpty()) {
                return saveProof(s,
                        p(Type_finalbody_other.class, gamma, (gamma_) -> createType_finalbody_RecursiveCall(gamma_)));
            } else {
                error("Statement `behavior' cannot have any parameter", s,
                        SosADLPackage.Literals.RECURSIVE_CALL__PARAMETERS);
                return null;
            }
        } else {
            error("Statement `" + labelOf(s) + "' not allowed at tail position", s, null);
            return null;
        }
    }

    private Type_nonfinalbody type_nonfinalbody(Environment gamma, Behavior behavior) {
        Type_generic_nonfinalbody<BehaviorStatement, Type_bodyprefix> p1 = type_generic_nonfinalbody(gamma,
                behavior.getStatements(), Type_bodyprefix.class, this::type_bodyprefix);
        return saveProof(behavior, p(Type_nonfinalbody.class, gamma,
                (gamma_) -> createType_nonfinalbody_generic(gamma_, behavior.getStatements(), p1)));
    }

    private Pair<Environment, Type_bodyprefix_other> prefix_other(Environment gamma, BehaviorStatement s) {
        error("Statement " + labelOf(s) + " not allowed at non-tail position", s, null);
        return null;
    }

    private Pair<Environment, Type_bodyprefix> type_bodyprefix(Environment gamma, BehaviorStatement s) {
        Function<Behavior, EList<BehaviorStatement>> getStatements = Behavior::getStatements;
        Function<Action, ComplexName> getComplexName = Action::getComplexName;
        Function<Action, ActionSuite> getSuite = Action::getSuite;
        Function<ChooseBehavior, EList<Behavior>> getBranches = ChooseBehavior::getBranches;
        Function<DoExprBehavior, Expression> getExpression = DoExprBehavior::getExpression;
        Function<ForEachBehavior, String> getVariable = ForEachBehavior::getVariable;
        Function<ForEachBehavior, Expression> getSetOfValues = ForEachBehavior::getSetOfValues;
        Function<ForEachBehavior, Behavior> getRepeated = ForEachBehavior::getRepeated;
        Function<IfThenElseBehavior, Expression> getCondition = IfThenElseBehavior::getCondition;
        Function<IfThenElseBehavior, Behavior> getIfTrue = IfThenElseBehavior::getIfTrue;
        Function<IfThenElseBehavior, Behavior> getIfFalse = IfThenElseBehavior::getIfFalse;
        Function<ValuingBehavior, Valuing> getValuing = ValuingBehavior::getValuing;
        Function<SendAction, Expression> getExpression1 = SendAction::getExpression;
        Function<ReceiveAction, String> getVariable1 = ReceiveAction::getVariable;
        BiFunction<Environment, BehaviorStatement, Pair<Environment, Type_bodyprefix_other>> prefix_other = this::prefix_other;
        BiFunction<Environment, Behavior, Type_nonfinalbody> type_nonfinalbody = this::type_nonfinalbody;
        Pair<Environment, Type_generic_prefixstatement<Behavior, BehaviorStatement, ActionSuite,
                Action, ChooseBehavior, DoExprBehavior, ForEachBehavior, IfThenElseBehavior,
                ValuingBehavior, SendAction, ReceiveAction,
                Type_bodyprefix_other, Type_expression, Type_nonfinalbody>> p1 = type_generic_prefix(
                Behavior.class,
                BehaviorStatement.class, getStatements,
                "SosADL.SosADL.Behavior", ActionSuite.class, Action.class, getComplexName,
                SosADLPackage.Literals.ACTION__COMPLEX_NAME, getSuite, SosADLPackage.Literals.ACTION__SUITE,
                ChooseBehavior.class, getBranches, DoExprBehavior.class, getExpression,
                SosADLPackage.Literals.DO_EXPR_BEHAVIOR__EXPRESSION, ForEachBehavior.class, getVariable,
                SosADLPackage.Literals.FOR_EACH_BEHAVIOR__VARIABLE, getSetOfValues,
                SosADLPackage.Literals.FOR_EACH_BEHAVIOR__SET_OF_VALUES, getRepeated,
                SosADLPackage.Literals.FOR_EACH_BEHAVIOR__REPEATED,
                IfThenElseBehavior.class, getCondition, SosADLPackage.Literals.IF_THEN_ELSE_BEHAVIOR__CONDITION,
                getIfTrue, SosADLPackage.Literals.IF_THEN_ELSE_BEHAVIOR__IF_TRUE,
                getIfFalse, SosADLPackage.Literals.IF_THEN_ELSE_BEHAVIOR__IF_FALSE,
                ValuingBehavior.class, getValuing, SosADLPackage.Literals.VALUING_BEHAVIOR__VALUING,
                SendAction.class, getExpression1, SosADLPackage.Literals.SEND_ACTION__EXPRESSION,
                ReceiveAction.class, getVariable1, SosADLPackage.Literals.RECEIVE_ACTION__VARIABLE,
                Type_bodyprefix_other.class, prefix_other, Type_expression.class, this::type_expression,
                Type_nonfinalbody.class, type_nonfinalbody, gamma, s);
        if (p1 != null) {
            Environment gamma1 = p1.getA();
            Type_bodyprefix proof = p(Type_bodyprefix.class, gamma, (gamma_) ->
                    p(Type_bodyprefix.class, gamma1, (gamma1_) -> createType_bodyprefix_generic(gamma_, s, gamma1_, p1.getB())));
            return new Pair<>(gamma1, proof);
        } else {
            return new Pair<>(gamma, null);
        }
    }

    private String labelOf(BehaviorStatement s) {
        if (s instanceof ValuingBehavior) {
            return "value";
        } else if (s instanceof RepeatBehavior) {
            return "repeat";
        } else if (s instanceof IfThenElseBehavior) {
            return "if";
        } else if (s instanceof ChooseBehavior) {
            return "choose";
        } else if (s instanceof ForEachBehavior) {
            return "foreach";
        } else if (s instanceof DoExprBehavior) {
            return "do";
        } else if (s instanceof DoneBehavior) {
            return "done";
        } else if (s instanceof RecursiveCall) {
            return "behavior";
        } else if (s instanceof Action) {
            return "via";
        } else {
            return "(unknown statement: " + s.getClass().getSimpleName() + ")";
        }
    }

}