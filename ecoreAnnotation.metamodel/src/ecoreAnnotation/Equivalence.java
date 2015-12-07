/**
 */
package ecoreAnnotation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreAnnotation.Equivalence#getClass1 <em>Class1</em>}</li>
 *   <li>{@link ecoreAnnotation.Equivalence#getClass2 <em>Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreAnnotation.EcoreAnnotationPackage#getEquivalence()
 * @model
 * @generated
 */
public interface Equivalence extends Annotation {
	/**
	 * Returns the value of the '<em><b>Class1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class1</em>' reference.
	 * @see #setClass1(EClass)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getEquivalence_Class1()
	 * @model required="true"
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.Equivalence#getClass1 <em>Class1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1</em>' reference.
	 * @see #getClass1()
	 * @generated
	 */
	void setClass1(EClass value);

	/**
	 * Returns the value of the '<em><b>Class2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class2</em>' reference.
	 * @see #setClass2(EClass)
	 * @see ecoreAnnotation.EcoreAnnotationPackage#getEquivalence_Class2()
	 * @model required="true"
	 * @generated
	 */
	EClass getClass2();

	/**
	 * Sets the value of the '{@link ecoreAnnotation.Equivalence#getClass2 <em>Class2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2</em>' reference.
	 * @see #getClass2()
	 * @generated
	 */
	void setClass2(EClass value);

} // Equivalence
