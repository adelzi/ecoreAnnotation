/**
 */
package ecoreAnnotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.AnnotationClass#getProperties <em>Properties</em>}</li>
 *   <li>{@link ecoreAnnotation.AnnotationClass#getAnnotatedClass <em>Annotated Class</em>}</li>
 *   <li>{@link ecoreAnnotation.AnnotationClass#getAnnotatingClass <em>Annotating Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationClass()
 * @model
 * @generated
 */
public interface AnnotationClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreAnnotation.PropertyMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationClass_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyMapping> getProperties();

	/**
	 * Returns the value of the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Class</em>' reference.
	 * @see #setAnnotatedClass(EClass)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationClass_AnnotatedClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getAnnotatedClass();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.AnnotationClass#getAnnotatedClass <em>Annotated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Class</em>' reference.
	 * @see #getAnnotatedClass()
	 * @generated
	 */
	void setAnnotatedClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Annotating Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotating Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotating Class</em>' reference.
	 * @see #setAnnotatingClass(EClass)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationClass_AnnotatingClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getAnnotatingClass();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.AnnotationClass#getAnnotatingClass <em>Annotating Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotating Class</em>' reference.
	 * @see #getAnnotatingClass()
	 * @generated
	 */
	void setAnnotatingClass(EClass value);

} // AnnotationClass
