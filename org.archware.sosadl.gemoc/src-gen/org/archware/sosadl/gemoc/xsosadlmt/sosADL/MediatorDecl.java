/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getDuties <em>Duties</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getAssertions <em>Assertions</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl()
 * @model
 * @generated
 */
public interface MediatorDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameter> getParameters();

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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeDecl> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Duties</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duties</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Duties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DutyDecl> getDuties();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(BehaviorDecl)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	BehaviorDecl getBehavior();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(BehaviorDecl value);

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssertionDecl> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getMediatorDecl_Assertions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssertionDecl> getAssertions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // MediatorDecl
