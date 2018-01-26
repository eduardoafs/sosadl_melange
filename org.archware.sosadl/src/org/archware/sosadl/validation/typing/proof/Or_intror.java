package org.archware.sosadl.validation.typing.proof;

@CoqNoStandalone
public class Or_intror<R, S> implements Or<R, S> {
	@Mandatory
	private final S p;

	public Or_intror(S p) {
		super();
		this.p = p;
	}

	public S getP() {
		return p;
	}

}
