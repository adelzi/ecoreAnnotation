/**
 */
package ecoreAnnotation.impl;

import ecoreAnnotation.AnnotationClass;
import ecoreAnnotation.AnnotationModel;
import ecoreAnnotation.CaseOf;
import ecoreAnnotation.EcoreAnnotationPackage;
import ecoreAnnotation.Equivalence;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecoreAnnotation.impl.AnnotationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.AnnotationModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.AnnotationModelImpl#getPartialInhiritences <em>Partial Inhiritences</em>}</li>
 *   <li>{@link ecoreAnnotation.impl.AnnotationModelImpl#getEquivalences <em>Equivalences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationModelImpl extends MinimalEObjectImpl.Container implements AnnotationModel {
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
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationClass> classes;

	/**
	 * The cached value of the '{@link #getPartialInhiritences() <em>Partial Inhiritences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialInhiritences()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseOf> partialInhiritences;

	/**
	 * The cached value of the '{@link #getEquivalences() <em>Equivalences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalences()
	 * @generated
	 * @ordered
	 */
	protected EList<Equivalence> equivalences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreAnnotationPackage.Literals.ANNOTATION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreAnnotationPackage.ANNOTATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<AnnotationClass>(AnnotationClass.class, this, EcoreAnnotationPackage.ANNOTATION_MODEL__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseOf> getPartialInhiritences() {
		if (partialInhiritences == null) {
			partialInhiritences = new EObjectContainmentEList<CaseOf>(CaseOf.class, this, EcoreAnnotationPackage.ANNOTATION_MODEL__PARTIAL_INHIRITENCES);
		}
		return partialInhiritences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equivalence> getEquivalences() {
		if (equivalences == null) {
			equivalences = new EObjectContainmentEList<Equivalence>(Equivalence.class, this, EcoreAnnotationPackage.ANNOTATION_MODEL__EQUIVALENCES);
		}
		return equivalences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreAnnotationPackage.ANNOTATION_MODEL__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case EcoreAnnotationPackage.ANNOTATION_MODEL__PARTIAL_INHIRITENCES:
				return ((InternalEList<?>)getPartialInhiritences()).basicRemove(otherEnd, msgs);
			case EcoreAnnotationPackage.ANNOTATION_MODEL__EQUIVALENCES:
				return ((InternalEList<?>)getEquivalences()).basicRemove(otherEnd, msgs);
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
			case EcoreAnnotationPackage.ANNOTATION_MODEL__NAME:
				return getName();
			case EcoreAnnotationPackage.ANNOTATION_MODEL__CLASSES:
				return getClasses();
			case EcoreAnnotationPackage.ANNOTATION_MODEL__PARTIAL_INHIRITENCES:
				return getPartialInhiritences();
			case EcoreAnnotationPackage.ANNOTATION_MODEL__EQUIVALENCES:
				return getEquivalences();
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
			case EcoreAnnotationPackage.ANNOTATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case EcoreAnnotationPackage.ANNOTATION_MODEL__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends AnnotationClass>)newValue);
				return;
			case EcoreAnnotationPackage.ANNOTATION_MODEL__PARTIAL_INHIRITENCES:
				getPartialInhiritences().clear();
				getPartialInhiritences().addAll((Collection<? extends CaseOf>)newValue);
				return;
			case EcoreAnnotationPackage.ANNOTATION_MODEL__EQUIVALENCES:
				getEquivalences().clear();
				getEquivalences().addAll((Collection<? extends Equivalence>)newValue);
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
			case EcoreAnnotationPackage.ANNOTATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcoreAnnotationPackage.ANNOTATION_MODEL__CLASSES:
				getClasses().clear();
				return;
			case EcoreAnnotationPackage.ANNOTATION_MODEL__PARTIAL_INHIRITENCES:
				getPartialInhiritences().clear();
				return;
			case EcoreAnnotationPackage.ANNOTATION_MODEL__EQUIVALENCES:
				getEquivalences().clear();
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
			case EcoreAnnotationPackage.ANNOTATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcoreAnnotationPackage.ANNOTATION_MODEL__CLASSES:
				return classes != null && !classes.isEmpty();
			case EcoreAnnotationPackage.ANNOTATION_MODEL__PARTIAL_INHIRITENCES:
				return partialInhiritences != null && !partialInhiritences.isEmpty();
			case EcoreAnnotationPackage.ANNOTATION_MODEL__EQUIVALENCES:
				return equivalences != null && !equivalences.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AnnotationModelImpl
