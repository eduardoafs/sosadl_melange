package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Optionally_None<T, P> implements Optionally<T, P> {
	@Mandatory
	private final Environment gamma;

	public Optionally_None(Environment gamma) {
		super();
		this.gamma = gamma;
	}

	public Environment getGamma() {
		return gamma;
	}

}
