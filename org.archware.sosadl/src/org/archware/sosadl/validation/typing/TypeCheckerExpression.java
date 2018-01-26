package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.proof.Type_expression;
import org.archware.sosadl.validation.typing.proof.Type_expression_node;
import org.archware.utils.Pair;

public abstract class TypeCheckerExpression extends TypeCheckerExpressionNode {

	protected Pair<Type_expression, DataType> type_expression(Environment gamma, Expression e) {
		if (e != null) {
			saveEnvironment(e, gamma);
			Pair<Type_expression_node<Type_expression>, DataType> p1 = type_expression_node(gamma, e,
					this::type_expression);
			Type_expression_node<Type_expression> ten = p1.getA();
			DataType t = p1.getB();
			if (ten != null && t != null) {
				saveProof(e, ten);
				saveType(e, t);
				return new Pair<>(p(Type_expression.class, gamma, (gamma_) -> p(Type_expression.class, t,
						(t_) -> createType_expression_and_type(gamma_, e, t_, ten, check_datatype(t_)))), t);
			} else {
				return new Pair<>(null, null);
			}
		} else {
			return new Pair<>(null, null);
		}
	}

}