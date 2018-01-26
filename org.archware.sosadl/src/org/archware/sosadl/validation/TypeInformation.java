package org.archware.sosadl.validation;

import org.archware.sosadl.sosADL.IdentExpression;
import org.archware.sosadl.validation.typing.Environment;
import org.archware.sosadl.validation.typing.TypeChecker;
import org.eclipse.emf.ecore.EObject;

public class TypeInformation {
	public static <T extends EObject> T resolve(IdentExpression e) {
		Object binder = TypeChecker.getBinder(e);
		if (binder != null) {
			@SuppressWarnings("unchecked")
			T r = (T) binder;
			return r;
		} else {
			String ident = e.getIdent();
			Environment env = getEnvironment(e);
			@SuppressWarnings("unchecked")
			T r = (T) binderFromEnvironment(env, ident);
			return r;
		}
	}

	private static EObject binderFromEnvironment(Environment env, String ident) {
		return env.get(ident).getBinder();
	}

	private static Environment getEnvironment(EObject e) {
		for (EObject i = e;;) {
			Environment r = TypeChecker.getEnvironment(i);
			if (r != null) {
				return r;
			}
			i = i.eContainer();
		}
	}
}
