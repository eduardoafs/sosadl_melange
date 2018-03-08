/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getSetOfValues <em>Set Of Values</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getRepeated <em>Repeated</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getForEachProtocol()
 * @model
 * @generated
 */
public interface ForEachProtocol extends ProtocolStatement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getForEachProtocol_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Set Of Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Of Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Of Values</em>' containment reference.
	 * @see #setSetOfValues(Expression)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getForEachProtocol_SetOfValues()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSetOfValues();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getSetOfValues <em>Set Of Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Of Values</em>' containment reference.
	 * @see #getSetOfValues()
	 * @generated
	 */
	void setSetOfValues(Expression value);

	/**
	 * Returns the value of the '<em><b>Repeated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeated</em>' containment reference.
	 * @see #setRepeated(Protocol)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getForEachProtocol_Repeated()
	 * @model containment="true"
	 * @generated
	 */
	Protocol getRepeated();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getRepeated <em>Repeated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeated</em>' containment reference.
	 * @see #getRepeated()
	 * @generated
	 */
	void setRepeated(Protocol value);

} // ForEachProtocol
