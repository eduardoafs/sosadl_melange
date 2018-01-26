package org.archware.sosadl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * The interface of objects that can be used to report errors.
 * 
 * The interface is compatible with a subset of the Xtext API.
 * 
 * @author Jeremy Buisson
 * @see AbstractDeclarativeValidator
 */
public interface ErrorCollector {

	/**
	 * Report an error.
	 * 
	 * @param message
	 *            an error message
	 * @param target
	 *            the object in the abstract syntax tree at which the error is
	 *            reported
	 * @param feature
	 *            out-edge of {@value target} at which the error is reported
	 */
	default void error(String message, EObject target, EStructuralFeature feature) {
		error(message, target, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
	}

	/**
	 * Report an error.
	 * 
	 * @param message
	 *            an error message
	 * @param target
	 *            the object in the abstract syntax tree at which the error is
	 *            reported
	 * @param feature
	 *            out-edge of {@value target} at which the error is reported
	 * @param index
	 *            rank in {@value target} at which the error is reported
	 */
	void error(String message, EObject target, EStructuralFeature feature, int index);
}
