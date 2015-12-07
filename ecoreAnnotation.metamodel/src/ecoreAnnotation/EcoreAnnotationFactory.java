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
	 * Returns a new object of class '<em>Annotation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Class</em>'.
	 * @generated
	 */
	AnnotationClass createAnnotationClass();

	/**
	 * Returns a new object of class '<em>Property Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Mapping</em>'.
	 * @generated
	 */
	PropertyMapping createPropertyMapping();

	/**
	 * Returns a new object of class '<em>Case Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Of</em>'.
	 * @generated
	 */
	CaseOf createCaseOf();

	/**
	 * Returns a new object of class '<em>Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalence</em>'.
	 * @generated
	 */
	Equivalence createEquivalence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreAnnotationPackage getEcoreAnnotationPackage();

} //EcoreAnnotationFactory
