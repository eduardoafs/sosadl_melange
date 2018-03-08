/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends Expression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getTuple_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TupleElement> getElements();

} // Tuple
