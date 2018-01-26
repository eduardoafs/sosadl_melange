package org.archware.sosadl.validation.typing.proof.fields;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.archware.sosadl.validation.typing.proof.CoqLiteral;

/**
 * A list field, containing a sequence of objects.
 * 
 * @author Jeremy Buisson
 */
public interface ListField extends FieldDescriptor {
	/**
	 * Retrieves and format the contained objects using the given function.
	 * 
	 * Note that the exact semantics depends on the implementing class. For
	 * instance, an implementation for {@link CoqLiteral}-annotated fields would
	 * return the contained objects, without applying the formatter function.
	 * 
	 * @param formatter
	 *            the function applied to each of the contained objects.
	 * @return the list of formatted objects.
	 */
	List<Optional<CharSequence>> get(Function<Object, CharSequence> formatter);
}
