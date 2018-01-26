package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.ecore.EObject;

public class Type_generic_empty<S extends EObject, P extends ProofTerm> implements Type_generic_nonfinalbody<S, P> {
	@Mandatory
	@CoqLiteral
	private final Class<P> type_generic_prefix;

	@Mandatory
	private final Environment gamma;

	public Type_generic_empty(Class<P> type_generic_prefix, Environment gamma) {
		super();
		this.type_generic_prefix = type_generic_prefix;
		this.gamma = gamma;
	}

	public Class<P> getType_generic_prefix() {
		return type_generic_prefix;
	}

	public Environment getGamma() {
		return gamma;
	}

}
