package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Incrementally_nil<T, P> implements Incrementally<T, P> {
	@Mandatory
	private final Environment gamma;

	public Incrementally_nil(Environment gamma) {
		super();
		this.gamma = gamma;
	}

	public Environment getGamma() {
		return gamma;
	}

}
