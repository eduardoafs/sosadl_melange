package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.interp.InterpInZ;
import org.archware.sosadl.validation.typing.proof.Expression_le;

public abstract class TypeCheckerInterpretation extends TypeCheckerGenericRules {

	public TypeCheckerInterpretation() {
		super();
	}

	protected Expression_le expression_le(Expression l, Expression r) {
		if(isLe(l, r)) {
			return createIn_Z(l, InterpInZ.eval(l), r, InterpInZ.eval(r), createReflexivity(), createReflexivity(), createReflexivity());
		} else {
			if(isConstExprNoError(l) && isConstExprNoError(r)) {
				error("The lower bound must be smaller than the upper bound", l, null);
				error("The upper bound must be greater than the lower bound", r, null);
			} else {
				error("Type error", l, null);
			}
			return null;
		}
	}

}