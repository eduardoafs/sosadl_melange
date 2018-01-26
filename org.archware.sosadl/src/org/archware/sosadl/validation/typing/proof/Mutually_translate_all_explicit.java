package org.archware.sosadl.validation.typing.proof;

import java.util.List;

import org.archware.sosadl.validation.typing.Environment;

@CoqConstructor("@mutually_translate_all")
@CoqNoStandalone
public class Mutually_translate_all_explicit<T, P> implements Mutually_translate<T, P> {
	@Inferable
	private final Object t = null;

	@Inferable
	private final Object p = null;

	@Mandatory
	@CoqLiteral
	private final String name;

	@Mandatory
	@CoqLiteral
	private final String content;

	@Mandatory
	private final Environment gamma;

	private final List<T> l;

	private final List<T> l1;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Equality p2;

	@Mandatory
	private final Forall2<T, T, And<Equality, P>> p3;

	public Mutually_translate_all_explicit(String name, String content, Environment gamma, List<T> l, List<T> l1,
			Environment gamma1, Equality p1, Equality p2, Forall2<T, T, And<Equality, P>> p3) {
		super();
		this.name = name;
		this.content = content;
		this.gamma = gamma;
		this.l = l;
		this.l1 = l1;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Object getT() {
		return t;
	}

	public Object getP() {
		return p;
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public Environment getGamma() {
		return gamma;
	}

	public List<T> getL() {
		return l;
	}

	public List<T> getL1() {
		return l1;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Equality getP1() {
		return p1;
	}

	public Equality getP2() {
		return p2;
	}

	public Forall2<T, T, And<Equality, P>> getP3() {
		return p3;
	}

}
