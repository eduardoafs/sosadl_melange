package org.archware.sosadl.validation.typing.proof;

@CoqType("forall (A B: Type), (A -> B -> Prop) -> list A -> list B -> Prop")
public interface Forall2<A, B, T> extends ProofTerm {
}
