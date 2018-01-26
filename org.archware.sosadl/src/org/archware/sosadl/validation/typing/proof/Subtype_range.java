package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;

public class Subtype_range implements Subtype {
	@Mandatory
	private final Expression lmi;

	@Mandatory
	private final Expression lma;

	@Mandatory
	private final Expression rmi;

	@Mandatory
	private final Expression rma;

	@Mandatory
	private final Expression_le p1;

	@Mandatory
	private final Expression_le p2;

	public Subtype_range(Expression lmi, Expression lma, Expression rmi, Expression rma, Expression_le p1,
			Expression_le p2) {
		super();
		this.lmi = lmi;
		this.lma = lma;
		this.rmi = rmi;
		this.rma = rma;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Expression getLmi() {
		return lmi;
	}

	public Expression getLma() {
		return lma;
	}

	public Expression getRmi() {
		return rmi;
	}

	public Expression getRma() {
		return rma;
	}

	public Expression_le getP1() {
		return p1;
	}

	public Expression_le getP2() {
		return p2;
	}

}
