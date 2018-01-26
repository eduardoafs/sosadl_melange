package org.archware.utils;

public final class Pair<A, B> {
	public final A a;
	public final B b;

	public Pair(A a, B b) {
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
