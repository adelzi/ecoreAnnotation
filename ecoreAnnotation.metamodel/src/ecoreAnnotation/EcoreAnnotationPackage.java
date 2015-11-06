/**
 */
package ecoreAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecoreAnnotation.EcoreAnnotationFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreAnnotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreAnnotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.enseeiht.fr/ecoreAnnotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreAnnotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreAnnotationPackage eINSTANCE = ecoreAnnotation.impl.EcoreAnnotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreAnnotation.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.impl.AnnotationModelImpl
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getAnnotationModel()
	 * @generated
	 */
	int ANNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreAnnotation.impl.ClassAnnotationImpl <em>Class Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.impl.ClassAnnotationImpl
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getClassAnnotation()
	 * @generated
	 */
	int CLASS_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__EANNOTATIONS = EcorePackage.ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__NAME = EcorePackage.ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__INSTANCE_CLASS_NAME = EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__INSTANCE_CLASS = EcorePackage.ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__DEFAULT_VALUE = EcorePackage.ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__INSTANCE_TYPE_NAME = EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__EPACKAGE = EcorePackage.ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__ETYPE_PARAMETERS = EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__PROPERTIES = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__ANNOTATED_CLASSES = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION_FEATURE_COUNT = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION___GET_EANNOTATION__STRING = EcorePackage.ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION___IS_INSTANCE__OBJECT = EcorePackage.ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION___GET_CLASSIFIER_ID = EcorePackage.ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Class Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION_OPERATION_COUNT = EcorePackage.ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreAnnotation.impl.PropertyAnnotationImpl <em>Property Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.impl.PropertyAnnotationImpl
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getPropertyAnnotation()
	 * @generated
	 */
	int PROPERTY_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ANNOTATION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Property Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreAnnotation.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.impl.ExpressionImpl
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecoreAnnotation.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see ecoreAnnotation.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the attribute '{@link ecoreAnnotation.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreAnnotation.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreAnnotation.AnnotationModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ecoreAnnotation.AnnotationModel#getClasses()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_Classes();

	/**
	 * Returns the meta object for class '{@link ecoreAnnotation.ClassAnnotation <em>Class Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Annotation</em>'.
	 * @see ecoreAnnotation.ClassAnnotation
	 * @generated
	 */
	EClass getClassAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreAnnotation.ClassAnnotation#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see ecoreAnnotation.ClassAnnotation#getProperties()
	 * @see #getClassAnnotation()
	 * @generated
	 */
	EReference getClassAnnotation_Properties();

	/**
	 * Returns the meta object for the reference list '{@link ecoreAnnotation.ClassAnnotation#getAnnotatedClasses <em>Annotated Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Classes</em>'.
	 * @see ecoreAnnotation.ClassAnnotation#getAnnotatedClasses()
	 * @see #getClassAnnotation()
	 * @generated
	 */
	EReference getClassAnnotation_AnnotatedClasses();

	/**
	 * Returns the meta object for class '{@link ecoreAnnotation.PropertyAnnotation <em>Property Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Annotation</em>'.
	 * @see ecoreAnnotation.PropertyAnnotation
	 * @generated
	 */
	EClass getPropertyAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ecoreAnnotation.PropertyAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreAnnotation.PropertyAnnotation#getName()
	 * @see #getPropertyAnnotation()
	 * @generated
	 */
	EAttribute getPropertyAnnotation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreAnnotation.PropertyAnnotation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ecoreAnnotation.PropertyAnnotation#getExpression()
	 * @see #getPropertyAnnotation()
	 * @generated
	 */
	EReference getPropertyAnnotation_Expression();

	/**
	 * Returns the meta object for class '{@link ecoreAnnotation.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ecoreAnnotation.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link ecoreAnnotation.Expression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ecoreAnnotation.Expression#getDescription()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreAnnotationFactory getEcoreAnnotationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecoreAnnotation.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.impl.AnnotationModelImpl
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getAnnotationModel()
		 * @generated
		 */
		EClass ANNOTATION_MODEL = eINSTANCE.getAnnotationModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__NAME = eINSTANCE.getAnnotationModel_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__CLASSES = eINSTANCE.getAnnotationModel_Classes();

		/**
		 * The meta object literal for the '{@link ecoreAnnotation.impl.ClassAnnotationImpl <em>Class Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.impl.ClassAnnotationImpl
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getClassAnnotation()
		 * @generated
		 */
		EClass CLASS_ANNOTATION = eINSTANCE.getClassAnnotation();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ANNOTATION__PROPERTIES = eINSTANCE.getClassAnnotation_Properties();

		/**
		 * The meta object literal for the '<em><b>Annotated Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ANNOTATION__ANNOTATED_CLASSES = eINSTANCE.getClassAnnotation_AnnotatedClasses();

		/**
		 * The meta object literal for the '{@link ecoreAnnotation.impl.PropertyAnnotationImpl <em>Property Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.impl.PropertyAnnotationImpl
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getPropertyAnnotation()
		 * @generated
		 */
		EClass PROPERTY_ANNOTATION = eINSTANCE.getPropertyAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ANNOTATION__NAME = eINSTANCE.getPropertyAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ANNOTATION__EXPRESSION = eINSTANCE.getPropertyAnnotation_Expression();

		/**
		 * The meta object literal for the '{@link ecoreAnnotation.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.impl.ExpressionImpl
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__DESCRIPTION = eINSTANCE.getExpression_Description();

	}

} //EcoreAnnotationPackage
