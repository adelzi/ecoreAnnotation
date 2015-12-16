/**
 */
package ecoreAnnotation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.Annotation#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface Annotation extends EClassifier {
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
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotation_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyMapping> getProperties();

} // Annotation
