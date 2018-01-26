package org.archware.sosadl.validation.typing.proof;

import java.math.BigInteger;

public class Constexpr_IntegerValue implements Constexpr_expression {
	@Mandatory
	private final BigInteger v;

	public Constexpr_IntegerValue(BigInteger v) {
		super();
		this.v = v;
	}

	public BigInteger getV() {
		return v;
	}

}
