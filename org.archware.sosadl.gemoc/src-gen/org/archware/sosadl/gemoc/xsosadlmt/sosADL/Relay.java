/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnLeft <em>Conn Left</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnRight <em>Conn Right</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRelay()
 * @model
 * @generated
 */
public interface Relay extends Expression {
	/**
	 * Returns the value of the '<em><b>Conn Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn Left</em>' containment reference.
	 * @see #setConnLeft(ComplexName)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRelay_ConnLeft()
	 * @model containment="true"
	 * @generated
	 */
	ComplexName getConnLeft();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnLeft <em>Conn Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Left</em>' containment reference.
	 * @see #getConnLeft()
	 * @generated
	 */
	void setConnLeft(ComplexName value);

	/**
	 * Returns the value of the '<em><b>Conn Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn Right</em>' containment reference.
	 * @see #setConnRight(ComplexName)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRelay_ConnRight()
	 * @model containment="true"
	 * @generated
	 */
	ComplexName getConnRight();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnRight <em>Conn Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Right</em>' containment reference.
	 * @see #getConnRight()
	 * @generated
	 */
	void setConnRight(ComplexName value);

} // Relay
