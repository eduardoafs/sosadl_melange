/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getModeType()
 * @model
 * @generated
 */
public enum ModeType implements Enumerator {
	/**
	 * The '<em><b>Mode Type In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_TYPE_IN_VALUE
	 * @generated
	 * @ordered
	 */
	MODE_TYPE_IN(0, "ModeTypeIn", "in"),

	/**
	 * The '<em><b>Mode Type Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_TYPE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	MODE_TYPE_OUT(1, "ModeTypeOut", "out"),

	/**
	 * The '<em><b>Mode Type Inout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_TYPE_INOUT_VALUE
	 * @generated
	 * @ordered
	 */
	MODE_TYPE_INOUT(2, "ModeTypeInout", "inout");

	/**
	 * The '<em><b>Mode Type In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mode Type In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODE_TYPE_IN
	 * @model name="ModeTypeIn" literal="in"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_TYPE_IN_VALUE = 0;

	/**
	 * The '<em><b>Mode Type Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mode Type Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODE_TYPE_OUT
	 * @model name="ModeTypeOut" literal="out"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_TYPE_OUT_VALUE = 1;

	/**
	 * The '<em><b>Mode Type Inout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mode Type Inout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODE_TYPE_INOUT
	 * @model name="ModeTypeInout" literal="inout"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_TYPE_INOUT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModeType[] VALUES_ARRAY =
		new ModeType[] {
			MODE_TYPE_IN,
			MODE_TYPE_OUT,
			MODE_TYPE_INOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeType get(int value) {
		switch (value) {
			case MODE_TYPE_IN_VALUE: return MODE_TYPE_IN;
			case MODE_TYPE_OUT_VALUE: return MODE_TYPE_OUT;
			case MODE_TYPE_INOUT_VALUE: return MODE_TYPE_INOUT;
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
	private ModeType(int value, String name, String literal) {
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
	
} //ModeType
