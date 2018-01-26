package org.archware.sosadl.validation.typing.proof;

@CoqType("forall (x: A) (y: B) (l: list A) (m: list B), P x y -> Forall2 P l m -> Forall2 P (x :: l) (y :: m)")
@CoqConstructor("Forall2_cons")
@CoqNoStandalone
public class Forall2_cons<A, B, T> implements Forall2<A, B, T> {
	@Mandatory
	private final A x;

	@Mandatory
	private final B y;

	@Mandatory
	@CoqType("P x y")
	private final T p1;

	@Mandatory
	@CoqType("Forall2 P l m")
	private final Forall2<A, B, T> p2;

	public Forall2_cons(A x, B y, T p1, Forall2<A, B, T> p2) {
		super();
		this.x = x;
		this.y = y;
		this.p1 = p1;
		this.p2 = p2;
	}

	public A getX() {
		return x;
	}

	public B getY() {
		return y;
	}

	public T getP1() {
		return p1;
	}

	public Forall2<A, B, T> getP2() {
		return p2;
	}

}
