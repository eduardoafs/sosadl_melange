package org.archware.sosadl.validation.typing.proof;

import java.math.BigInteger;

import org.archware.sosadl.sosADL.Expression;

@CoqConstructor("In_Z")
public class In_Z implements Expression_le {
	@Mandatory
	private final Expression l;

	@Mandatory
	private final BigInteger zl;

	@Mandatory
	private final Expression r;

	@Mandatory
	private final BigInteger zr;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Equality p2;

	@Mandatory
	private final Equality p3;

	public In_Z(Expression l, BigInteger zl, Expression r, BigInteger zr, Equality p1, Equality p2, Equality p3) {
		super();
		this.l = l;
		this.zl = zl;
		this.r = r;
		this.zr = zr;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Expression getL() {
		return l;
	}

	public BigInteger getZl() {
		return zl;
	}

	public Expression getR() {
		return r;
	}

	public BigInteger getZr() {
		return zr;
	}

	public Equality getP1() {
		return p1;
	}

	public Equality getP2() {
		return p2;
	}

	public Equality getP3() {
		return p3;
	}

}
