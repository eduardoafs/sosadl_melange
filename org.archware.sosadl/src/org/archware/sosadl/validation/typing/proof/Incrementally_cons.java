package org.archware.sosadl.validation.typing.proof;

import java.util.List;

import org.archware.sosadl.validation.typing.Environment;

public class Incrementally_cons<T, P> implements Incrementally<T, P> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final T x;

	@Mandatory
	private final Environment gammai;

	private final List<T> l;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final P p1;

	@Mandatory
	private final Incrementally<T, P> p2;

	public Incrementally_cons(Environment gamma, T x, Environment gammai, List<T> l, Environment gamma1, P p1,
			Incrementally<T, P> p2) {
		super();
		this.gamma = gamma;
		this.x = x;
		this.gammai = gammai;
		this.l = l;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public T getX() {
		return x;
	}

	public Environment getGammai() {
		return gammai;
	}

	public List<T> getL() {
		return l;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public P getP1() {
		return p1;
	}

	public Incrementally<T, P> getP2() {
		return p2;
	}

}
