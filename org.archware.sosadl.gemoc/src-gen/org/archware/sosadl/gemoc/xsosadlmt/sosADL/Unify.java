/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultLeft <em>Mult Left</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnLeft <em>Conn Left</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultRight <em>Mult Right</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnRight <em>Conn Right</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getUnify()
 * @model
 * @generated
 */
public interface Unify extends Expression {
	/**
	 * Returns the value of the '<em><b>Mult Left</b></em>' attribute.
	 * The literals are from the enumeration {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult Left</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
	 * @see #setMultLeft(Multiplicity)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getUnify_MultLeft()
	 * @model
	 * @generated
	 */
	Multiplicity getMultLeft();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultLeft <em>Mult Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult Left</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
	 * @see #getMultLeft()
	 * @generated
	 */
	void setMultLeft(Multiplicity value);

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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getUnify_ConnLeft()
	 * @model containment="true"
	 * @generated
	 */
	ComplexName getConnLeft();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnLeft <em>Conn Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Left</em>' containment reference.
	 * @see #getConnLeft()
	 * @generated
	 */
	void setConnLeft(ComplexName value);

	/**
	 * Returns the value of the '<em><b>Mult Right</b></em>' attribute.
	 * The literals are from the enumeration {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult Right</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
	 * @see #setMultRight(Multiplicity)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getUnify_MultRight()
	 * @model
	 * @generated
	 */
	Multiplicity getMultRight();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultRight <em>Mult Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult Right</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
	 * @see #getMultRight()
	 * @generated
	 */
	void setMultRight(Multiplicity value);

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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getUnify_ConnRight()
	 * @model containment="true"
	 * @generated
	 */
	ComplexName getConnRight();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnRight <em>Conn Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Right</em>' containment reference.
	 * @see #getConnRight()
	 * @generated
	 */
	void setConnRight(ComplexName value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performAction();

} // Unify
