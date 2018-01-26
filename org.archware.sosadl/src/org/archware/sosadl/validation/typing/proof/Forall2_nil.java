package org.archware.sosadl.validation.typing.proof;

@CoqType("Forall2 P nil nil")
@CoqConstructor("Forall2_nil")
@CoqNoStandalone
public class Forall2_nil<A, B, T> implements Forall2<A, B, T> {
	@Inferable
	private final Object P = null;
}
