package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;

public class Greatest_l implements Greatest {
	@Mandatory
	private final Expression m;

	@Mandatory
	private final Expression l;

	@Mandatory
	private final Expression r;

	@Mandatory
	private final Expression_le p1;

	@Mandatory
	private final Expression_le p2;

	public Greatest_l(Expression m, Expression l, Expression r, Expression_le p1, Expression_le p2) {
		super();
		this.m = m;
		this.l = l;
		this.r = r;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Expression getM() {
		return m;
	}

	public Expression getL() {
		return l;
	}

	public Expression getR() {
		return r;
	}

	public Expression_le getP1() {
		return p1;
	}

	public Expression_le getP2() {
		return p2;
	}

}
