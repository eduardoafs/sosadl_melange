/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getComplexName <em>Complex Name</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getSuite <em>Suite</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getProtocolAction()
 * @model
 * @generated
 */
public interface ProtocolAction extends ProtocolStatement {
	/**
	 * Returns the value of the '<em><b>Complex Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Name</em>' containment reference.
	 * @see #setComplexName(ComplexName)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getProtocolAction_ComplexName()
	 * @model containment="true"
	 * @generated
	 */
	ComplexName getComplexName();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getComplexName <em>Complex Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Name</em>' containment reference.
	 * @see #getComplexName()
	 * @generated
	 */
	void setComplexName(ComplexName value);

	/**
	 * Returns the value of the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suite</em>' containment reference.
	 * @see #setSuite(ProtocolActionSuite)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getProtocolAction_Suite()
	 * @model containment="true"
	 * @generated
	 */
	ProtocolActionSuite getSuite();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(ProtocolActionSuite value);

} // ProtocolAction
