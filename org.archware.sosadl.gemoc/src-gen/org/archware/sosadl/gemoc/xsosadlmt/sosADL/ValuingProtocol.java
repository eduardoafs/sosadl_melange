/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valuing Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol#getValuing <em>Valuing</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getValuingProtocol()
 * @model
 * @generated
 */
public interface ValuingProtocol extends ProtocolStatement {
	/**
	 * Returns the value of the '<em><b>Valuing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuing</em>' containment reference.
	 * @see #setValuing(Valuing)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getValuingProtocol_Valuing()
	 * @model containment="true"
	 * @generated
	 */
	Valuing getValuing();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol#getValuing <em>Valuing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuing</em>' containment reference.
	 * @see #getValuing()
	 * @generated
	 */
	void setValuing(Valuing value);

} // ValuingProtocol
