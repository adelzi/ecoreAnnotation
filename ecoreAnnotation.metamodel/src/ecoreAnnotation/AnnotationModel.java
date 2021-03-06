/**
 */
package ecoreAnnotation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.AnnotationModel#getName <em>Name</em>}</li>
 *   <li>{@link ecoreAnnotation.AnnotationModel#getAnnotationClasses <em>Annotation Classes</em>}</li>
 *   <li>{@link ecoreAnnotation.AnnotationModel#getPartialInhiritences <em>Partial Inhiritences</em>}</li>
 *   <li>{@link ecoreAnnotation.AnnotationModel#getEquivalences <em>Equivalences</em>}</li>
 *   <li>{@link ecoreAnnotation.AnnotationModel#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationModel()
 * @model
 * @generated
 */
public interface AnnotationModel extends EObject {
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
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.AnnotationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotation Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreAnnotation.AnnotationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Classes</em>' containment reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationModel_AnnotationClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationClass> getAnnotationClasses();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.emf.ecore.EClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Partial Inhiritences</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreAnnotation.CaseOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial Inhiritences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Inhiritences</em>' containment reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationModel_PartialInhiritences()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaseOf> getPartialInhiritences();

	/**
	 * Returns the value of the '<em><b>Equivalences</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreAnnotation.Equivalence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalences</em>' containment reference list.
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getAnnotationModel_Equivalences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equivalence> getEquivalences();

} // AnnotationModel
