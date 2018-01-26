package org.archware.sosadl.validation.typing.proof;

@CoqType("Forall P nil")
@CoqConstructor("Forall_nil")
@CoqNoStandalone
public class Forall_nil<A, T> implements Forall<A, T> {
	@Inferable
	private final Object P = null;
}
