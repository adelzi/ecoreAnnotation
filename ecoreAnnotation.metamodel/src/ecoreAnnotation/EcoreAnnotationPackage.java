/**
 */
package ecoreAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link ecoreAnnotation.impl.AnnotationClassImpl <em>Annotation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.impl.AnnotationClassImpl
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getAnnotationClass()
	 * @generated
	 */
	int ANNOTATION_CLASS = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__EANNOTATIONS = EcorePackage.ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__NAME = EcorePackage.ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__INSTANCE_CLASS_NAME = EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__INSTANCE_CLASS = EcorePackage.ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__DEFAULT_VALUE = EcorePackage.ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__INSTANCE_TYPE_NAME = EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__EPACKAGE = EcorePackage.ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__ETYPE_PARAMETERS = EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__PROPERTIES = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__ANNOTATED_CLASS = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotating Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS__ANNOTATING_CLASS = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS_FEATURE_COUNT = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS___GET_EANNOTATION__STRING = EcorePackage.ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS___IS_INSTANCE__OBJECT = EcorePackage.ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS___GET_CLASSIFIER_ID = EcorePackage.ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>Annotation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_CLASS_OPERATION_COUNT = EcorePackage.ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreAnnotation.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.impl.PropertyMappingImpl
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getPropertyMapping()
	 * @generated
	 */
	int PROPERTY_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Annotating Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__ANNOTATING_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Annotated Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__ANNOTATED_PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Property Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ecoreAnnotation.ExpressionType <em>Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreAnnotation.ExpressionType
	 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 4;


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
	 * Returns the meta object for class '{@link ecoreAnnotation.AnnotationClass <em>Annotation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Class</em>'.
	 * @see ecoreAnnotation.AnnotationClass
	 * @generated
	 */
	EClass getAnnotationClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreAnnotation.AnnotationClass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see ecoreAnnotation.AnnotationClass#getProperties()
	 * @see #getAnnotationClass()
	 * @generated
	 */
	EReference getAnnotationClass_Properties();

	/**
	 * Returns the meta object for the reference '{@link ecoreAnnotation.AnnotationClass#getAnnotatedClass <em>Annotated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Class</em>'.
	 * @see ecoreAnnotation.AnnotationClass#getAnnotatedClass()
	 * @see #getAnnotationClass()
	 * @generated
	 */
	EReference getAnnotationClass_AnnotatedClass();

	/**
	 * Returns the meta object for the reference '{@link ecoreAnnotation.AnnotationClass#getAnnotatingClass <em>Annotating Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotating Class</em>'.
	 * @see ecoreAnnotation.AnnotationClass#getAnnotatingClass()
	 * @see #getAnnotationClass()
	 * @generated
	 */
	EReference getAnnotationClass_AnnotatingClass();

	/**
	 * Returns the meta object for class '{@link ecoreAnnotation.PropertyMapping <em>Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mapping</em>'.
	 * @see ecoreAnnotation.PropertyMapping
	 * @generated
	 */
	EClass getPropertyMapping();

	/**
	 * Returns the meta object for the attribute '{@link ecoreAnnotation.PropertyMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreAnnotation.PropertyMapping#getName()
	 * @see #getPropertyMapping()
	 * @generated
	 */
	EAttribute getPropertyMapping_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ecoreAnnotation.PropertyMapping#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ecoreAnnotation.PropertyMapping#getExpression()
	 * @see #getPropertyMapping()
	 * @generated
	 */
	EReference getPropertyMapping_Expression();

	/**
	 * Returns the meta object for the reference '{@link ecoreAnnotation.PropertyMapping#getAnnotatingProperty <em>Annotating Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotating Property</em>'.
	 * @see ecoreAnnotation.PropertyMapping#getAnnotatingProperty()
	 * @see #getPropertyMapping()
	 * @generated
	 */
	EReference getPropertyMapping_AnnotatingProperty();

	/**
	 * Returns the meta object for the reference '{@link ecoreAnnotation.PropertyMapping#getAnnotatedProperty <em>Annotated Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Property</em>'.
	 * @see ecoreAnnotation.PropertyMapping#getAnnotatedProperty()
	 * @see #getPropertyMapping()
	 * @generated
	 */
	EReference getPropertyMapping_AnnotatedProperty();

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
	 * Returns the meta object for the attribute '{@link ecoreAnnotation.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ecoreAnnotation.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link ecoreAnnotation.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecoreAnnotation.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for enum '{@link ecoreAnnotation.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Type</em>'.
	 * @see ecoreAnnotation.ExpressionType
	 * @generated
	 */
	EEnum getExpressionType();

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
		 * The meta object literal for the '{@link ecoreAnnotation.impl.AnnotationClassImpl <em>Annotation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.impl.AnnotationClassImpl
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getAnnotationClass()
		 * @generated
		 */
		EClass ANNOTATION_CLASS = eINSTANCE.getAnnotationClass();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_CLASS__PROPERTIES = eINSTANCE.getAnnotationClass_Properties();

		/**
		 * The meta object literal for the '<em><b>Annotated Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_CLASS__ANNOTATED_CLASS = eINSTANCE.getAnnotationClass_AnnotatedClass();

		/**
		 * The meta object literal for the '<em><b>Annotating Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_CLASS__ANNOTATING_CLASS = eINSTANCE.getAnnotationClass_AnnotatingClass();

		/**
		 * The meta object literal for the '{@link ecoreAnnotation.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.impl.PropertyMappingImpl
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getPropertyMapping()
		 * @generated
		 */
		EClass PROPERTY_MAPPING = eINSTANCE.getPropertyMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MAPPING__NAME = eINSTANCE.getPropertyMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MAPPING__EXPRESSION = eINSTANCE.getPropertyMapping_Expression();

		/**
		 * The meta object literal for the '<em><b>Annotating Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MAPPING__ANNOTATING_PROPERTY = eINSTANCE.getPropertyMapping_AnnotatingProperty();

		/**
		 * The meta object literal for the '<em><b>Annotated Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MAPPING__ANNOTATED_PROPERTY = eINSTANCE.getPropertyMapping_AnnotatedProperty();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link ecoreAnnotation.ExpressionType <em>Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreAnnotation.ExpressionType
		 * @see ecoreAnnotation.impl.EcoreAnnotationPackageImpl#getExpressionType()
		 * @generated
		 */
		EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

	}

} //EcoreAnnotationPackage
