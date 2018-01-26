package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Type_expression_Ident<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String x;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final Equality p;

	public Type_expression_Ident(Environment gamma, String x, DataType tau, Equality p) {
		super();
		this.gamma = gamma;
		this.x = x;
		this.tau = tau;
		this.p = p;
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

	public Equality getP() {
		return p;
	}

}
