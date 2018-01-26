package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Type_RangeType_trivial implements Type_datatype {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression min;

	@Mandatory
	private final Expression max;

	@Mandatory
	private final Expression_le p1;

	public Type_RangeType_trivial(Environment gamma, Expression min, Expression max, Expression_le p1) {
		super();
		this.gamma = gamma;
		this.min = min;
		this.max = max;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
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
