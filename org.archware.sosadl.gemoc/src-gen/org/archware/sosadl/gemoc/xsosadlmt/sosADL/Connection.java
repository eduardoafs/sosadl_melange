/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#isEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getName <em>Name</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getMode <em>Mode</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(boolean)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnection_Environment()
	 * @model
	 * @generated
	 */
	boolean isEnvironment();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#isEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #isEnvironment()
	 * @generated
	 */
	void setEnvironment(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType
	 * @see #setMode(ModeType)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnection_Mode()
	 * @model
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeType value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(DataType)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnection_ValueType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getValueType();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void propagateValue();

} // Connection
