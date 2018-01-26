package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;

public class Constexpr_Same implements Constexpr_expression {
	@Mandatory
	private final Expression e;

	@Mandatory
	private final Constexpr_expression p;

	public Constexpr_Same(Expression e, Constexpr_expression p) {
		super();
		this.e = e;
		this.p = p;
	}

	public Expression getE() {
		return e;
	}

	public Constexpr_expression getP() {
		return p;
	}

}
