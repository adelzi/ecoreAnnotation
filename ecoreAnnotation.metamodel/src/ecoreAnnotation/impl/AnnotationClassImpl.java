/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.AnnotationClass;
import ecoreAnnotation.EcoreAnnotationPackage;
import ecoreAnnotation.PropertyMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EClassifierImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreAnnotation.impl.AnnotationClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.AnnotationClassImpl#getAnnotatedClass <em>Annotated Class</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.AnnotationClassImpl#getAnnotatingClass <em>Annotating Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationClassImpl extends EClassifierImpl implements AnnotationClass {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyMapping> properties;

	/**
	 * The cached value of the '{@link #getAnnotatedClass() <em>Annotated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedClass()
	 * @generated
	 * @ordered
	 */
	protected EClass annotatedClass;

	/**
	 * The cached value of the '{@link #getAnnotatingClass() <em>Annotating Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatingClass()
	 * @generated
	 * @ordered
	 */
	protected EClass annotatingClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreAnnotationPackage.Literals.ANNOTATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyMapping> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyMapping>(PropertyMapping.class, this, EcoreAnnotationPackage.ANNOTATION_CLASS__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedClass() {
		if (annotatedClass != null && annotatedClass.eIsProxy()) {
			InternalEObject oldAnnotatedClass = (InternalEObject)annotatedClass;
			annotatedClass = (EClass)eResolveProxy(oldAnnotatedClass);
			if (annotatedClass != oldAnnotatedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATED_CLASS, oldAnnotatedClass, annotatedClass));
			}
		}
		return annotatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAnnotatedClass() {
		return annotatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedClass(EClass newAnnotatedClass) {
		EClass oldAnnotatedClass = annotatedClass;
		annotatedClass = newAnnotatedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATED_CLASS, oldAnnotatedClass, annotatedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatingClass() {
		if (annotatingClass != null && annotatingClass.eIsProxy()) {
			InternalEObject oldAnnotatingClass = (InternalEObject)annotatingClass;
			annotatingClass = (EClass)eResolveProxy(oldAnnotatingClass);
			if (annotatingClass != oldAnnotatingClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATING_CLASS, oldAnnotatingClass, annotatingClass));
			}
		}
		return annotatingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAnnotatingClass() {
		return annotatingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatingClass(EClass newAnnotatingClass) {
		EClass oldAnnotatingClass = annotatingClass;
		annotatingClass = newAnnotatingClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATING_CLASS, oldAnnotatingClass, annotatingClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreAnnotationPackage.ANNOTATION_CLASS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreAnnotationPackage.ANNOTATION_CLASS__PROPERTIES:
				return getProperties();
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATED_CLASS:
				if (resolve) return getAnnotatedClass();
				return basicGetAnnotatedClass();
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATING_CLASS:
				if (resolve) return getAnnotatingClass();
				return basicGetAnnotatingClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcoreAnnotationPackage.ANNOTATION_CLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyMapping>)newValue);
				return;
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATED_CLASS:
				setAnnotatedClass((EClass)newValue);
				return;
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATING_CLASS:
				setAnnotatingClass((EClass)newValue);
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
			case EcoreAnnotationPackage.ANNOTATION_CLASS__PROPERTIES:
				getProperties().clear();
				return;
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATED_CLASS:
				setAnnotatedClass((EClass)null);
				return;
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATING_CLASS:
				setAnnotatingClass((EClass)null);
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
			case EcoreAnnotationPackage.ANNOTATION_CLASS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATED_CLASS:
				return annotatedClass != null;
			case EcoreAnnotationPackage.ANNOTATION_CLASS__ANNOTATING_CLASS:
				return annotatingClass != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationClassImpl
