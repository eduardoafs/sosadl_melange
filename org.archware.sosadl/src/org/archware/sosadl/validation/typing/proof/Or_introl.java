package org.archware.sosadl.validation.typing.proof;

@CoqNoStandalone
public class Or_introl<R, S> implements Or<R, S> {
	@Mandatory
	private final R p;

	public Or_introl(R p) {
		super();
		this.p = p;
	}

	public R getP() {
		return p;
	}

}
