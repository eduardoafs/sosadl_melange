package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FieldDecl;
import org.eclipse.emf.common.util.EList;

public class Check_TupleType implements Check_datatype {
	private final EList<FieldDecl> fields;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Forall<FieldDecl, Ex<DataType, And<Equality, Check_datatype>>> p2;

	public Check_TupleType(EList<FieldDecl> fields, Equality p1,
			Forall<FieldDecl, Ex<DataType, And<Equality, Check_datatype>>> p2) {
		super();
		this.fields = fields;
		this.p1 = p1;
		this.p2 = p2;
	}

	public EList<FieldDecl> getFields() {
		return fields;
	}

	public Equality getP1() {
		return p1;
	}

	public Forall<FieldDecl, Ex<DataType, And<Equality, Check_datatype>>> getP2() {
		return p2;
	}

}
