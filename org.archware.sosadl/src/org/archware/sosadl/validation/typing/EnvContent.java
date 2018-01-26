package org.archware.sosadl.validation.typing;

import org.archware.sosadl.validation.typing.proof.ProofTerm;
import org.eclipse.emf.ecore.EObject;

public interface EnvContent extends ProofTerm {
	public EObject getBinder();
}
