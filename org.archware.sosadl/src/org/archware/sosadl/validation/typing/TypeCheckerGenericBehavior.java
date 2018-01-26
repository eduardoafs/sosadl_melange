package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.proof.*;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class TypeCheckerGenericBehavior extends TypeCheckerGenericBehavior1 {

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> type_generic_finalbody(
            @SuppressWarnings("unused") Class<Body> body, @SuppressWarnings("unused") Class<Statement> statement,
            Function<Body, EList<Statement>> getBlock, String block,
            Class<Choose> choose, Function<Choose, EList<Body>> getBranches, Class<Done> done,
            Class<IfThenElse> ifThenElse, Function<IfThenElse, Expression> getCondition,
            EStructuralFeature conditionFeature, Function<IfThenElse, Body> getThen, EStructuralFeature thenFeature,
            Function<IfThenElse, Body> getElse, EStructuralFeature elseFeature, Class<Repeat> repeat,
            Function<Repeat, Body> getRepeated, EStructuralFeature repeatedFeature, Class<Other> other,
            BiFunction<Environment, Statement, Other> proveOther, Class<E> type_expression,
            BiFunction<Environment, Expression, Pair<E, DataType>> te, Class<P> type_generic_prefix,
            BiFunction<Environment, Statement, Pair<Environment, P>> gp, Class<NF> type_generic_nonfinalbody,
            BiFunction<Environment, Body, NF> gnf, Environment gamma, EList<Statement> b, Body behavior,
            EStructuralFeature blockFeature, int index) {
        if (b.isEmpty()) {
            error("`done' (or any other final statement) is missing to terminate the body", behavior, blockFeature,
                    index - 1);
            return null;
        } else {
            Statement first = b.get(0);
            EList<Statement> l = cdr(b);
            if (l.isEmpty()) {
                saveEnvironment(first, gamma);
                if (done.isInstance(first)) {
                    return genericFinalDone(block, choose, done, ifThenElse, repeat, other, type_expression, type_generic_prefix, type_generic_nonfinalbody, gamma, first);
                } else if (repeat.isInstance(first)) {
                    return genericFinalRepeat(getBlock, block, choose, done, ifThenElse, repeat, getRepeated, repeatedFeature, other, type_expression, type_generic_prefix, type_generic_nonfinalbody, gnf, gamma, repeat.cast(first));
                } else if (ifThenElse.isInstance(first)) {
                    return genericFinalIfThenElse(body, statement, getBlock, block, choose, getBranches, done, ifThenElse, getCondition, conditionFeature, getThen, thenFeature, getElse, elseFeature, repeat, getRepeated, repeatedFeature, other, proveOther, type_expression, te, type_generic_prefix, gp, type_generic_nonfinalbody, gnf, gamma, blockFeature, ifThenElse.cast(first));
                } else if (choose.isInstance(first)) {
                    return genericFinalChoose(body, statement, getBlock, block, choose, getBranches, done, ifThenElse, getCondition, conditionFeature, getThen, thenFeature, getElse, elseFeature, repeat, getRepeated, repeatedFeature, other, proveOther, type_expression, te, type_generic_prefix, gp, type_generic_nonfinalbody, gnf, gamma, blockFeature, choose.cast(first));
                } else {
                    return genericFinalOther(block, choose, done, ifThenElse, repeat, other, proveOther, type_expression, type_generic_prefix, type_generic_nonfinalbody, gamma, first);
                }
            } else {
                Pair<Environment, P> p1 = gp.apply(gamma, first);
                if (p1 != null && p1.getA() != null && p1.getB() != null) {
                    Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p2 = type_generic_finalbody(
                            body, statement, getBlock, block, choose, getBranches, done, ifThenElse, getCondition,
                            conditionFeature, getThen, thenFeature, getElse, elseFeature, repeat, getRepeated,
                            repeatedFeature, other, proveOther, type_expression, te, type_generic_prefix, gp,
                            type_generic_nonfinalbody, gnf, p1.getA(), l, behavior, blockFeature, index + 1);
                    @SuppressWarnings("unchecked")
                    Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> proof = p(
                            Type_generic_finalbody.class, gamma,
                            (gamma_) -> p(Type_generic_finalbody.class, p1.getA(),
                                    (gamma1_) -> createType_generic_prefix(block, choose, done, ifThenElse, repeat,
                                            other, type_expression, type_generic_prefix, type_generic_nonfinalbody,
                                            gamma_, first, gamma1_, l, p1.getB(), p2)));
                    return saveProof(first, proof);
                } else {
                    return null;
                }
            }
        }

    }

    private <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> genericFinalOther(String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat, Class<Other> other, BiFunction<Environment, Statement, Other> proveOther, Class<E> type_expression, Class<P> type_generic_prefix, Class<NF> type_generic_nonfinalbody, Environment gamma, Statement first) {
        Other p1 = proveOther.apply(gamma, first);
        @SuppressWarnings("unchecked")
        Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> proof = p(
                Type_generic_finalbody.class, gamma,
                (gamma_) -> createType_generic_other(block, choose, done, ifThenElse, repeat, other,
                        type_expression, type_generic_prefix, type_generic_nonfinalbody, gamma_, first,
                        p1));
        return saveProof(first, proof);
    }

    private <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> genericFinalChoose(Class<Body> body, Class<Statement> statement, Function<Body, EList<Statement>> getBlock, String block, Class<Choose> choose, Function<Choose, EList<Body>> getBranches, Class<Done> done, Class<IfThenElse> ifThenElse, Function<IfThenElse, Expression> getCondition, EStructuralFeature conditionFeature, Function<IfThenElse, Body> getThen, EStructuralFeature thenFeature, Function<IfThenElse, Body> getElse, EStructuralFeature elseFeature, Class<Repeat> repeat, Function<Repeat, Body> getRepeated, EStructuralFeature repeatedFeature, Class<Other> other, BiFunction<Environment, Statement, Other> proveOther, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> te, Class<P> type_generic_prefix, BiFunction<Environment, Statement, Pair<Environment, P>> gp, Class<NF> type_generic_nonfinalbody, BiFunction<Environment, Body, NF> gnf, Environment gamma, EStructuralFeature blockFeature, Choose c) {
        List<Body> branches = getBranches.apply(c);
        Function<Body, Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF>> f = (
                x) -> type_generic_finalbody(body, statement, getBlock, block, choose, getBranches, done,
                ifThenElse, getCondition, conditionFeature, getThen, thenFeature, getElse,
                elseFeature, repeat, getRepeated, repeatedFeature, other, proveOther,
                type_expression, te, type_generic_prefix, gp, type_generic_nonfinalbody, gnf, gamma,
                getBlock.apply(x), x, blockFeature, 0);
        Forall<EList<Statement>, Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF>> p1 = proveForall(
                branches, getBlock, f);
        EList<EList<Statement>> brl = ECollections
                .asEList(branches.stream().map(getBlock).collect(Collectors.toList()));
        @SuppressWarnings("unchecked")
        Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> proof = p(
                Type_generic_finalbody.class, gamma,
                (gamma_) -> createType_generic_Choose(block, choose, done, ifThenElse, repeat, other,
                        type_expression, type_generic_prefix, type_generic_nonfinalbody, gamma_, brl, p1));
        return saveProof(c, proof);
    }

    private <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> genericFinalIfThenElse(Class<Body> body, Class<Statement> statement, Function<Body, EList<Statement>> getBlock, String block, Class<Choose> choose, Function<Choose, EList<Body>> getBranches, Class<Done> done, Class<IfThenElse> ifThenElse, Function<IfThenElse, Expression> getCondition, EStructuralFeature conditionFeature, Function<IfThenElse, Body> getThen, EStructuralFeature thenFeature, Function<IfThenElse, Body> getElse, EStructuralFeature elseFeature, Class<Repeat> repeat, Function<Repeat, Body> getRepeated, EStructuralFeature repeatedFeature, Class<Other> other, BiFunction<Environment, Statement, Other> proveOther, Class<E> type_expression, BiFunction<Environment, Expression, Pair<E, DataType>> te, Class<P> type_generic_prefix, BiFunction<Environment, Statement, Pair<Environment, P>> gp, Class<NF> type_generic_nonfinalbody, BiFunction<Environment, Body, NF> gnf, Environment gamma, EStructuralFeature blockFeature, IfThenElse ite) {
        Expression c = getCondition.apply(ite);
        Body t = getThen.apply(ite);
        Body e = getElse.apply(ite);
        if (c != null && t != null && e != null) {
            Pair<E, DataType> pt = te.apply(gamma, c);
            E p1 = pt.getA();
            DataType dt = pt.getB();
            if (p1 != null && dt != null) {
                inference.addConstraint(dt, createBooleanType(), c);
                EList<Statement> ts = getBlock.apply(t);
                Pair<Environment, Condition_true> gammat = condition_true(gamma, c, t);
                Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p3 = type_generic_finalbody(
                        body, statement, getBlock, block, choose, getBranches, done, ifThenElse,
                        getCondition, conditionFeature, getThen, thenFeature, getElse, elseFeature, repeat,
                        getRepeated, repeatedFeature, other, proveOther, type_expression, te,
                        type_generic_prefix, gp, type_generic_nonfinalbody, gnf, gammat.getA(), ts, t,
                        blockFeature, 0);
                EList<Statement> es = getBlock.apply(e);
                Pair<Environment, Condition_false> gammae = condition_false(gamma, c, e);
                Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p5 = type_generic_finalbody(
                        body, statement, getBlock, block, choose, getBranches, done, ifThenElse,
                        getCondition, conditionFeature, getThen, thenFeature, getElse, elseFeature, repeat,
                        getRepeated, repeatedFeature, other, proveOther, type_expression, te,
                        type_generic_prefix, gp, type_generic_nonfinalbody, gnf, gammae.getA(), es, e,
                        blockFeature, 0);
                @SuppressWarnings("unchecked")
                Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> proof = p(
                        Type_generic_finalbody.class, gamma,
                        (gamma_) -> p(Type_generic_finalbody.class, gammat.getA(), (gammat_) -> p(
                                Type_generic_finalbody.class, gammae.getA(),
                                (gammae_) -> createType_generic_IfThenElse(block, choose, done, ifThenElse,
                                        repeat, other, type_expression, type_generic_prefix,
                                        type_generic_nonfinalbody, gamma_, c, gammat_, ts, gammae_, es, p1,
                                        gammat.getB(), p3, gammae.getB(), p5))));
                return saveProof(ite, proof);
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
            if (e == null) {
                error("At tail position, the `if' statement must have an `else' clause", ite,
                        elseFeature);
            }
            return null;
        }
    }

    private <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> genericFinalDone(String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat, Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix, Class<NF> type_generic_nonfinalbody, Environment gamma, Statement first) {
        @SuppressWarnings("unchecked")
        Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> proof = p(
                Type_generic_finalbody.class, gamma,
                (gamma_) -> createType_generic_Done(block, choose, done, ifThenElse, repeat, other,
                        type_expression, type_generic_prefix, type_generic_nonfinalbody, gamma_));
        return saveProof(first, proof);
    }

    private <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> genericFinalRepeat(Function<Body, EList<Statement>> getBlock, String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat, Function<Repeat, Body> getRepeated, EStructuralFeature repeatedFeature, Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix, Class<NF> type_generic_nonfinalbody, BiFunction<Environment, Body, NF> gnf, Environment gamma, Repeat r) {
        Body rb = getRepeated.apply(r);
        if (rb != null) {
            EList<Statement> rbl = getBlock.apply(rb);
            NF p1 = gnf.apply(gamma, rb);
            @SuppressWarnings("unchecked")
            Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> proof = p(
                    Type_generic_finalbody.class, gamma,
                    (gamma_) -> createType_generic_Repeat(block, choose, done, ifThenElse, repeat, other,
                            type_expression, type_generic_prefix, type_generic_nonfinalbody, gamma_, rbl,
                            p1));
            return saveProof(r, proof);
        } else {
            error("There must be a repeated behavior", r, repeatedFeature);
            return null;
        }
    }

}
