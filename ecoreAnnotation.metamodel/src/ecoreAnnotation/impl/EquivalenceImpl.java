/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.EcoreAnnotationPackage;
import ecoreAnnotation.Equivalence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreAnnotation.impl.EquivalenceImpl#getClass1 <em>Class1</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.EquivalenceImpl#getClass2 <em>Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalenceImpl extends AnnotationImpl implements Equivalence {
	/**
	 * The cached value of the '{@link #getClass1() <em>Class1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1()
	 * @generated
	 * @ordered
	 */
	protected EClass class1;

	/**
	 * The cached value of the '{@link #getClass2() <em>Class2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2()
	 * @generated
	 * @ordered
	 */
	protected EClass class2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreAnnotationPackage.Literals.EQUIVALENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass1() {
		if (class1 != null && class1.eIsProxy()) {
			InternalEObject oldClass1 = (InternalEObject)class1;
			class1 = (EClass)eResolveProxy(oldClass1);
			if (class1 != oldClass1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.EQUIVALENCE__CLASS1, oldClass1, class1));
			}
		}
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClass1() {
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass1(EClass newClass1) {
		EClass oldClass1 = class1;
		class1 = newClass1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.EQUIVALENCE__CLASS1, oldClass1, class1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass2() {
		if (class2 != null && class2.eIsProxy()) {
			InternalEObject oldClass2 = (InternalEObject)class2;
			class2 = (EClass)eResolveProxy(oldClass2);
			if (class2 != oldClass2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreAnnotationPackage.EQUIVALENCE__CLASS2, oldClass2, class2));
			}
		}
		return class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClass2() {
		return class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass2(EClass newClass2) {
		EClass oldClass2 = class2;
		class2 = newClass2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.EQUIVALENCE__CLASS2, oldClass2, class2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS1:
				if (resolve) return getClass1();
				return basicGetClass1();
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS2:
				if (resolve) return getClass2();
				return basicGetClass2();
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
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS1:
				setClass1((EClass)newValue);
				return;
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS2:
				setClass2((EClass)newValue);
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
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS1:
				setClass1((EClass)null);
				return;
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS2:
				setClass2((EClass)null);
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
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS1:
				return class1 != null;
			case EcoreAnnotationPackage.EQUIVALENCE__CLASS2:
				return class2 != null;
		}
		return super.eIsSet(featureID);
	}

} //EquivalenceImpl
