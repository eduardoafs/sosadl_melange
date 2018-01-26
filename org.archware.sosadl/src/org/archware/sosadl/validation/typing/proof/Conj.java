package org.archware.sosadl.validation.typing.proof;

@CoqNoStandalone
public class Conj<A, B> implements And<A, B> {
	@Mandatory
	private final A a;

	@Mandatory
	private final B b;

	public Conj(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

}
