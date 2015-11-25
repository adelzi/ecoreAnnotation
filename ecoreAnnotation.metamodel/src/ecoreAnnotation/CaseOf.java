/**
 */
package ecoreAnnotation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.CaseOf#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link ecoreAnnotation.CaseOf#getExtendedClass <em>Extended Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getCaseOf()
 * @model
 * @generated
 */
public interface CaseOf extends Annotation {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(EClass)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getCaseOf_SuperClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.CaseOf#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Extended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class</em>' reference.
	 * @see #setExtendedClass(EClass)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getCaseOf_ExtendedClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getExtendedClass();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.CaseOf#getExtendedClass <em>Extended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class</em>' reference.
	 * @see #getExtendedClass()
	 * @generated
	 */
	void setExtendedClass(EClass value);

} // CaseOf
