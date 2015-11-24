/**
 */
package ecoreAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.PropertyMapping#getName <em>Name</em>}</li>
 *   <li>{@link ecoreAnnotation.PropertyMapping#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecoreAnnotation.PropertyMapping#getAnnotatingProperty <em>Annotating Property</em>}</li>
 *   <li>{@link ecoreAnnotation.PropertyMapping#getAnnotatedProperty <em>Annotated Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getPropertyMapping()
 * @model
 * @generated
 */
public interface PropertyMapping extends EObject {
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
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getPropertyMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.PropertyMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getPropertyMapping_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.PropertyMapping#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Annotating Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotating Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotating Property</em>' reference.
	 * @see #setAnnotatingProperty(EAttribute)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getPropertyMapping_AnnotatingProperty()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAnnotatingProperty();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.PropertyMapping#getAnnotatingProperty <em>Annotating Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotating Property</em>' reference.
	 * @see #getAnnotatingProperty()
	 * @generated
	 */
	void setAnnotatingProperty(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Annotated Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Property</em>' reference.
	 * @see #setAnnotatedProperty(EAttribute)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getPropertyMapping_AnnotatedProperty()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAnnotatedProperty();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.PropertyMapping#getAnnotatedProperty <em>Annotated Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Property</em>' reference.
	 * @see #getAnnotatedProperty()
	 * @generated
	 */
	void setAnnotatedProperty(EAttribute value);

} // PropertyMapping
