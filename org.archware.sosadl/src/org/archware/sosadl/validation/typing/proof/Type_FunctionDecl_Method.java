package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.FormalParameter;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.sosADL.Valuing;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_FunctionDecl_Method implements Type_function {
	@Mandatory
	private final Environment gamma;

	@Mandatory
	private final String dataName;

	@Mandatory
	private final String dataTypeName;

	@Mandatory
	private final DataTypeDecl dataTypeDecl;

	@Mandatory
	private final DataType dataTypeReal;

	private final EList<FunctionDecl> dataTypeMethods;

	@Mandatory
	private final String name;

	private final EList<FormalParameter> params;

	private final EList<FormalParameter> params2;

	@Mandatory
	private final Environment gammap;

	@Mandatory
	private final DataType rettype;

	@Mandatory
	private final DataType rettype2;

	private final EList<Valuing> vals;

	@Mandatory
	private final Environment gammav;

	@Mandatory
	private final Expression retexpr;

	@Mandatory
	private final DataType tau;

	@Mandatory
	private final Environment gamma1;

	@Mandatory
	private final Equality p1;

	@Mandatory
	private final Type_datatype p2;

	@Mandatory
	private final Mutually_translate<FormalParameter, Type_formalParameter> p3;

	@Mandatory
	private final Incrementally<Valuing, Type_valuing<Type_expression>> p4;

	@Mandatory
	private final Type_expression p5;

	@Mandatory
	private final Subtype p6;

	@Mandatory
	private final Equality p7;

	public Type_FunctionDecl_Method(Environment gamma, String dataName, String dataTypeName, DataTypeDecl dataTypeDecl,
			DataType dataTypeReal, EList<FunctionDecl> dataTypeMethods, String name, EList<FormalParameter> params,
			EList<FormalParameter> params2, Environment gammap, DataType rettype, DataType rettype2,
			EList<Valuing> vals, Environment gammav, Expression retexpr, DataType tau, Environment gamma1, Equality p1,
			Type_datatype p2, Mutually_translate<FormalParameter, Type_formalParameter> p3,
			Incrementally<Valuing, Type_valuing<Type_expression>> p4, Type_expression p5, Subtype p6, Equality p7) {
		super();
		this.gamma = gamma;
		this.dataName = dataName;
		this.dataTypeName = dataTypeName;
		this.dataTypeDecl = dataTypeDecl;
		this.dataTypeReal = dataTypeReal;
		this.dataTypeMethods = dataTypeMethods;
		this.name = name;
		this.params = params;
		this.params2 = params2;
		this.gammap = gammap;
		this.rettype = rettype;
		this.rettype2 = rettype2;
		this.vals = vals;
		this.gammav = gammav;
		this.retexpr = retexpr;
		this.tau = tau;
		this.gamma1 = gamma1;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
	}

	public Environment getGamma() {
		return gamma;
	}

	public String getDataName() {
		return dataName;
	}

	public String getDataTypeName() {
		return dataTypeName;
	}

	public DataTypeDecl getDataTypeDecl() {
		return dataTypeDecl;
	}

	public DataType getDataTypeReal() {
		return dataTypeReal;
	}

	public EList<FunctionDecl> getDataTypeMethods() {
		return dataTypeMethods;
	}

	public String getName() {
		return name;
	}

	public EList<FormalParameter> getParams() {
		return params;
	}

	public EList<FormalParameter> getParams2() {
		return params2;
	}

	public Environment getGammap() {
		return gammap;
	}

	public DataType getRettype() {
		return rettype;
	}

	public DataType getRettype2() {
		return rettype2;
	}

	public EList<Valuing> getVals() {
		return vals;
	}

	public Environment getGammav() {
		return gammav;
	}

	public Expression getRetexpr() {
		return retexpr;
	}

	public DataType getTau() {
		return tau;
	}

	public Environment getGamma1() {
		return gamma1;
	}

	public Equality getP1() {
		return p1;
	}

	public Type_datatype getP2() {
		return p2;
	}

	public Mutually_translate<FormalParameter, Type_formalParameter> getP3() {
		return p3;
	}

	public Incrementally<Valuing, Type_valuing<Type_expression>> getP4() {
		return p4;
	}

	public Type_expression getP5() {
		return p5;
	}

	public Subtype getP6() {
		return p6;
	}

	public Equality getP7() {
		return p7;
	}

}
