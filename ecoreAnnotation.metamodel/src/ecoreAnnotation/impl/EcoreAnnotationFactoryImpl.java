/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreAnnotationFactoryImpl extends EFactoryImpl implements EcoreAnnotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreAnnotationFactory init() {
		try {
			EcoreAnnotationFactory theEcoreAnnotationFactory = (EcoreAnnotationFactory)EPackage.Registry.INSTANCE.getEFactory(EcoreAnnotationPackage.eNS_URI);
			if (theEcoreAnnotationFactory != null) {
				return theEcoreAnnotationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreAnnotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAnnotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcoreAnnotationPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case EcoreAnnotationPackage.CLASS_ANNOTATION: return createClassAnnotation();
			case EcoreAnnotationPackage.PROPERTY_ANNOTATION: return createPropertyAnnotation();
			case EcoreAnnotationPackage.EXPRESSION: return createExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel createAnnotationModel() {
		AnnotationModelImpl annotationModel = new AnnotationModelImpl();
		return annotationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAnnotation createClassAnnotation() {
		ClassAnnotationImpl classAnnotation = new ClassAnnotationImpl();
		return classAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAnnotation createPropertyAnnotation() {
		PropertyAnnotationImpl propertyAnnotation = new PropertyAnnotationImpl();
		return propertyAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAnnotationPackage getEcoreAnnotationPackage() {
		return (EcoreAnnotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreAnnotationPackage getPackage() {
		return EcoreAnnotationPackage.eINSTANCE;
	}

} //EcoreAnnotationFactoryImpl
