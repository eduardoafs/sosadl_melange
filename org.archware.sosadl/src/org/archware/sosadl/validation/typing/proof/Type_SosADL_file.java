package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Import;
import org.archware.sosadl.sosADL.Unit;
import org.eclipse.emf.common.util.EList;

@CoqType("SoSADL (AST.SosADL i (Some d)) well typed")
public class Type_SosADL_file implements Type_sosADL {
	private final EList<Import> i;

	@Mandatory
	private final Unit d;

	@Mandatory
	@CoqType("unit d well typed in empty")
	private final Type_unit p;

	public Type_SosADL_file(EList<Import> i, Unit u, Type_unit p) {
		super();
		this.i = i;
		this.d = u;
		this.p = p;
	}

	public EList<Import> getI() {
		return i;
	}

	public Unit getD() {
		return d;
	}

	public Type_unit getP() {
		return p;
	}
}
