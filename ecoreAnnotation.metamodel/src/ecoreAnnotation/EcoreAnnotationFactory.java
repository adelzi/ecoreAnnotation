/**
 */
package ecoreAnnotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecoreAnnotation.EcoreAnnotationPackage
 * @generated
 */
public interface EcoreAnnotationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreAnnotationFactory eINSTANCE = ecoreAnnotation.impl.EcoreAnnotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Model</em>'.
	 * @generated
	 */
	AnnotationModel createAnnotationModel();

	/**
	 * Returns a new object of class '<em>Class Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Annotation</em>'.
	 * @generated
	 */
	ClassAnnotation createClassAnnotation();

	/**
	 * Returns a new object of class '<em>Property Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Annotation</em>'.
	 * @generated
	 */
	PropertyAnnotation createPropertyAnnotation();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreAnnotationPackage getEcoreAnnotationPackage();

} //EcoreAnnotationFactory
