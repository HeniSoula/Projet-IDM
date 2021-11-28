/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.game.Objets#getListeObjets <em>Liste Objets</em>}</li>
 * </ul>
 *
 * @see fr.n7.game.GamePackage#getObjets()
 * @model
 * @generated
 */
public interface Objets extends EObject
{
  /**
   * Returns the value of the '<em><b>Liste Objets</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.game.Objet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Liste Objets</em>' containment reference list.
   * @see fr.n7.game.GamePackage#getObjets_ListeObjets()
   * @model containment="true"
   * @generated
   */
  EList<Objet> getListeObjets();

} // Objets