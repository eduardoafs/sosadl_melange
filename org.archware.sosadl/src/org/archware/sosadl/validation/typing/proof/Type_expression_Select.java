package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Type_expression_Select<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression obj;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final String x;

	@Mandatory
	private final Expression e;

	@Mandatory
	private final T p1;

	@Mandatory
	private final T p2;

	public Type_expression_Select(Environment gamma, Expression obj, DataType tau, String x, Expression e, T p1, T p2) {
		super();
		this.gamma = gamma;
		this.obj = obj;
		this.tau = tau;
		this.x = x;
		this.e = e;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getObj() {
		return obj;
	}

	public DataType getTau() {
		return tau;
	}

	public String getX() {
		return x;
	}

	public Expression getE() {
		return e;
	}

	public T getP1() {
		return p1;
	}

	public T getP2() {
		return p2;
	}

}
