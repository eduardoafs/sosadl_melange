package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

@CoqNoStandalone
public class Type_expression_Field<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression self;

	private final EList<FieldDecl> tau;

	@Mandatory
	private final String name;

	@Mandatory
	private final DataType tau__f;

	@Mandatory
	private final T p1;

	@Mandatory
	private final Equality p2;

	public Type_expression_Field(Environment gamma, Expression self, EList<FieldDecl> tau, String name, DataType tau__f,
			T p1, Equality p2) {
		super();
		this.gamma = gamma;
		this.self = self;
		this.tau = tau;
		this.name = name;
		this.tau__f = tau__f;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getSelf() {
		return self;
	}

	public EList<FieldDecl> getTau() {
		return tau;
	}

	public String getName() {
		return name;
	}

	public DataType getTau__f() {
		return tau__f;
	}

	public T getP1() {
		return p1;
	}

	public Equality getP2() {
		return p2;
	}

}
