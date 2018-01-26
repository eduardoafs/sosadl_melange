package org.archware.sosadl.validation.typing.proof;

import java.math.BigInteger;

import org.archware.sosadl.validation.typing.Environment;

@CoqNoStandalone
public class Type_expression_IntegerValue<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final BigInteger v;

	public Type_expression_IntegerValue(Environment gamma, BigInteger v) {
		super();
		this.gamma = gamma;
		this.v = v;
	}

	public Environment getGamma() {
		return gamma;
	}

	public BigInteger getV() {
		return v;
	}
}
