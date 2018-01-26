package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.ecore.EObject;

public class Type_generic_Done<Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm>
		implements Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> {

	@Mandatory
	@CoqLiteral
	private final String block;

	@Mandatory
	@CoqLiteral
	private final Class<Choose> choose;

	@Mandatory
	@CoqLiteral
	private final Class<Done> done;

	@Mandatory
	@CoqLiteral
	private final Class<IfThenElse> ifThenElse;

	@Mandatory
	@CoqLiteral
	private final Class<Repeat> repeat;

	@Mandatory
	@CoqLiteral
	private final Class<Other> other;

	@Mandatory
	@CoqLiteral
	private final Class<E> type_expression;

	@Mandatory
	@CoqLiteral
	private final Class<P> type_generic_prefix;

	@Mandatory
	@CoqLiteral
	private final Class<NF> type_generic_nonfinalbody;

	@Mandatory
	private final Environment gamma;

	public Type_generic_Done(String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse,
			Class<Repeat> repeat, Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
			Class<NF> type_generic_nonfinalbody, Environment gamma) {
		super();
		this.block = block;
		this.choose = choose;
		this.done = done;
		this.ifThenElse = ifThenElse;
		this.repeat = repeat;
		this.other = other;
		this.type_expression = type_expression;
		this.type_generic_prefix = type_generic_prefix;
		this.type_generic_nonfinalbody = type_generic_nonfinalbody;
		this.gamma = gamma;
	}

	public String getBlock() {
		return block;
	}

	public Class<Choose> getChoose() {
		return choose;
	}

	public Class<Done> getDone() {
		return done;
	}

	public Class<IfThenElse> getIfThenElse() {
		return ifThenElse;
	}

	public Class<Repeat> getRepeat() {
		return repeat;
	}

	public Class<Other> getOther() {
		return other;
	}

	public Class<E> getType_expression() {
		return type_expression;
	}

	public Class<P> getType_generic_prefix() {
		return type_generic_prefix;
	}

	public Class<NF> getType_generic_nonfinalbody() {
		return type_generic_nonfinalbody;
	}

	public Environment getGamma() {
		return gamma;
	}

}
