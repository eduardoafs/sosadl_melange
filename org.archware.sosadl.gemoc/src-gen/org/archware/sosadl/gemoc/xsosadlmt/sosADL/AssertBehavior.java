/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getAssertBehavior()
 * @model
 * @generated
 */
public interface AssertBehavior extends BehaviorStatement {
	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(Assert)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getAssertBehavior_Assertion()
	 * @model containment="true"
	 * @generated
	 */
	Assert getAssertion();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(Assert value);

} // AssertBehavior
