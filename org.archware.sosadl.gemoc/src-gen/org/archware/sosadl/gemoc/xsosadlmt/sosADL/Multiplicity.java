/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMultiplicity()
 * @model
 * @generated
 */
public enum Multiplicity implements Enumerator {
	/**
	 * The '<em><b>Multiplicity One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_ONE(0, "MultiplicityOne", "one"),

	/**
	 * The '<em><b>Multiplicity None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_NONE(1, "MultiplicityNone", "none"),

	/**
	 * The '<em><b>Multiplicity Lone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_LONE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_LONE(2, "MultiplicityLone", "lone"),

	/**
	 * The '<em><b>Multiplicity Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ANY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_ANY(3, "MultiplicityAny", "any"),

	/**
	 * The '<em><b>Multiplicity Some</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_SOME_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_SOME(4, "MultiplicitySome", "some"),

	/**
	 * The '<em><b>Multiplicity All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_ALL(5, "MultiplicityAll", "all");

	/**
	 * The '<em><b>Multiplicity One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplicity One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ONE
	 * @model name="MultiplicityOne" literal="one"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_ONE_VALUE = 0;

	/**
	 * The '<em><b>Multiplicity None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplicity None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_NONE
	 * @model name="MultiplicityNone" literal="none"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_NONE_VALUE = 1;

	/**
	 * The '<em><b>Multiplicity Lone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplicity Lone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_LONE
	 * @model name="MultiplicityLone" literal="lone"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_LONE_VALUE = 2;

	/**
	 * The '<em><b>Multiplicity Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplicity Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ANY
	 * @model name="MultiplicityAny" literal="any"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_ANY_VALUE = 3;

	/**
	 * The '<em><b>Multiplicity Some</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplicity Some</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_SOME
	 * @model name="MultiplicitySome" literal="some"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_SOME_VALUE = 4;

	/**
	 * The '<em><b>Multiplicity All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiplicity All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ALL
	 * @model name="MultiplicityAll" literal="all"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_ALL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Multiplicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicity[] VALUES_ARRAY =
		new Multiplicity[] {
			MULTIPLICITY_ONE,
			MULTIPLICITY_NONE,
			MULTIPLICITY_LONE,
			MULTIPLICITY_ANY,
			MULTIPLICITY_SOME,
			MULTIPLICITY_ALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity get(int value) {
		switch (value) {
			case MULTIPLICITY_ONE_VALUE: return MULTIPLICITY_ONE;
			case MULTIPLICITY_NONE_VALUE: return MULTIPLICITY_NONE;
			case MULTIPLICITY_LONE_VALUE: return MULTIPLICITY_LONE;
			case MULTIPLICITY_ANY_VALUE: return MULTIPLICITY_ANY;
			case MULTIPLICITY_SOME_VALUE: return MULTIPLICITY_SOME;
			case MULTIPLICITY_ALL_VALUE: return MULTIPLICITY_ALL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Multiplicity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Multiplicity
