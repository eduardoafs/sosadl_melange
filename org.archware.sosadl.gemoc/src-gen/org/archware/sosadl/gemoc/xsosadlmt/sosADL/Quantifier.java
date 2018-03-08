/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Quantifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getQuantifier()
 * @model
 * @generated
 */
public enum Quantifier implements Enumerator {
	/**
	 * The '<em><b>Quantifier Forall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTIFIER_FORALL_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTIFIER_FORALL(0, "QuantifierForall", "forall"),

	/**
	 * The '<em><b>Quantifier Exists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTIFIER_EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTIFIER_EXISTS(1, "QuantifierExists", "exists");

	/**
	 * The '<em><b>Quantifier Forall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quantifier Forall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTIFIER_FORALL
	 * @model name="QuantifierForall" literal="forall"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTIFIER_FORALL_VALUE = 0;

	/**
	 * The '<em><b>Quantifier Exists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quantifier Exists</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTIFIER_EXISTS
	 * @model name="QuantifierExists" literal="exists"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTIFIER_EXISTS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Quantifier[] VALUES_ARRAY =
		new Quantifier[] {
			QUANTIFIER_FORALL,
			QUANTIFIER_EXISTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Quantifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quantifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Quantifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Quantifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Quantifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Quantifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Quantifier get(int value) {
		switch (value) {
			case QUANTIFIER_FORALL_VALUE: return QUANTIFIER_FORALL;
			case QUANTIFIER_EXISTS_VALUE: return QUANTIFIER_EXISTS;
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
	private Quantifier(int value, String name, String literal) {
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
	
} //Quantifier
