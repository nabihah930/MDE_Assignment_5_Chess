/**
 */
package chess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Piece#getColor <em>Color</em>}</li>
 *   <li>{@link chess.Piece#getDirectionOfMovement <em>Direction Of Movement</em>}</li>
 *   <li>{@link chess.Piece#getDistance <em>Distance</em>}</li>
 *   <li>{@link chess.Piece#getCurrentPosition <em>Current Position</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getPiece()
 * @model abstract="true"
 * @generated
 */
public interface Piece extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link chess.PlayerColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see chess.PlayerColor
	 * @see #setColor(PlayerColor)
	 * @see chess.ChessPackage#getPiece_Color()
	 * @model
	 * @generated
	 */
	PlayerColor getColor();

	/**
	 * Sets the value of the '{@link chess.Piece#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see chess.PlayerColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(PlayerColor value);

	/**
	 * Returns the value of the '<em><b>Direction Of Movement</b></em>' attribute.
	 * The literals are from the enumeration {@link chess.MoveDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Of Movement</em>' attribute.
	 * @see chess.MoveDirection
	 * @see #setDirectionOfMovement(MoveDirection)
	 * @see chess.ChessPackage#getPiece_DirectionOfMovement()
	 * @model
	 * @generated
	 */
	MoveDirection getDirectionOfMovement();

	/**
	 * Sets the value of the '{@link chess.Piece#getDirectionOfMovement <em>Direction Of Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Of Movement</em>' attribute.
	 * @see chess.MoveDirection
	 * @see #getDirectionOfMovement()
	 * @generated
	 */
	void setDirectionOfMovement(MoveDirection value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see chess.ChessPackage#getPiece_Distance()
	 * @model
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link chess.Piece#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' reference.
	 * @see #setCurrentPosition(Square)
	 * @see chess.ChessPackage#getPiece_CurrentPosition()
	 * @model
	 * @generated
	 */
	Square getCurrentPosition();

	/**
	 * Sets the value of the '{@link chess.Piece#getCurrentPosition <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' reference.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(Square value);

} // Piece
