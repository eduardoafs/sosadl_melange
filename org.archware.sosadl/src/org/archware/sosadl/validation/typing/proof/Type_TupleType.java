package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_TupleType implements Type_datatype {
	@Mandatory
	private final Environment gamma;

	private final EList<FieldDecl> fields;

	private final EList<FieldDecl> fields2;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Forall2<FieldDecl, FieldDecl, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Type_datatype>>>>>> p2;

	public Type_TupleType(Environment gamma, EList<FieldDecl> fields, EList<FieldDecl> fields2, Equality p1,
			Forall2<FieldDecl, FieldDecl, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Type_datatype>>>>>> p2) {
		super();
		this.gamma = gamma;
		this.fields = fields;
		this.fields2 = fields2;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Environment getGamma() {
		return gamma;
	}

	public EList<FieldDecl> getFields() {
		return fields;
	}

	public EList<FieldDecl> getFields2() {
		return fields2;
	}

	public Equality getP1() {
		return p1;
	}

	public Forall2<FieldDecl, FieldDecl, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Type_datatype>>>>>> getP2() {
		return p2;
	}

}
