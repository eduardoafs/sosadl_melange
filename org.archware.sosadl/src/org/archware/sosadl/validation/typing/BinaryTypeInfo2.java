package org.archware.sosadl.validation.typing;

import java.util.Optional;

import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.validation.typing.proof.Type_expression_node;

public interface BinaryTypeInfo2<T, P extends Type_expression_node<T>> {
	boolean isCandidate(String oprator, DataType left, DataType right);

	Optional<DataType> immediateType(BinaryExpression e, DataType left, DataType right);

	Type_expression_node<T> prove(Environment gamma, BinaryExpression e, T pLeft, DataType tLeft, T pRight,
			DataType tRight, DataType r);
}