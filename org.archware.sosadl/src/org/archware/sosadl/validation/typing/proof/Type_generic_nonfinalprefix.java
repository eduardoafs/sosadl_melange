package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class Type_generic_nonfinalprefix<S extends EObject, P extends ProofTerm>
		implements Type_generic_nonfinalbody<S, P> {
	@Mandatory
	@CoqLiteral
	private final Class<P> type_generic_prefix;

	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final S s;

	@Mandatory
	private final Environment gamma1;

	private final EList<S> l;

	@Mandatory
	private final P p1;

	@Mandatory
	private final Type_generic_nonfinalbody<S, P> p2;

	public Type_generic_nonfinalprefix(Class<P> type_generic_prefix, Environment gamma, S s, Environment gamma1,
			EList<S> l, P p1, Type_generic_nonfinalbody<S, P> p2) {
		super();
		this.type_generic_prefix = type_generic_prefix;
		this.gamma = gamma;
		this.s = s;
		this.gamma1 = gamma1;
		this.l = l;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Class<P> getType_generic_prefix() {
		return type_generic_prefix;
	}

	public Environment getGamma() {
		return gamma;
	}

	public S getS() {
		return s;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public EList<S> getL() {
		return l;
	}

	public P getP1() {
		return p1;
	}

	public Type_generic_nonfinalbody<S, P> getP2() {
		return p2;
	}

}
