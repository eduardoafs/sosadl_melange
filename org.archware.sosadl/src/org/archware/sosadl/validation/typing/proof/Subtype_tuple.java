package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FieldDecl;
import org.eclipse.emf.common.util.EList;

public class Subtype_tuple implements Subtype {
	private final EList<FieldDecl> l;

	private final EList<FieldDecl> r;

	@Mandatory
	private final Forall<FieldDecl, Ex<String, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Subtype>>>>>>> p1;

	public Subtype_tuple(EList<FieldDecl> l, EList<FieldDecl> r,
			Forall<FieldDecl, Ex<String, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Subtype>>>>>>> p1) {
		super();
		this.l = l;
		this.r = r;
		this.p1 = p1;
	}

	public EList<FieldDecl> getL() {
		return l;
	}

	public EList<FieldDecl> getR() {
		return r;
	}

	public Forall<FieldDecl, Ex<String, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Subtype>>>>>>> getP1() {
		return p1;
	}

}
