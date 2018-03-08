/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getSystems <em>Systems</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getMediators <em>Mediators</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getArchitectures <em>Architectures</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getEntityBlock()
 * @model
 * @generated
 */
public interface EntityBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getEntityBlock_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeDecl> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getEntityBlock_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionDecl> getFunctions();

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getEntityBlock_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemDecl> getSystems();

	/**
	 * Returns the value of the '<em><b>Mediators</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediators</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getEntityBlock_Mediators()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediatorDecl> getMediators();

	/**
	 * Returns the value of the '<em><b>Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectures</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getEntityBlock_Architectures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureDecl> getArchitectures();

} // EntityBlock
