package org.archware.sosadl.validation.typing.proof.fields;

import java.util.Optional;
import java.util.function.Function;

import org.archware.sosadl.validation.typing.proof.CoqLiteral;

/**
 * A mandatory field is a field that is expected to be non-null.
 * 
 * @author Jeremy Buisson
 */
public interface MandatoryField extends FieldDescriptor {
	/**
	 * Retrieves and format the contained object using the given function.
	 * 
	 * Note that the exact semantics depends on the implementing class. For
	 * instance, an implementation for {@link CoqLiteral}-annotated fields would
	 * return the contained object, without applying the formatter function.
	 * 
	 * @param formatter
	 *            the function applied to the contained object.
	 * @return the formatted object.
	 */
	Optional<CharSequence> get(Function<Object, CharSequence> formatter);
}
