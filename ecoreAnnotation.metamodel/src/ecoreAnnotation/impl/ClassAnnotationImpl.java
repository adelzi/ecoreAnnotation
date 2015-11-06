/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.ClassAnnotation;
import ecoreAnnotation.EcoreAnnotationPackage;
import ecoreAnnotation.PropertyAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EClassifierImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreAnnotation.impl.ClassAnnotationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.ClassAnnotationImpl#getAnnotatedClasses <em>Annotated Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAnnotationImpl extends EClassifierImpl implements ClassAnnotation {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAnnotation> properties;

	/**
	 * The cached value of the '{@link #getAnnotatedClasses() <em>Annotated Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> annotatedClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreAnnotationPackage.Literals.CLASS_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAnnotation> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyAnnotation>(PropertyAnnotation.class, this, EcoreAnnotationPackage.CLASS_ANNOTATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getAnnotatedClasses() {
		if (annotatedClasses == null) {
			annotatedClasses = new EObjectResolvingEList<EClass>(EClass.class, this, EcoreAnnotationPackage.CLASS_ANNOTATION__ANNOTATED_CLASSES);
		}
		return annotatedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreAnnotationPackage.CLASS_ANNOTATION__PROPERTIES:
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
			case EcoreAnnotationPackage.CLASS_ANNOTATION__PROPERTIES:
				return getProperties();
			case EcoreAnnotationPackage.CLASS_ANNOTATION__ANNOTATED_CLASSES:
				return getAnnotatedClasses();
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
			case EcoreAnnotationPackage.CLASS_ANNOTATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyAnnotation>)newValue);
				return;
			case EcoreAnnotationPackage.CLASS_ANNOTATION__ANNOTATED_CLASSES:
				getAnnotatedClasses().clear();
				getAnnotatedClasses().addAll((Collection<? extends EClass>)newValue);
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
			case EcoreAnnotationPackage.CLASS_ANNOTATION__PROPERTIES:
				getProperties().clear();
				return;
			case EcoreAnnotationPackage.CLASS_ANNOTATION__ANNOTATED_CLASSES:
				getAnnotatedClasses().clear();
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
			case EcoreAnnotationPackage.CLASS_ANNOTATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case EcoreAnnotationPackage.CLASS_ANNOTATION__ANNOTATED_CLASSES:
				return annotatedClasses != null && !annotatedClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassAnnotationImpl
