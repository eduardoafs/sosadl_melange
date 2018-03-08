/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getComplexName <em>Complex Name</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getSuite <em>Suite</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends BehaviorStatement {
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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getAction_ComplexName()
	 * @model containment="true"
	 * @generated
	 */
	ComplexName getComplexName();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getComplexName <em>Complex Name</em>}' containment reference.
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
	 * @see #setSuite(ActionSuite)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getAction_Suite()
	 * @model containment="true"
	 * @generated
	 */
	ActionSuite getSuite();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getSuite <em>Suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' containment reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(ActionSuite value);

} // Action
