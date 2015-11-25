/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.CaseOf;
import ecoreAnnotation.EcoreAnnotationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreAnnotation.impl.CaseOfImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.CaseOfImpl#getExtendedClass <em>Extended Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseOfImpl extends AnnotationImpl implements CaseOf {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EClass superClass;

	/**
	 * The cached value of the '{@link #getExtendedClass() <em>Extended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected EClass extendedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreAnnotationPackage.Literals.CASE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject)superClass;
			superClass = (EClass)eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.CASE_OF__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(EClass newSuperClass) {
		EClass oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.CASE_OF__SUPER_CLASS, oldSuperClass, superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedClass() {
		if (extendedClass != null && extendedClass.eIsProxy()) {
			InternalEObject oldExtendedClass = (InternalEObject)extendedClass;
			extendedClass = (EClass)eResolveProxy(oldExtendedClass);
			if (extendedClass != oldExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.CASE_OF__EXTENDED_CLASS, oldExtendedClass, extendedClass));
			}
		}
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetExtendedClass() {
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedClass(EClass newExtendedClass) {
		EClass oldExtendedClass = extendedClass;
		extendedClass = newExtendedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.CASE_OF__EXTENDED_CLASS, oldExtendedClass, extendedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreAnnotationPackage.CASE_OF__SUPER_CLASS:
				if (resolve) return getSuperClass();
				return basicGetSuperClass();
			case EcoreAnnotationPackage.CASE_OF__EXTENDED_CLASS:
				if (resolve) return getExtendedClass();
				return basicGetExtendedClass();
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
			case EcoreAnnotationPackage.CASE_OF__SUPER_CLASS:
				setSuperClass((EClass)newValue);
				return;
			case EcoreAnnotationPackage.CASE_OF__EXTENDED_CLASS:
				setExtendedClass((EClass)newValue);
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
			case EcoreAnnotationPackage.CASE_OF__SUPER_CLASS:
				setSuperClass((EClass)null);
				return;
			case EcoreAnnotationPackage.CASE_OF__EXTENDED_CLASS:
				setExtendedClass((EClass)null);
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
			case EcoreAnnotationPackage.CASE_OF__SUPER_CLASS:
				return superClass != null;
			case EcoreAnnotationPackage.CASE_OF__EXTENDED_CLASS:
				return extendedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseOfImpl
