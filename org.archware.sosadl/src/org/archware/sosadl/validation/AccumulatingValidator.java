package org.archware.sosadl.validation;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

/**
 * Accumulates error messages.
 * 
 * This class is intended to be inherited by a validator. Instead of dispatching
 * the messages, the class stores the messages in a list, to be later consumed.
 * 
 * The API is intended to be compatible with the one of the Xtext framework. In
 * fact, only a (small) subset is provided.
 * 
 * @author Jeremy Buisson
 * @see AbstractDeclarativeValidator
 */
public class AccumulatingValidator implements ErrorCollector {
	private final List<ValidationError> errors = new LinkedList<>();

	/**
	 * Consume the accumulated error messages.
	 * 
	 * A typical scenario consists in calling this method at the end of the
	 * validation, then to dispatch the error messages to the Xtext framework.
	 * 
	 * @param c
	 */
	public void consumeErrors(Consumer<ValidationError> c) {
		errors.stream().forEach(c);
	}

	@Override
	public void error(String message, EObject target, EStructuralFeature feature, int index) {
		if (target.eResource() == null) {
			throw new IllegalArgumentException("no resource");
		}
		errors.add(new ValidationError(message, target, feature, index));
	}
}
