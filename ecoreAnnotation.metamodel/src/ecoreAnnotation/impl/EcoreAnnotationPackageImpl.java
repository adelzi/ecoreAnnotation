/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.Annotation;
import ecoreAnnotation.AnnotationClass;
import ecoreAnnotation.AnnotationModel;
import ecoreAnnotation.CaseOf;
import ecoreAnnotation.EcoreAnnotationFactory;
import ecoreAnnotation.EcoreAnnotationPackage;
import ecoreAnnotation.Equivalence;
import ecoreAnnotation.ExpressionType;
import ecoreAnnotation.PropertyMapping;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreAnnotationPackageImpl extends EPackageImpl implements EcoreAnnotationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecoreAnnotation.EcoreAnnotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreAnnotationPackageImpl() {
		super(eNS_URI, EcoreAnnotationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcoreAnnotationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreAnnotationPackage init() {
		if (isInited) return (EcoreAnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreAnnotationPackage.eNS_URI);

		// Obtain or create and register package
		EcoreAnnotationPackageImpl theEcoreAnnotationPackage = (EcoreAnnotationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcoreAnnotationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcoreAnnotationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcoreAnnotationPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreAnnotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreAnnotationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreAnnotationPackage.eNS_URI, theEcoreAnnotationPackage);
		return theEcoreAnnotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationModel() {
		return annotationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_Name() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_Classes() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_PartialInhiritences() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_Equivalences() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationClass() {
		return annotationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationClass_AnnotatedClass() {
		return (EReference)annotationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationClass_AnnotatingClass() {
		return (EReference)annotationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyMapping() {
		return propertyMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyMapping_Name() {
		return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyMapping_Expression() {
		return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseOf() {
		return caseOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseOf_SuperClass() {
		return (EReference)caseOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseOf_ExtendedClass() {
		return (EReference)caseOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Properties() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalence() {
		return equivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalence_Class1() {
		return (EReference)equivalenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalence_Class2() {
		return (EReference)equivalenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyMapping_AnnotatingProperty() {
		return (EReference)propertyMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyMapping_AnnotatedProperty() {
		return (EReference)propertyMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyMapping_ExpressionType() {
		return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpressionType() {
		return expressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreAnnotationFactory getEcoreAnnotationFactory() {
		return (EcoreAnnotationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationModelEClass = createEClass(ANNOTATION_MODEL);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__CLASSES);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__PARTIAL_INHIRITENCES);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__EQUIVALENCES);

		annotationClassEClass = createEClass(ANNOTATION_CLASS);
		createEReference(annotationClassEClass, ANNOTATION_CLASS__ANNOTATED_CLASS);
		createEReference(annotationClassEClass, ANNOTATION_CLASS__ANNOTATING_CLASS);

		propertyMappingEClass = createEClass(PROPERTY_MAPPING);
		createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__NAME);
		createEReference(propertyMappingEClass, PROPERTY_MAPPING__ANNOTATING_PROPERTY);
		createEReference(propertyMappingEClass, PROPERTY_MAPPING__ANNOTATED_PROPERTY);
		createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__EXPRESSION_TYPE);
		createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__EXPRESSION);

		caseOfEClass = createEClass(CASE_OF);
		createEReference(caseOfEClass, CASE_OF__SUPER_CLASS);
		createEReference(caseOfEClass, CASE_OF__EXTENDED_CLASS);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__PROPERTIES);

		equivalenceEClass = createEClass(EQUIVALENCE);
		createEReference(equivalenceEClass, EQUIVALENCE__CLASS1);
		createEReference(equivalenceEClass, EQUIVALENCE__CLASS2);

		// Create enums
		expressionTypeEEnum = createEEnum(EXPRESSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annotationClassEClass.getESuperTypes().add(this.getAnnotation());
		caseOfEClass.getESuperTypes().add(this.getAnnotation());
		annotationEClass.getESuperTypes().add(theEcorePackage.getEClassifier());
		equivalenceEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_Classes(), this.getAnnotationClass(), null, "classes", null, 0, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_PartialInhiritences(), this.getCaseOf(), null, "partialInhiritences", null, 0, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_Equivalences(), this.getEquivalence(), null, "equivalences", null, 0, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationClassEClass, AnnotationClass.class, "AnnotationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationClass_AnnotatedClass(), theEcorePackage.getEClass(), null, "annotatedClass", null, 1, 1, AnnotationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationClass_AnnotatingClass(), theEcorePackage.getEClass(), null, "annotatingClass", null, 1, 1, AnnotationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyMappingEClass, PropertyMapping.class, "PropertyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyMapping_AnnotatingProperty(), theEcorePackage.getEAttribute(), null, "annotatingProperty", null, 1, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyMapping_AnnotatedProperty(), theEcorePackage.getEAttribute(), null, "annotatedProperty", null, 1, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyMapping_ExpressionType(), this.getExpressionType(), "expressionType", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyMapping_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseOfEClass, CaseOf.class, "CaseOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseOf_SuperClass(), theEcorePackage.getEClass(), null, "superClass", null, 1, 1, CaseOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseOf_ExtendedClass(), theEcorePackage.getEClass(), null, "extendedClass", null, 1, 1, CaseOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Properties(), this.getPropertyMapping(), null, "properties", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalenceEClass, Equivalence.class, "Equivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalence_Class1(), theEcorePackage.getEClass(), null, "class1", null, 1, 1, Equivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalence_Class2(), theEcorePackage.getEClass(), null, "class2", null, 1, 1, Equivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(expressionTypeEEnum, ExpressionType.class, "ExpressionType");
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.CONSTRAINT);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ALGEBRIC);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.DISCRET);

		// Create resource
		createResource(eNS_URI);
	}

} //EcoreAnnotationPackageImpl
