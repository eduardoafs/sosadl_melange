package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Type_Valuing_typed<T> implements Type_valuing<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String x;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final DataType tau1;

	@Mandatory
	private final Expression e;

	@Mandatory
	private final DataType tau__e;

	@Mandatory
	private final T p1;

	@Mandatory
	private final Subtype p2;

	@Mandatory
	private final Type_datatype p3;

	public Type_Valuing_typed(Environment gamma, String x, DataType tau, DataType tau1, Expression e, DataType tau__e,
			T p1, Subtype p2, Type_datatype p3) {
		super();
		this.gamma = gamma;
		this.x = x;
		this.tau = tau;
		this.tau1 = tau1;
		this.e = e;
		this.tau__e = tau__e;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getX() {
		return x;
	}

	public DataType getTau() {
		return tau;
	}

	public DataType getTau1() {
		return tau1;
	}

	public Expression getE() {
		return e;
	}

	public DataType getTau__e() {
		return tau__e;
	}

	public T getP1() {
		return p1;
	}

	public Subtype getP2() {
		return p2;
	}

	public Type_datatype getP3() {
		return p3;
	}

}
