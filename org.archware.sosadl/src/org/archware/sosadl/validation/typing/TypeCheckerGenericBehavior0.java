package org.archware.sosadl.validation.typing;

/*
DO NOT TRY TO EDIT THIS FILE WITH ECLIPSE!
As of the last tests, Eclipse is specifically bad at handling files containing generics with many type variables.
 */

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.tv.typeCheckerHelper.TypeVariable;
import org.archware.sosadl.validation.typing.impl.VariableEnvContent;
import org.archware.sosadl.validation.typing.proof.*;
import org.archware.utils.OctaFunction;
import org.archware.utils.Pair;
import org.archware.utils.Quadruplet;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class TypeCheckerGenericBehavior0 extends TypeCheckerConnectionName {

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> type_generic_prefix(
            @SuppressWarnings("unused") Class<Body> body, @SuppressWarnings("unused") Class<Statement> statement,
            Function<Body, EList<Statement>> getBlock, String block,
            @SuppressWarnings("unused") Class<Command> command,
            Class<Action> action, Function<Action, ComplexName> getComplexName, EStructuralFeature complexNameFeature,
            Function<Action, Command> getCommand, EStructuralFeature commandFeature,
            Class<Choose> choose, Function<Choose, EList<Body>> getBranches,
            Class<DoExpr> doExpr, Function<DoExpr, Expression> getExpression, EStructuralFeature expressionFeature,
            Class<ForEach> forEach, Function<ForEach, String> getVariable, EStructuralFeature variableFeature,
            Function<ForEach, Expression> getCollection, EStructuralFeature collectionFeature,
            Function<ForEach, Body> getRepeated, EStructuralFeature repeatedFeature,
            Class<IfThenElse> ifThenElse, Function<IfThenElse, Expression> getCondition, EStructuralFeature conditionFeature,
            Function<IfThenElse, Body> getThen, EStructuralFeature thenFeature,
            Function<IfThenElse, Body> getElse, @SuppressWarnings("unused") EStructuralFeature elseFeature,
            Class<Valuin> valuing, Function<Valuin, Valuing> getValuing, EStructuralFeature valuingFeature,
            Class<Send> send, Function<Send, Expression> getValue, EStructuralFeature valueFeature,
            Class<Receive> receive, Function<Receive, String> getName, EStructuralFeature nameFeature,
            Class<O> other,
            BiFunction<Environment, Statement, Pair<Environment, O>> proveOther, Class<E> type_expression,
            BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression,
            Class<NP> type_nonfinalbody, BiFunction<Environment, Body, NP> proveType_nonfinalbody,
            Environment gamma, Statement s) {
        saveEnvironment(s, gamma);
        if (doExpr.isInstance(s)) {
            return genericDoExpr(block, action, choose, doExpr, getExpression, expressionFeature, forEach, ifThenElse, valuing, send, receive, other, type_expression, proveType_expression, type_nonfinalbody, gamma, doExpr.cast(s));
        } else if (valuing.isInstance(s)) {
            return genericValuing(block, action, choose, doExpr, forEach, ifThenElse, valuing, getValuing, valuingFeature, send, receive, other, type_expression, proveType_expression, type_nonfinalbody, gamma, valuing.cast(s));
        } else if (ifThenElse.isInstance(s)) {
            return genericIfThenElse(getBlock, block, action, choose, doExpr, forEach, ifThenElse, getCondition, conditionFeature, getThen, thenFeature, getElse, valuing, send, receive, other, type_expression, proveType_expression, type_nonfinalbody, proveType_nonfinalbody, gamma, ifThenElse.cast(s));
        } else if (choose.isInstance(s)) {
            return genericChoose(getBlock, block, action, choose, getBranches, doExpr, forEach, ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody, proveType_nonfinalbody, gamma, choose.cast(s));
        } else if (forEach.isInstance(s)) {
            return genericForEach(getBlock, block, action, choose, doExpr, forEach, getVariable, variableFeature, getCollection, collectionFeature, getRepeated, repeatedFeature, ifThenElse, valuing, send, receive, other, type_expression, proveType_expression, type_nonfinalbody, proveType_nonfinalbody, gamma, s, forEach.cast(s));
        } else if (action.isInstance(s)) {
            return genericAction(block, action, getComplexName, complexNameFeature, getCommand, commandFeature, choose, doExpr, forEach, ifThenElse, valuing, send, getValue, valueFeature, receive, getName, nameFeature, other, proveOther, type_expression, proveType_expression, type_nonfinalbody, gamma, s, action.cast(s));
        } else {
            return genericOther(block, action, choose, doExpr, forEach, ifThenElse, valuing, send, receive, other, proveOther, type_expression, type_nonfinalbody, gamma, s);
        }
    }

    protected <R, Command extends EObject, Action extends EObject>
    R genericAction(Function<Action, ComplexName> getComplexName, EStructuralFeature complexNameFeature,
                    Function<Action, Command> getCommand, EStructuralFeature commandFeature,
                    Environment gamma, Action a,
                    OctaFunction<Environment, Action, ComplexName, Command, Type_connectionname, Boolean, ModeType, DataType, R> doIt) {
        ComplexName cn = getComplexName.apply(a);
        Command as = getCommand.apply(a);
        if (cn != null && as != null) {
            Quadruplet<Type_connectionname, Boolean, ModeType, DataType> q = type_connectionname(gamma, cn);
            if (q != null) {
                return doIt.apply(gamma, a, cn, as, q.getA(), q.getB(), q.getC(), q.getD());
            } else {
                return null;
            }
        } else {
            if (cn == null) {
                error("The `via' statement must have a complex name denoting a connection", a, complexNameFeature);
            }
            if (as == null) {
                error("The `via' statement must contain either `receive' or `send'", a, commandFeature);
            }
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement,
            ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command,
            O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>>
    genericAction(String block, Class<Action> action, Function<Action, ComplexName> getComplexName, EStructuralFeature complexNameFeature, Function<Action, Command> getCommand, EStructuralFeature commandFeature, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Function<Send, Expression> getValue, EStructuralFeature valueFeature, Class<Receive> receive, Function<Receive, String> getName, EStructuralFeature nameFeature, Class<O> other, BiFunction<Environment, Statement, Pair<Environment, O>> proveOther, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, Environment gamma, Statement s, Action a) {
        OctaFunction<Environment, Action, ComplexName, Command, Type_connectionname, Boolean, ModeType, DataType,
                Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>>> doIt =
                (gamma_, a_, cn, as, p1, is_env, mode, conn__tau) -> doSendReceive(block, action, choose, doExpr, forEach, ifThenElse, valuing, send, getValue, valueFeature, receive, getName, nameFeature, other, proveOther, type_expression, proveType_expression, type_nonfinalbody, gamma_, s, a_, cn, as, p1, is_env, mode, conn__tau);
        return genericAction(getComplexName, complexNameFeature, getCommand, commandFeature, gamma, a, doIt);
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> doSendReceive(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Function<Send, Expression> getValue, EStructuralFeature valueFeature, Class<Receive> receive, Function<Receive, String> getName, EStructuralFeature nameFeature, Class<O> other, BiFunction<Environment, Statement, Pair<Environment, O>> proveOther, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, Environment gamma, Statement s, Action a, ComplexName cn, Command as, Type_connectionname p1, boolean is_env, ModeType mode, DataType conn__tau) {
        if (send.isInstance(as)) {
            return genericSend(block, action, choose, doExpr, forEach, ifThenElse, valuing, send, getValue, valueFeature, receive, other, type_expression, proveType_expression, type_nonfinalbody, gamma, a, cn, p1, is_env, mode, conn__tau, send.cast(as));
        } else if (receive.isInstance(as)) {
            return genericReceive(block, action, choose, doExpr, forEach, ifThenElse, valuing, send, receive, getName, nameFeature, other, type_expression, type_nonfinalbody, gamma, a, cn, p1, is_env, mode, conn__tau, receive.cast(as));
        } else {
            return genericOther(block, action, choose, doExpr, forEach, ifThenElse, valuing, send, receive, other, proveOther, type_expression, type_nonfinalbody, gamma, s);
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericReceive(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Function<Receive, String> getName, EStructuralFeature nameFeature, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, Action a, ComplexName cn, Type_connectionname p1, boolean is_env, ModeType mode, DataType conn__tau, Receive ra) {
        String x = getName.apply(ra);
        if (x != null) {
            Mode_receive p3 = proveReceiveMode(mode, cn);
            if (p3 != null) {
                Environment gamma1 = gamma.put(x, new VariableEnvContent(ra, conn__tau));
                @SuppressWarnings("unchecked")
                Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                        Type_generic_prefixstatement.class, gamma,
                        (gamma_) -> p(Type_generic_prefixstatement.class,
                                conn__tau, (conn__tau_) ->
                                        p(Type_generic_prefixstatement.class,
                                                gamma1, (gamma1_) ->
                                                        createType_generic_Receive(block, action, choose, doExpr, forEach,
                                                                ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                                                gamma_, cn, is_env,
                                                                mode, conn__tau_, x, gamma1_, p1, p3, createReflexivity()))));
                return new Pair<>(gamma1, saveProof(a, proof));
            } else {
                return null;
            }
        } else {
            error("A variable name is expected in the `receive' command", ra, nameFeature);
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericSend(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Function<Send, Expression> getValue, EStructuralFeature valueFeature, Class<Receive> receive, Class<O> other, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, Environment gamma, Action a, ComplexName cn, Type_connectionname p1, boolean is_env, ModeType mode, DataType conn__tau, Send sa) {
        Expression e = getValue.apply(sa);
        if (e != null) {
            Mode_send p3 = proveSendMode(mode, cn);
            Pair<E, DataType> pt = proveType_expression.apply(gamma, e);
            E p4 = pt.getA();
            DataType tau__e = pt.getB();
            if (p3 != null && p4 != null && tau__e != null) {
                inference.addConstraint(tau__e, conn__tau, sa, valueFeature);
                @SuppressWarnings("unchecked")
                Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                        Type_generic_prefixstatement.class, gamma,
                        (gamma_) -> p(Type_generic_prefixstatement.class,
                                conn__tau, (conn__tau_) ->
                                        p(Type_generic_prefixstatement.class,
                                                tau__e, (tau__e_) ->
                                                        createType_generic_Send(block, action, choose, doExpr, forEach,
                                                                ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                                                gamma_, cn, is_env,
                                                                mode, conn__tau_, e, tau__e_, p1, p3, p4,
                                                                subtype(tau__e_, conn__tau_, sa, valueFeature).orElse(null)))));
                return new Pair<>(gamma, saveProof(a, proof));
            } else {
                return null;
            }
        } else {
            error("An expression is expected after `send'", sa, valueFeature);
            return null;
        }
    }

    protected Mode_send proveSendMode(ModeType mode, String conn, ComplexName cn) {
        return proveSendMode(mode, cn);
    }

    protected Mode_send proveSendMode(ModeType mode, ComplexName cn) {
        switch (mode) {
            case MODE_TYPE_OUT:
                return createMode_send_out();
            case MODE_TYPE_INOUT:
                return createMode_send_inout();
            case MODE_TYPE_IN:
                error("Connection `" + cn.getName().stream().collect(Collectors.joining("::")) + "' is a `in' connection that cannot be used by a `send' action", cn,
                        null);
                return null;
        }
        throw new IllegalArgumentException();
    }

    protected Mode_receive proveReceiveMode(ModeType mode, String conn, ComplexName cn) {
        return proveReceiveMode(mode, cn);
    }

    protected Mode_receive proveReceiveMode(ModeType mode, ComplexName cn) {
        switch (mode) {
            case MODE_TYPE_OUT:
                error("Connection `" + cn.getName().stream().collect(Collectors.joining("::")) + "' is a `out' connection that cannot be used by a `receive' action", cn,
                        null);
                return null;
            case MODE_TYPE_INOUT:
                return createMode_receive_inout();
            case MODE_TYPE_IN:
                return createMode_receive_in();
        }
        throw new IllegalArgumentException();
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericOther(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, BiFunction<Environment, Statement, Pair<Environment, O>> proveOther, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, Statement s) {
        Pair<Environment, O> p1 = proveOther.apply(gamma, s);
        if (p1 != null && p1.getA() != null && p1.getB() != null) {
            Environment gamma1 = p1.getA();
            @SuppressWarnings("unchecked")
            Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                    Type_generic_prefixstatement.class, gamma,
                    (gamma_) -> p(Type_generic_prefixstatement.class, gamma1,
                            (gamma1_) -> createType_generic_otherprefix(block, action, choose, doExpr, forEach,
                                    ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                    gamma_, s, gamma1_, p1.getB())));
            return new Pair<>(gamma1, saveProof(s, proof));
        } else {
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericForEach(Function<Body, EList<Statement>> getBlock, String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Function<ForEach, String> getVariable, EStructuralFeature variableFeature, Function<ForEach, Expression> getCollection, EStructuralFeature collectionFeature, Function<ForEach, Body> getRepeated, EStructuralFeature repeatedFeature, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, BiFunction<Environment, Body, NP> proveType_nonfinalbody, Environment gamma, Statement s, ForEach f) {
        String x = getVariable.apply(f);
        Expression c = getCollection.apply(f);
        Body r = getRepeated.apply(f);
        if (x != null && c != null && r != null) {
            Pair<E, DataType> pt = proveType_expression.apply(gamma, c);
            E p1 = pt.getA();
            DataType tauVals = pt.getB();
            if (p1 != null && tauVals != null) {
                TypeVariable tau__x = createFreshTypeVariable(f, SosADLPackage.Literals.FOR_EACH_BEHAVIOR__VARIABLE,
                        TypeInferenceSolver::upperOrLowerSolver);
                TypeInferenceSolver.streamVariables(tauVals).forEach((a) -> inference.addDependency(tau__x, a));
                inference.addConstraint(tauVals, createSequenceType(tau__x), s,
                        collectionFeature);
                Environment gamma1 = gamma.put(x, new VariableEnvContent(s, tau__x));
                EList<Statement> b = getBlock.apply(r);
                NP p2 = proveType_nonfinalbody.apply(gamma1, r);
                @SuppressWarnings("unchecked")
                Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                        Type_generic_prefixstatement.class, gamma,
                        (gamma_) -> p(Type_generic_prefixstatement.class,
                                tauVals, (tau_) ->
                                        p(Type_generic_prefixstatement.class,
                                                tau__x, (tau__x_) ->
                                                        createType_generic_ForEach(block, action, choose, doExpr, forEach,
                                                                ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                                                gamma_, x, c, ((SequenceType) tau_).getType(), tau__x_, b, p1, p2, subtype(((SequenceType) tau_).getType(), tau__x_, f,
                                                                        collectionFeature)
                                                                        .orElse(null)))));
                return new Pair<>(gamma, saveProof(f, proof));
            } else {
                return null;
            }
        } else {
            if (x == null) {
                error("The `foreach' statement must have a variable name", f, variableFeature);
            }
            if (c == null) {
                error("The `foreach' statement must have a collection expression", f, collectionFeature);
            }
            if (r == null) {
                error("The `foreach' statement must have a body", f, repeatedFeature);
            }
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericChoose(Function<Body, EList<Statement>> getBlock, String block, Class<Action> action, Class<Choose> choose, Function<Choose, EList<Body>> getBranches, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, BiFunction<Environment, Body, NP> proveType_nonfinalbody, Environment gamma, Choose c) {
        List<Body> branches = getBranches.apply(c);
        Forall<EList<Statement>, NP> p1 = proveForall(branches, getBlock, (x) -> proveType_nonfinalbody.apply(gamma, x));
        EList<EList<Statement>> brl = ECollections
                .asEList(branches.stream().map(getBlock).collect(Collectors.toList()));
        @SuppressWarnings("unchecked")
        Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                Type_generic_prefixstatement.class, gamma,
                (gamma_) -> createType_generic_Choose_prefix(block, action, choose, doExpr, forEach,
                        ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                        gamma_, brl, p1));
        return new Pair<>(gamma, saveProof(c, proof));
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericIfThenElse(Function<Body, EList<Statement>> getBlock, String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Function<IfThenElse, Expression> getCondition, EStructuralFeature conditionFeature, Function<IfThenElse, Body> getThen, EStructuralFeature thenFeature, Function<IfThenElse, Body> getElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, BiFunction<Environment, Body, NP> proveType_nonfinalbody, Environment gamma, IfThenElse ite) {
        Expression c = getCondition.apply(ite);
        Body t = getThen.apply(ite);
        Body oe = getElse.apply(ite);
        if (c != null && t != null) {
            Pair<E, DataType> pt1 = proveType_expression.apply(gamma, c);
            E p1 = pt1.getA();
            DataType dt = pt1.getB();
            if (p1 != null && dt != null) {
                inference.addConstraint(dt, createBooleanType(), c);
                EList<Statement> ts = getBlock.apply(t);
                Pair<Environment, Condition_true> gammat = condition_true(gamma, c, t);
                NP p3 = proveType_nonfinalbody.apply(gammat.getA(), t);
                Optionally<Body, Ex<Environment, And<Condition_false, Ex<EList<Statement>, And<Equality, NP>>>>> p4 =
                        proveOptionally(gamma, oe,
                                (g, e) -> {
                                    Pair<Environment, Condition_false> gammae = condition_false(g, c, e);
                                    EList<Statement> es = getBlock.apply(e);
                                    @SuppressWarnings("unchecked")
                                    Ex<Environment, And<Condition_false, Ex<EList<Statement>, And<Equality, NP>>>> pr =
                                            p(Ex.class, gammae.getA(), (gammae_) ->
                                                    createEx_intro(gammae_,
                                                            createConj(gammae.getB(),
                                                                    createEx_intro(es,
                                                                            createConj(createReflexivity(),
                                                                                    proveType_nonfinalbody.apply(gammae.getA(), e))))));
                                    return pr;
                                });
                @SuppressWarnings("unchecked")
                Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                        Type_generic_prefixstatement.class, gamma,
                        (gamma_) -> p(Type_generic_prefixstatement.class, gammat.getA(),
                                (gammat_) -> createType_generic_IfThenElse_prefix(block, action, choose, doExpr, forEach,
                                        ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                        gamma_, c, gammat_, ts, oe, p1, gammat.getB(), p3, p4)));
                return new Pair<>(gamma, saveProof(ite, proof));
            } else {
                return null;
            }
        } else {
            if (c == null) {
                error("The `if' statement must have a condition", ite, conditionFeature);
            }
            if (t == null) {
                error("The `if' statement must have a `then' clause", ite, thenFeature);
            }
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericValuing(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Function<Valuin, Valuing> getValuing, EStructuralFeature valuingFeature, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, Environment gamma, Valuin v) {
        Valuing v_ = getValuing.apply(v);
        if (v_ != null) {
            Pair<Type_valuing<E>, Environment> p1 = type_valuing(proveType_expression, gamma, v_);
            if (p1 != null && p1.getA() != null && p1.getB() != null) {
                @SuppressWarnings("unchecked")
                Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                        Type_generic_prefixstatement.class, gamma,
                        (gamma_) -> p(Type_generic_prefixstatement.class, p1.getB(),
                                (gamma1_) -> createType_generic_Valuing(block, action, choose, doExpr, forEach,
                                        ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                        gamma_, v_, gamma1_, p1.getA())));
                return new Pair<>(p1.getB(), saveProof(v, proof));
            } else {
                return null;
            }
        } else {
            error("There must be a valuing", v, valuingFeature);
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Pair<Environment, Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>> genericDoExpr(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Function<DoExpr, Expression> getExpression, EStructuralFeature expressionFeature, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> proveType_expression, Class<NP> type_nonfinalbody, Environment gamma, DoExpr d) {
        Expression e = getExpression.apply(d);
        if (e != null) {
            Pair<E, DataType> pt = proveType_expression.apply(gamma, e);
            if (pt != null) {
                E p1 = pt.getA();
                DataType tau = pt.getB();
                @SuppressWarnings("unchecked")
                Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> proof = p(
                        Type_generic_prefixstatement.class, gamma,
                        (gamma_) -> p(Type_generic_prefixstatement.class, tau,
                                (tau_) -> createType_generic_DoExpr(block, action, choose, doExpr, forEach,
                                        ifThenElse, valuing, send, receive, other, type_expression, type_nonfinalbody,
                                        gamma_, e, tau_, p1)));
                return new Pair<>(gamma, saveProof(d, proof));
            } else {
                return null;
            }
        } else {
            error("There must be an expression", d, expressionFeature);
            return null;
        }
    }

}
