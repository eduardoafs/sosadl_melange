/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getGates <em>Gates</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getAssertions <em>Assertions</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl()
 * @model
 * @generated
 */
public interface ArchitectureDecl extends EObject {
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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getName <em>Name</em>}' attribute.
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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl_Parameters()
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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeDecl> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<GateDecl> getGates();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(ArchBehaviorDecl)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	ArchBehaviorDecl getBehavior();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(ArchBehaviorDecl value);

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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchitectureDecl_Assertions()
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
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void init(EList<String> args);

} // ArchitectureDecl
