/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arch Behavior Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchBehaviorDecl()
 * @model
 * @generated
 */
public interface ArchBehaviorDecl extends EObject {
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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchBehaviorDecl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constituents</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituents</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchBehaviorDecl_Constituents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constituent> getConstituents();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference.
	 * @see #setBindings(Expression)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getArchBehaviorDecl_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBindings();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getBindings <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' containment reference.
	 * @see #getBindings()
	 * @generated
	 */
	void setBindings(Expression value);

} // ArchBehaviorDecl
