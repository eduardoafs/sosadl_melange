package org.archware.sosadl.validation.typing.proof;

import org.eclipse.emf.ecore.EObject;

public interface Type_generic_prefixstatement<Body extends EObject, Statement extends EObject, Command extends EObject,
        Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement,
        Valuing extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
        extends ProofTerm {

}
