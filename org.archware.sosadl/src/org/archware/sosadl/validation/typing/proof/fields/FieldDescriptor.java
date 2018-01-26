package org.archware.sosadl.validation.typing.proof.fields;

import java.lang.reflect.Field;

/**
 * A field description providing a means to format this field, along with
 * associated meta-data.
 * 
 * @author Jeremy Buisson
 */
public interface FieldDescriptor {
	/**
	 * Returns the field meta-data in the Java reflexive API.
	 * 
	 * @return the {@link Field} object for this field.
	 */
	Field getField();
}
