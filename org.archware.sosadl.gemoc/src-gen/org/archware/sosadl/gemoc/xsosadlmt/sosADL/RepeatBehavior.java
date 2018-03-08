/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior#getRepeated <em>Repeated</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRepeatBehavior()
 * @model
 * @generated
 */
public interface RepeatBehavior extends BehaviorStatement {
	/**
	 * Returns the value of the '<em><b>Repeated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeated</em>' containment reference.
	 * @see #setRepeated(Behavior)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRepeatBehavior_Repeated()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getRepeated();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior#getRepeated <em>Repeated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeated</em>' containment reference.
	 * @see #getRepeated()
	 * @generated
	 */
	void setRepeated(Behavior value);

} // RepeatBehavior
