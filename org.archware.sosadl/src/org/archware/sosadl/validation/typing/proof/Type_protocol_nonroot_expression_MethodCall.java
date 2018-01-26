package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

import java.math.BigInteger;

@CoqNoStandalone
public class Type_protocol_nonroot_expression_MethodCall implements Type_protocol_nonroot_expression_node {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final Expression self;

	@Mandatory
	private final DataType t;

	@Mandatory
	private final DataTypeDecl typeDecl;

	@Mandatory
	private final DataType tau;

	private final EList<FunctionDecl> methods;

	@Mandatory
	private final String name;

	private final EList<FormalParameter> formalparams;

	@Mandatory
	private final DataType ret;

	private final EList<Expression> params;

	@Mandatory
	private final Type_protocol_nonroot_expression p1;

	@Mandatory
	private final Ex<BigInteger, Equality> p2;

	@Mandatory
	private final Subtype p4;

	@Mandatory
	private final Ex<BigInteger, And<Equality, And<Equality, And<Equality, Equality>>>> p5;

	@Mandatory
	private final Forall2<FormalParameter, Expression, Ex<DataType, And<Equality, Ex<DataType, And<Type_protocol_root_expression, Subtype>>>>> p6;

	public Type_protocol_nonroot_expression_MethodCall(Environment gamma, Expression self, DataType t, DataTypeDecl typeDecl,
                                                       DataType tau, EList<FunctionDecl> methods, String name, EList<FormalParameter> formalparams, DataType ret,
                                                       EList<Expression> params, Type_protocol_nonroot_expression p1, Ex<BigInteger, Equality> p2, Subtype p4,
                                                       Ex<BigInteger, And<Equality, And<Equality, And<Equality, Equality>>>> p5,
                                                       Forall2<FormalParameter, Expression, Ex<DataType, And<Equality, Ex<DataType, And<Type_protocol_root_expression, Subtype>>>>> p6) {
		super();
		this.gamma = gamma;
		this.self = self;
		this.t = t;
		this.typeDecl = typeDecl;
		this.tau = tau;
		this.methods = methods;
		this.name = name;
		this.formalparams = formalparams;
		this.ret = ret;
		this.params = params;
		this.p1 = p1;
		this.p2 = p2;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
	}

	public Environment getGamma() {
		return gamma;
	}

	public Expression getSelf() {
		return self;
	}

	public DataType getT() {
		return t;
	}

	public DataTypeDecl getTypeDecl() {
		return typeDecl;
	}

	public DataType getTau() {
		return tau;
	}

	public EList<FunctionDecl> getMethods() {
		return methods;
	}

	public String getName() {
		return name;
	}

	public EList<FormalParameter> getFormalparams() {
		return formalparams;
	}

	public DataType getRet() {
		return ret;
	}

	public EList<Expression> getParams() {
		return params;
	}

	public Type_protocol_nonroot_expression getP1() {
		return p1;
	}

	public Ex<BigInteger, Equality> getP2() {
		return p2;
	}

	public Subtype getP4() {
		return p4;
	}

	public Ex<BigInteger, And<Equality, And<Equality, And<Equality, Equality>>>> getP5() {
		return p5;
	}

	public Forall2<FormalParameter, Expression, Ex<DataType, And<Equality, Ex<DataType, And<Type_protocol_root_expression, Subtype>>>>> getP6() {
		return p6;
	}

}
