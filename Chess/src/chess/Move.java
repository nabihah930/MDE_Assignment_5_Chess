/**
 */
package chess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Move#getStartSquare <em>Start Square</em>}</li>
 *   <li>{@link chess.Move#getEndSquare <em>End Square</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Square</em>' reference.
	 * @see #setStartSquare(Square)
	 * @see chess.ChessPackage#getMove_StartSquare()
	 * @model
	 * @generated
	 */
	Square getStartSquare();

	/**
	 * Sets the value of the '{@link chess.Move#getStartSquare <em>Start Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Square</em>' reference.
	 * @see #getStartSquare()
	 * @generated
	 */
	void setStartSquare(Square value);

	/**
	 * Returns the value of the '<em><b>End Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Square</em>' reference.
	 * @see #setEndSquare(Square)
	 * @see chess.ChessPackage#getMove_EndSquare()
	 * @model
	 * @generated
	 */
	Square getEndSquare();

	/**
	 * Sets the value of the '{@link chess.Move#getEndSquare <em>End Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Square</em>' reference.
	 * @see #getEndSquare()
	 * @generated
	 */
	void setEndSquare(Square value);

} // Move
