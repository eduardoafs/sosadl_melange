package org.archware.sosadl.validation.typing.proof;

@CoqType("forall A: Type, (A -> Prop) -> list A -> Prop")
public interface Forall<A, T> extends ProofTerm {
}
