package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.sosADL.TupleElement;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

@CoqNoStandalone
public class Type_expression_Tuple<T> implements Type_expression_node<T> {
	@Mandatory
	private final Environment gamma;

	private final EList<TupleElement> elts;

	private final EList<FieldDecl> typ;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Forall2<TupleElement, FieldDecl, Equality> p2;

	@Mandatory
	private final Forall2<TupleElement, FieldDecl, Ex<Expression, And<Equality, Ex<DataType, And<Equality, T>>>>> p3;

	public Type_expression_Tuple(Environment gamma, EList<TupleElement> elts, EList<FieldDecl> typ, Equality p1,
			Forall2<TupleElement, FieldDecl, Equality> p2,
			Forall2<TupleElement, FieldDecl, Ex<Expression, And<Equality, Ex<DataType, And<Equality, T>>>>> p3) {
		super();
		this.gamma = gamma;
		this.elts = elts;
		this.typ = typ;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Environment getGamma() {
		return gamma;
	}

	public EList<TupleElement> getElts() {
		return elts;
	}

	public EList<FieldDecl> getTyp() {
		return typ;
	}

	public Equality getP1() {
		return p1;
	}

	public Forall2<TupleElement, FieldDecl, Equality> getP2() {
		return p2;
	}

	public Forall2<TupleElement, FieldDecl, Ex<Expression, And<Equality, Ex<DataType, And<Equality, T>>>>> getP3() {
		return p3;
	}

}
