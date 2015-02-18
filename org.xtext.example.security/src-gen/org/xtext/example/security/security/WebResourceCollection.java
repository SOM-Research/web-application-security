/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.WebResourceCollection#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.xtext.example.security.security.WebResourceCollection#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.xtext.example.security.security.WebResourceCollection#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.xtext.example.security.security.WebResourceCollection#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getWebResourceCollection()
 * @model
 * @generated
 */
public interface WebResourceCollection extends EObject
{
  /**
   * Returns the value of the '<em><b>Web Resource Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Web Resource Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Web Resource Name</em>' attribute.
   * @see #setWebResourceName(String)
   * @see org.xtext.example.security.security.SecurityPackage#getWebResourceCollection_WebResourceName()
   * @model
   * @generated
   */
  String getWebResourceName();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.WebResourceCollection#getWebResourceName <em>Web Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Web Resource Name</em>' attribute.
   * @see #getWebResourceName()
   * @generated
   */
  void setWebResourceName(String value);

  /**
   * Returns the value of the '<em><b>Url Pattern</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.UrlPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url Pattern</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url Pattern</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getWebResourceCollection_UrlPattern()
   * @model containment="true"
   * @generated
   */
  EList<UrlPattern> getUrlPattern();

  /**
   * Returns the value of the '<em><b>Http Method</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.HttpMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Http Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Http Method</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getWebResourceCollection_HttpMethod()
   * @model containment="true"
   * @generated
   */
  EList<HttpMethod> getHttpMethod();

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identifier)
   * @see org.xtext.example.security.security.SecurityPackage#getWebResourceCollection_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.WebResourceCollection#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // WebResourceCollection
