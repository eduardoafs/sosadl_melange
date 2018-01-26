package org.archware.sosadl.validation.typing.proof;

@CoqNoStandalone
public class Ex_intro<A, P> implements Ex<A, P> {
	@Inferable
	private final Object t = null;

	@Mandatory
	private final A x;

	@Mandatory
	private final P p;

	public Ex_intro(A x, P p) {
		super();
		this.x = x;
		this.p = p;
	}

	public Object getT() {
		return t;
	}

	public A getX() {
		return x;
	}

	public P getP() {
		return p;
	}

}
