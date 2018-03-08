/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfTrue <em>If True</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getIfThenElseProtocol()
 * @model
 * @generated
 */
public interface IfThenElseProtocol extends ProtocolStatement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getIfThenElseProtocol_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If True</em>' containment reference.
	 * @see #setIfTrue(Protocol)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getIfThenElseProtocol_IfTrue()
	 * @model containment="true"
	 * @generated
	 */
	Protocol getIfTrue();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfTrue <em>If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If True</em>' containment reference.
	 * @see #getIfTrue()
	 * @generated
	 */
	void setIfTrue(Protocol value);

	/**
	 * Returns the value of the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If False</em>' containment reference.
	 * @see #setIfFalse(Protocol)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getIfThenElseProtocol_IfFalse()
	 * @model containment="true"
	 * @generated
	 */
	Protocol getIfFalse();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfFalse <em>If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If False</em>' containment reference.
	 * @see #getIfFalse()
	 * @generated
	 */
	void setIfFalse(Protocol value);

} // IfThenElseProtocol
