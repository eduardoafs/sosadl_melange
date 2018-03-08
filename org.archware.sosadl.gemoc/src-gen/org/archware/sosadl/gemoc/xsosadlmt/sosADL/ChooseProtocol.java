/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choose Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getChooseProtocol()
 * @model
 * @generated
 */
public interface ChooseProtocol extends ProtocolStatement {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getChooseProtocol_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Protocol> getBranches();

} // ChooseProtocol
