package org.archware.sosadl.validation.typing;

import java.util.Optional;
import java.util.function.BiFunction;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.SosADLPackage;
import org.archware.sosadl.sosADL.Valuing;
import org.archware.sosadl.validation.typing.impl.VariableEnvContent;
import org.archware.sosadl.validation.typing.proof.Incrementally;
import org.archware.sosadl.validation.typing.proof.Subtype;
import org.archware.sosadl.validation.typing.proof.Type_datatype;
import org.archware.sosadl.validation.typing.proof.Type_valuing;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.EList;

public abstract class TypeCheckerValuing extends TypeCheckerCondition {

	public TypeCheckerValuing() {
		super();
	}

	protected <T> Pair<Type_valuing<T>, Environment> type_valuing(
			BiFunction<Environment, Expression, Pair<T, DataType>> te, Environment gamma, Valuing v) {
		Expression e = v.getExpression();
		String x = v.getName();
		if (e != null && x != null) {
			Pair<T, DataType> pt1 = te.apply(gamma, e);
			T p1 = pt1.getA();
			DataType tau__e = pt1.getB();
			if (p1 != null && tau__e != null) {
				DataType tau = v.getType();
				if (tau != null) {
					Pair<DataType, Type_datatype> pt = type_datatype(gamma, tau);
					DataType tau1 = pt.getA();
					Type_datatype p3 = pt.getB();
					if (tau1 != null && p3 != null) {
						@SuppressWarnings("unchecked")
						Type_valuing<T> proof = p(Type_valuing.class, gamma,
								(gamma_) -> p(Type_valuing.class, tau, (tau_) -> p(Type_valuing.class, tau1,
										(tau1_) -> p(Type_valuing.class, tau__e, (tau__e_) -> {
											Optional<Subtype> st = subtype(tau__e_, tau1_, v,
													SosADLPackage.Literals.VALUING__EXPRESSION);
											return createType_Valuing_typed(gamma_, x, tau_, tau1_, e, tau__e_, p1,
													st.orElse(null), p3);
										}))));
						return new Pair<>(saveProof(v, proof), gamma.put(x, new VariableEnvContent(v, tau1)));
					} else {
						return new Pair<>(null, gamma);
					}
				} else {
					@SuppressWarnings("unchecked")
					Type_valuing<T> proof = p(Type_valuing.class, gamma, (gamma_) -> p(Type_valuing.class, tau__e,
							(tau__e_) -> createType_Valuing_inferred(gamma_, x, e, tau__e_, p1)));
					return new Pair<>(saveProof(v, proof), gamma.put(x, new VariableEnvContent(v, tau__e)));
				}
			} else {
				return new Pair<>(null, gamma);
			}
		} else {
			if (v.getExpression() == null) {
				error("The valuing must contain an expression", v, SosADLPackage.Literals.VALUING__EXPRESSION);
			}
			if (v.getName() == null) {
				error("The valuing must contain a variable name", v, SosADLPackage.Literals.VALUING__NAME);
			}
			return new Pair<>(null, gamma);
		}
	}

	protected <T> Pair<Incrementally<Valuing, Type_valuing<T>>, Environment> type_valuings(Environment gamma,
			EList<Valuing> l, BiFunction<Environment, Expression, Pair<T, DataType>> te) {
		return proveIncrementally(gamma, l, (e, v) -> type_valuing(te, e, v));
	}

}