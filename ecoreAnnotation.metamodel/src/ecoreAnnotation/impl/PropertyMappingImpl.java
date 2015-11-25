/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.EcoreAnnotationPackage;
import ecoreAnnotation.ExpressionType;
import ecoreAnnotation.PropertyMapping;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreAnnotation.impl.PropertyMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.PropertyMappingImpl#getAnnotatingProperty <em>Annotating Property</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.PropertyMappingImpl#getAnnotatedProperty <em>Annotated Property</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.PropertyMappingImpl#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.PropertyMappingImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyMappingImpl extends MinimalEObjectImpl.Container implements PropertyMapping {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotatingProperty() <em>Annotating Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatingProperty()
	 * @generated
	 * @ordered
	 */
	protected EAttribute annotatingProperty;

	/**
	 * The cached value of the '{@link #getAnnotatedProperty() <em>Annotated Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedProperty()
	 * @generated
	 * @ordered
	 */
	protected EAttribute annotatedProperty;

	/**
	 * The default value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected static final ExpressionType EXPRESSION_TYPE_EDEFAULT = ExpressionType.CONSTRAINT;

	/**
	 * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType expressionType = EXPRESSION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreAnnotationPackage.Literals.PROPERTY_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.PROPERTY_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatingProperty() {
		if (annotatingProperty != null && annotatingProperty.eIsProxy()) {
			InternalEObject oldAnnotatingProperty = (InternalEObject)annotatingProperty;
			annotatingProperty = (EAttribute)eResolveProxy(oldAnnotatingProperty);
			if (annotatingProperty != oldAnnotatingProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATING_PROPERTY, oldAnnotatingProperty, annotatingProperty));
			}
		}
		return annotatingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAnnotatingProperty() {
		return annotatingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatingProperty(EAttribute newAnnotatingProperty) {
		EAttribute oldAnnotatingProperty = annotatingProperty;
		annotatingProperty = newAnnotatingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATING_PROPERTY, oldAnnotatingProperty, annotatingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedProperty() {
		if (annotatedProperty != null && annotatedProperty.eIsProxy()) {
			InternalEObject oldAnnotatedProperty = (InternalEObject)annotatedProperty;
			annotatedProperty = (EAttribute)eResolveProxy(oldAnnotatedProperty);
			if (annotatedProperty != oldAnnotatedProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATED_PROPERTY, oldAnnotatedProperty, annotatedProperty));
			}
		}
		return annotatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAnnotatedProperty() {
		return annotatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedProperty(EAttribute newAnnotatedProperty) {
		EAttribute oldAnnotatedProperty = annotatedProperty;
		annotatedProperty = newAnnotatedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATED_PROPERTY, oldAnnotatedProperty, annotatedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionType(ExpressionType newExpressionType) {
		ExpressionType oldExpressionType = expressionType;
		expressionType = newExpressionType == null ? EXPRESSION_TYPE_EDEFAULT : newExpressionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION_TYPE, oldExpressionType, expressionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreAnnotationPackage.PROPERTY_MAPPING__NAME:
				return getName();
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATING_PROPERTY:
				if (resolve) return getAnnotatingProperty();
				return basicGetAnnotatingProperty();
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATED_PROPERTY:
				if (resolve) return getAnnotatedProperty();
				return basicGetAnnotatedProperty();
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION_TYPE:
				return getExpressionType();
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcoreAnnotationPackage.PROPERTY_MAPPING__NAME:
				setName((String)newValue);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATING_PROPERTY:
				setAnnotatingProperty((EAttribute)newValue);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATED_PROPERTY:
				setAnnotatedProperty((EAttribute)newValue);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION_TYPE:
				setExpressionType((ExpressionType)newValue);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION:
				setExpression((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcoreAnnotationPackage.PROPERTY_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATING_PROPERTY:
				setAnnotatingProperty((EAttribute)null);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATED_PROPERTY:
				setAnnotatedProperty((EAttribute)null);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION_TYPE:
				setExpressionType(EXPRESSION_TYPE_EDEFAULT);
				return;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcoreAnnotationPackage.PROPERTY_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATING_PROPERTY:
				return annotatingProperty != null;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__ANNOTATED_PROPERTY:
				return annotatedProperty != null;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION_TYPE:
				return expressionType != EXPRESSION_TYPE_EDEFAULT;
			case EcoreAnnotationPackage.PROPERTY_MAPPING__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", expressionType: ");
		result.append(expressionType);
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //PropertyMappingImpl
