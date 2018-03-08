/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choose Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getChooseBehavior()
 * @model
 * @generated
 */
public interface ChooseBehavior extends BehaviorStatement {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getChooseBehavior_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBranches();

} // ChooseBehavior
