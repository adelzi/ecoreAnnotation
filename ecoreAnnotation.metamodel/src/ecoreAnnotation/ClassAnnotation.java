/**
 */
package ecoreAnnotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.ClassAnnotation#getProperties <em>Properties</em>}</li>
 *   <li>{@link ecoreAnnotation.ClassAnnotation#getAnnotatedClasses <em>Annotated Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getClassAnnotation()
 * @model
 * @generated
 */
public interface ClassAnnotation extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreAnnotation.PropertyAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getClassAnnotation_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAnnotation> getProperties();

	/**
	 * Returns the value of the '<em><b>Annotated Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Classes</em>' reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getClassAnnotation_AnnotatedClasses()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<EClass> getAnnotatedClasses();

} // ClassAnnotation
