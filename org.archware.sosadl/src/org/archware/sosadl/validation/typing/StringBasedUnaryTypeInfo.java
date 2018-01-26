package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.validation.typing.proof.Type_expression_node;

public abstract class StringBasedUnaryTypeInfo<T, P extends Type_expression_node<T>> implements UnaryTypeInfo2<T, P> {
	private final String operator;

	public StringBasedUnaryTypeInfo(String operator) {
		this.operator = operator;
	}

	@Override
	public boolean isCandidate(String operator, DataType operand) {
		return this.operator.equals(operator);
	}
}