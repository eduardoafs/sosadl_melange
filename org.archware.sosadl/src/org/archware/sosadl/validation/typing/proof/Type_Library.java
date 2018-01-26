package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.EntityBlock;
import org.archware.sosadl.validation.typing.Environment;

@CoqType("unit (AST.Library (Some n) (Some e)) well typed in gamma")
public class Type_Library implements Type_unit {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String n;

	@Mandatory
	private final EntityBlock e;

	@Mandatory
	@CoqType("entity e well typed in gamma")
	private final Type_entityBlock p;

	public Type_Library(Environment gamma, String n, EntityBlock e, Type_entityBlock p) {
		super();
		this.gamma = gamma;
		this.n = n;
		this.e = e;
		this.p = p;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getN() {
		return n;
	}

	public EntityBlock getE() {
		return e;
	}

	public Type_entityBlock getP() {
		return p;
	}

}
