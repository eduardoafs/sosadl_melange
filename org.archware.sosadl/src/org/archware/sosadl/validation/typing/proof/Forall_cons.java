package org.archware.sosadl.validation.typing.proof;

@CoqType("forall (x: A) (l: list A), P x -> Forall P l -> Forall P (x :: l)")
@CoqConstructor("Forall_cons")
@CoqNoStandalone
public class Forall_cons<A, T> implements Forall<A, T> {
	@Mandatory
	private final A x;

	@Mandatory
	@CoqType("P x")
	private final T p1;

	@Mandatory
	@CoqType("Forall P l")
	private final Forall<A, T> p2;

	public Forall_cons(A x, T p1, Forall<A, T> p2) {
		super();
		this.x = x;
		this.p1 = p1;
		this.p2 = p2;
	}

	public A getX() {
		return x;
	}

	public T getP1() {
		return p1;
	}

	public Forall<A, T> getP2() {
		return p2;
	}

}
