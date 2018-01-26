package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;

public class Constexpr_Mul implements Constexpr_expression {
	@Mandatory
	private final Expression l;

	@Mandatory
	private final Expression r;

	@Mandatory
	private final Constexpr_expression p1;

	@Mandatory
	private final Constexpr_expression p2;

	public Constexpr_Mul(Expression l, Expression r, Constexpr_expression p1, Constexpr_expression p2) {
		super();
		this.l = l;
		this.r = r;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Expression getL() {
		return l;
	}

	public Expression getR() {
		return r;
	}

	public Constexpr_expression getP1() {
		return p1;
	}

	public Constexpr_expression getP2() {
		return p2;
	}

}
