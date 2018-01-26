package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;

public class Range_modulo_min_neg implements Range_modulo_min {
	@Mandatory
	private final Expression lmin;

	@Mandatory
	private final Expression lmax;

	@Mandatory
	private final Expression rmin;

	@Mandatory
	private final Expression rmax;

	@Mandatory
	private final Expression min;

	@Mandatory
	private final Expression_le p1;

	@Mandatory
	private final Expression_le p2;

	public Range_modulo_min_neg(Expression lmin, Expression lmax, Expression rmin, Expression rmax, Expression min,
			Expression_le p1, Expression_le p2) {
		super();
		this.lmin = lmin;
		this.lmax = lmax;
		this.rmin = rmin;
		this.rmax = rmax;
		this.min = min;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Expression getLmin() {
		return lmin;
	}

	public Expression getLmax() {
		return lmax;
	}

	public Expression getRmin() {
		return rmin;
	}

	public Expression getRmax() {
		return rmax;
	}

	public Expression getMin() {
		return min;
	}

	public Expression_le getP1() {
		return p1;
	}

	public Expression_le getP2() {
		return p2;
	}

}
