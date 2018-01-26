package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

@CoqNoStandalone
public class Type_expression_Sequence<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	private final EList<Expression> elts;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final Forall<Expression, Ex<DataType, And<T, Subtype>>> p1;

	public Type_expression_Sequence(Environment gamma, EList<Expression> elts, DataType tau,
			Forall<Expression, Ex<DataType, And<T, Subtype>>> p1) {
		super();
		this.gamma = gamma;
		this.elts = elts;
		this.tau = tau;
		this.p1 = p1;
	}

	public Environment getGamma() {
		return gamma;
	}

	public EList<Expression> getElts() {
		return elts;
	}

	public DataType getTau() {
		return tau;
	}

	public Forall<Expression, Ex<DataType, And<T, Subtype>>> getP1() {
		return p1;
	}

}
