package org.archware.utils;

public class IntPair<T> {
	public final int a;
	public final T b;

	public IntPair(int a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public T getB() {
		return b;
	}
}
