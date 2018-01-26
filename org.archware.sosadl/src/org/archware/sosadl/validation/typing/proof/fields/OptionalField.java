package org.archware.sosadl.validation.typing.proof.fields;

import java.util.Optional;
import java.util.function.Function;

import org.archware.sosadl.validation.typing.proof.CoqLiteral;

/**
 * An optional field may contain no value, when the field contains
 * {@literal null}.
 * 
 * @author Jeremy Buisson
 */
public interface OptionalField extends FieldDescriptor {
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
