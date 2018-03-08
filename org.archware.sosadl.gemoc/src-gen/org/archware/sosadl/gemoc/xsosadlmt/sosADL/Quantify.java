/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getElements <em>Elements</em>}</li>
 *   <li>{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getQuantify()
 * @model
 * @generated
 */
public interface Quantify extends Expression {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getQuantify_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getQuantify_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementInConstituent> getElements();

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
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#getQuantify_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBindings();

	/**
	 * Sets the value of the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getBindings <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' containment reference.
	 * @see #getBindings()
	 * @generated
	 */
	void setBindings(Expression value);

} // Quantify
