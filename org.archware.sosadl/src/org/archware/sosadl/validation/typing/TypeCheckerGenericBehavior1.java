package org.archware.sosadl.validation.typing;

import org.archware.sosadl.validation.typing.proof.ProofTerm;
import org.archware.sosadl.validation.typing.proof.Type_generic_nonfinalbody;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.function.BiFunction;

public abstract class TypeCheckerGenericBehavior1 extends TypeCheckerGenericBehavior0 {
    protected <S extends EObject, P extends ProofTerm> Type_generic_nonfinalbody<S, P> type_generic_nonfinalbody(
            Environment gamma, EList<S> l, Class<P> type_generic_prefix,
            BiFunction<Environment, S, Pair<Environment, P>> gp) {
        if (l.isEmpty()) {
            @SuppressWarnings("unchecked")
            Type_generic_nonfinalbody<S, P> proof = p(Type_generic_nonfinalbody.class, gamma,
                    (gamma_) -> createType_generic_empty(type_generic_prefix, gamma_));
            return proof;
        } else {
            S head = l.get(0);
            EList<S> tail = cdr(l);
            Pair<Environment, P> p1 = gp.apply(gamma, head);
            if (p1 != null && p1.getA() != null && p1.getB() != null) {
                Environment gamma1 = p1.getA();
                Type_generic_nonfinalbody<S, P> p2 = type_generic_nonfinalbody(gamma1, tail, type_generic_prefix, gp);
                @SuppressWarnings("unchecked")
                Type_generic_nonfinalbody<S, P> proof = p(Type_generic_nonfinalbody.class, gamma,
                        (gamma_) -> p(Type_generic_nonfinalbody.class, gamma1,
                                (gamma1_) -> createType_generic_nonfinalprefix(type_generic_prefix, gamma_, head,
                                        gamma1_, tail, p1.getB(), p2)));
                return proof;
            } else {
                return null;
            }
        }
    }
}
