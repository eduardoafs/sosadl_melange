/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmin <em>Vmin</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmax <em>Vmax</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRangeType()
 * @model
 * @generated
 */
public interface RangeType extends DataType {
	/**
	 * Returns the value of the '<em><b>Vmin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmin</em>' containment reference.
	 * @see #setVmin(Expression)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRangeType_Vmin()
	 * @model containment="true"
	 * @generated
	 */
	Expression getVmin();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmin <em>Vmin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmin</em>' containment reference.
	 * @see #getVmin()
	 * @generated
	 */
	void setVmin(Expression value);

	/**
	 * Returns the value of the '<em><b>Vmax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmax</em>' containment reference.
	 * @see #setVmax(Expression)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getRangeType_Vmax()
	 * @model containment="true"
	 * @generated
	 */
	Expression getVmax();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmax <em>Vmax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmax</em>' containment reference.
	 * @see #getVmax()
	 * @generated
	 */
	void setVmax(Expression value);

} // RangeType
