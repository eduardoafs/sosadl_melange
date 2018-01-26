package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class Type_generic_IfThenElse<Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm>
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

	@Mandatory
	private final Expression c;

	@Mandatory
	private final Environment gammat;

	private final EList<Statement> t;

	@Mandatory
	private final Environment gammae;

	private final EList<Statement> e;

	@Mandatory
	private final E p1;

	@Mandatory
	private final Condition_true p2;

	@Mandatory
	private final Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p3;

	@Mandatory
	private final Condition_false p4;

	@Mandatory
	private final Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p5;

	public Type_generic_IfThenElse(String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse,
			Class<Repeat> repeat, Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
			Class<NF> type_generic_nonfinalbody, Environment gamma, Expression c, Environment gammat,
			EList<Statement> t, Environment gammae, EList<Statement> e, E p1, Condition_true p2,
			Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p3,
			Condition_false p4,
			Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p5) {
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
		this.c = c;
		this.gammat = gammat;
		this.t = t;
		this.gammae = gammae;
		this.e = e;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
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

	public Expression getC() {
		return c;
	}

	public Environment getGammat() {
		return gammat;
	}

	public EList<Statement> getT() {
		return t;
	}

	public Environment getGammae() {
		return gammae;
	}

	public EList<Statement> getE() {
		return e;
	}

	public E getP1() {
		return p1;
	}

	public Condition_true getP2() {
		return p2;
	}

	public Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> getP3() {
		return p3;
	}

	public Condition_false getP4() {
		return p4;
	}

	public Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> getP5() {
		return p5;
	}

}
