package org.archware.sosadl.validation.typing;

import java.util.Optional;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.UnaryExpression;
import org.archware.sosadl.validation.typing.proof.Type_expression_node;

public interface UnaryTypeInfo2<T, P extends Type_expression_node<T>>
{

	boolean isCandidate(String oprator, DataType operand);

	Optional<DataType> immediateType(UnaryExpression e, DataType operand);

	Type_expression_node<T> prove(Environment gamma, UnaryExpression e, T pOperand, DataType tOperand);
}