package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Optionally_Some<T, P> implements Optionally<T, P> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final T x;

	@Mandatory
	private final P p1;

	public Optionally_Some(Environment gamma, T x, P p1) {
		super();
		this.gamma = gamma;
		this.x = x;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public T getX() {
		return x;
	}

	public P getP1() {
		return p1;
	}

}
