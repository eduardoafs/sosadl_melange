/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getMode <em>Mode</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnectionType()
 * @model
 * @generated
 */
public interface ConnectionType extends DataType {
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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnectionType_Mode()
	 * @model
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DataType)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getConnectionType_Type()
	 * @model containment="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // ConnectionType
