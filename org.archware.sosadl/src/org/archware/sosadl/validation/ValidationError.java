package org.archware.sosadl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * An error message.
 * 
 * @author Jeremy Buisson
 */
public class ValidationError {
	/**
	 * Reported error message, as presented to the user.
	 */
	public final String message;

	/**
	 * Model-object at which the message is reported.
	 */
	public final EObject target;

	/**
	 * Out-edge of {@link #target} at which the message is reported.
	 */
	public final EStructuralFeature feature;

	/**
	 * Rank at which the message is reported.
	 * 
	 * This field is significant only when {@link #feature} is an {@link EList}.
	 * Otherwise, the value should be
	 * {@link ValidationMessageAcceptor#INSIGNIFICANT_INDEX}.
	 */
	public final int index;

	public ValidationError(String message, EObject target, EStructuralFeature feature, int index) {
		super();
		this.message = message;
		this.target = target;
		this.feature = feature;
		this.index = index;
	}

	public String getMessage() {
		return message;
	}

	public EObject getTarget() {
		return target;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public int getIndex() {
		return index;
	}
}
