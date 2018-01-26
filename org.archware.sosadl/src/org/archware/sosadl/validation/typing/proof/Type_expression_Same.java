package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Type_expression_Same<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression e;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final Expression min;

	@Mandatory
	private final Expression max;

	@Mandatory
	private final T p1;

	@Mandatory
	private final Subtype p2;

	public Type_expression_Same(Environment gamma, Expression e, DataType tau, Expression min, Expression max, T p1,
			Subtype p2) {
		super();
		this.gamma = gamma;
		this.e = e;
		this.tau = tau;
		this.min = min;
		this.max = max;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getE() {
		return e;
	}

	public DataType getTau() {
		return tau;
	}

	public Expression getMin() {
		return min;
	}

	public Expression getMax() {
		return max;
	}

	public T getP1() {
		return p1;
	}

	public Subtype getP2() {
		return p2;
	}

}
