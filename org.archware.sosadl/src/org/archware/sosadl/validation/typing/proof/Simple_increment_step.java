package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Simple_increment_step<T, P> implements Simple_increment<T, P> {
	@Inferable
	private final Object t = null;

	@Inferable
	private final Object p = null;

	@CoqLiteral
	@Mandatory
	private final String name;

	@CoqLiteral
	@Mandatory
	private final String content;

	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final T x;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final P p2;

	public Simple_increment_step(String name, String content, Environment gamma, T x, Environment gamma1, Equality p1,
			P p2) {
		super();
		this.name = name;
		this.content = content;
		this.gamma = gamma;
		this.x = x;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
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

	public T getX() {
		return x;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Equality getP1() {
		return p1;
	}

	public P getP2() {
		return p2;
	}

}
