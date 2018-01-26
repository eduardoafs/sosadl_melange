package org.archware.sosadl.validation.typing;

import java.math.BigInteger;

import org.archware.sosadl.attributed.AttributeAdapter;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.AccumulatingValidator;
import org.archware.sosadl.validation.typing.interp.InterpInZ;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TypeCheckerAnnotate extends AccumulatingValidator {

	public static final String ENVIRONMENT = "Environment";
	public static final String PROOF = "Proof";
	public static final String MIN = "Min";
	public static final String MAX = "Max";
	public static final String TYPE = "Type";
	public static final String BINDER = "Binder";
	public static final String INFERENCE = "Inference";

	public static void saveInference(EObject eObject, TypeInferenceSolver i) {
		AttributeAdapter.adapterOf(eObject).putAttribute(INFERENCE, i);
	}

	public static TypeInferenceSolver getInference(EObject eObject) {
		return (TypeInferenceSolver) AttributeAdapter.adapterOf(eObject).getAttribute(INFERENCE);
	}

	public static DataType saveType(EObject eObject, DataType t) {
		AttributeAdapter.adapterOf(eObject).putAttribute(TYPE, t);
		return t;
	}

	public static DataType getType(EObject eObject) {
		return getInference(EcoreUtil.getRootContainer(eObject))
				.deepSubstitute((DataType) AttributeAdapter.adapterOf(eObject).getAttribute(TYPE));
	}

	public static void saveMin(EObject eObject, Expression e) {
		saveMin(eObject, InterpInZ.eval(e));
	}

	public static void saveMin(EObject eObject, BigInteger i) {
		AttributeAdapter.adapterOf(eObject).putAttribute(MIN, i);
	}

	public static void saveMax(EObject eObject, Expression e) {
		saveMax(eObject, InterpInZ.eval(e));
	}

	public static void saveMax(EObject eObject, BigInteger i) {
		AttributeAdapter.adapterOf(eObject).putAttribute(MAX, i);
	}

	public static void saveEnvironment(EObject eObject, Environment env) {
		AttributeAdapter.adapterOf(eObject).putAttribute(ENVIRONMENT, env);
	}

	public static Environment getEnvironment(EObject eObject) {
		Object e = AttributeAdapter.adapterOf(eObject).getAttribute(ENVIRONMENT);
		if(e == null) {
			return null;
		} else {
			return (Environment) e;
		}
	}

	public static <T> T saveProof(EObject eObject, T proof) {
		if (proof == null) {
			System.out.println("ummm");
		}
		AttributeAdapter.adapterOf(eObject).putAttribute(PROOF, proof);
		return proof;
	}

	public static Object getProof(EObject eObject) {
		return AttributeAdapter.adapterOf(eObject).getAttribute(PROOF);
	}

	public static void saveBinder(EObject target, EObject binder) {
		AttributeAdapter.adapterOf(target).putAttribute(BINDER, binder);
	}

	public static Object getBinder(EObject eObject) {
		return AttributeAdapter.adapterOf(eObject).getAttribute(BINDER);
	}

}