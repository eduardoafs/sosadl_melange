package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class Type_generic_ForEach<Body extends EObject, Statement extends EObject, Command extends EObject, Action extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
		implements
		Type_generic_prefixstatement<Body, Statement, Command, Action, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> {
	@CoqLiteral
	@Mandatory
	private final String block;

	@CoqLiteral
	@Mandatory
	private final Class<Action> action;

	@CoqLiteral
	@Mandatory
	private final Class<Choose> choose;

	@CoqLiteral
	@Mandatory
	private final Class<DoExpr> doExpr;

	@CoqLiteral
	@Mandatory
	private final Class<ForEach> forEach;

	@CoqLiteral
	@Mandatory
	private final Class<IfThenElse> ifThenElse;

	@CoqLiteral
	@Mandatory
	private final Class<Valuin> valuing;

	@CoqLiteral
	@Mandatory
	private final Class<Send> send;

	@CoqLiteral
	@Mandatory
	private final Class<Receive> receive;

	@CoqLiteral
	@Mandatory
	private final Class<O> other;

	@CoqLiteral
	@Mandatory
	private final Class<E> type_expression;

	@CoqLiteral
	@Mandatory
	private final Class<NP> type_nonfinalbody;

	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String x;

	@Mandatory
	private final Expression vals;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final DataType tau__x;

	private final EList<Statement> b;

	@Mandatory
	private final E p1;

	@Mandatory
	private final NP p2;

	@Mandatory
	private final Subtype p3;

	public Type_generic_ForEach(String block, Class<Action> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, String x, Expression vals, DataType tau, DataType tau__x, EList<Statement> b, E p1, NP p2, Subtype p3) {
		this.block = block;
		this.action = action;
		this.choose = choose;
		this.doExpr = doExpr;
		this.forEach = forEach;
		this.ifThenElse = ifThenElse;
		this.valuing = valuing;
		this.send = send;
		this.receive = receive;
		this.other = other;
		this.type_expression = type_expression;
		this.type_nonfinalbody = type_nonfinalbody;
		this.gamma = gamma;
		this.x = x;
		this.vals = vals;
		this.tau = tau;
		this.tau__x = tau__x;
		this.b = b;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public String getBlock() {
		return block;
	}

	public Class<Action> getAction() {
		return action;
	}

	public Class<Choose> getChoose() {
		return choose;
	}

	public Class<DoExpr> getDoExpr() {
		return doExpr;
	}

	public Class<ForEach> getForEach() {
		return forEach;
	}

	public Class<IfThenElse> getIfThenElse() {
		return ifThenElse;
	}

	public Class<Valuin> getValuing() {
		return valuing;
	}

	public Class<Send> getSend() {
		return send;
	}

	public Class<Receive> getReceive() {
		return receive;
	}

	public Class<O> getOther() {
		return other;
	}

	public Class<E> getType_expression() {
		return type_expression;
	}

	public Class<NP> getType_nonfinalbody() {
		return type_nonfinalbody;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getX() {
		return x;
	}

	public Expression getVals() {
		return vals;
	}

	public DataType getTau() {
		return tau;
	}

	public DataType getTau__x() {
		return tau__x;
	}

	public EList<Statement> getB() {
		return b;
	}

	public E getP1() {
		return p1;
	}

	public NP getP2() {
		return p2;
	}

	public Subtype getP3() {
		return p3;
	}
}
