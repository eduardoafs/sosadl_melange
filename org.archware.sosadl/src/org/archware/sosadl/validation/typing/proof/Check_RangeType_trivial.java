package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;

public class Check_RangeType_trivial implements Check_datatype {

	@Mandatory
	private final Expression min;

	@Mandatory
	private final Expression max;

	@Mandatory
	private final Expression_le p1;

	public Check_RangeType_trivial(Expression min, Expression max, Expression_le p1) {
		super();
		this.min = min;
		this.max = max;
		this.p1 = p1;
	}

	public Expression getMin() {
		return min;
	}

	public Expression getMax() {
		return max;
	}

	public Expression_le getP1() {
		return p1;
	}

}
