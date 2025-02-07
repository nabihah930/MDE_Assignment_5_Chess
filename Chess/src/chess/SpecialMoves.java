/**
 */
package chess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Moves</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.SpecialMoves#isCastleQueensideWhite <em>Castle Queenside White</em>}</li>
 *   <li>{@link chess.SpecialMoves#isCastleQueensideBlack <em>Castle Queenside Black</em>}</li>
 *   <li>{@link chess.SpecialMoves#isCastleKingsideWhite <em>Castle Kingside White</em>}</li>
 *   <li>{@link chess.SpecialMoves#isCastleKingsideBlack <em>Castle Kingside Black</em>}</li>
 *   <li>{@link chess.SpecialMoves#getEnPassantSquare <em>En Passant Square</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getSpecialMoves()
 * @model
 * @generated
 */
public interface SpecialMoves extends EObject {
	/**
	 * Returns the value of the '<em><b>Castle Queenside White</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castle Queenside White</em>' attribute.
	 * @see #setCastleQueensideWhite(boolean)
	 * @see chess.ChessPackage#getSpecialMoves_CastleQueensideWhite()
	 * @model
	 * @generated
	 */
	boolean isCastleQueensideWhite();

	/**
	 * Sets the value of the '{@link chess.SpecialMoves#isCastleQueensideWhite <em>Castle Queenside White</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castle Queenside White</em>' attribute.
	 * @see #isCastleQueensideWhite()
	 * @generated
	 */
	void setCastleQueensideWhite(boolean value);

	/**
	 * Returns the value of the '<em><b>Castle Queenside Black</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castle Queenside Black</em>' attribute.
	 * @see #setCastleQueensideBlack(boolean)
	 * @see chess.ChessPackage#getSpecialMoves_CastleQueensideBlack()
	 * @model
	 * @generated
	 */
	boolean isCastleQueensideBlack();

	/**
	 * Sets the value of the '{@link chess.SpecialMoves#isCastleQueensideBlack <em>Castle Queenside Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castle Queenside Black</em>' attribute.
	 * @see #isCastleQueensideBlack()
	 * @generated
	 */
	void setCastleQueensideBlack(boolean value);

	/**
	 * Returns the value of the '<em><b>Castle Kingside White</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castle Kingside White</em>' attribute.
	 * @see #setCastleKingsideWhite(boolean)
	 * @see chess.ChessPackage#getSpecialMoves_CastleKingsideWhite()
	 * @model
	 * @generated
	 */
	boolean isCastleKingsideWhite();

	/**
	 * Sets the value of the '{@link chess.SpecialMoves#isCastleKingsideWhite <em>Castle Kingside White</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castle Kingside White</em>' attribute.
	 * @see #isCastleKingsideWhite()
	 * @generated
	 */
	void setCastleKingsideWhite(boolean value);

	/**
	 * Returns the value of the '<em><b>Castle Kingside Black</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castle Kingside Black</em>' attribute.
	 * @see #setCastleKingsideBlack(boolean)
	 * @see chess.ChessPackage#getSpecialMoves_CastleKingsideBlack()
	 * @model
	 * @generated
	 */
	boolean isCastleKingsideBlack();

	/**
	 * Sets the value of the '{@link chess.SpecialMoves#isCastleKingsideBlack <em>Castle Kingside Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castle Kingside Black</em>' attribute.
	 * @see #isCastleKingsideBlack()
	 * @generated
	 */
	void setCastleKingsideBlack(boolean value);

	/**
	 * Returns the value of the '<em><b>En Passant Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Passant Square</em>' reference.
	 * @see #setEnPassantSquare(Square)
	 * @see chess.ChessPackage#getSpecialMoves_EnPassantSquare()
	 * @model
	 * @generated
	 */
	Square getEnPassantSquare();

	/**
	 * Sets the value of the '{@link chess.SpecialMoves#getEnPassantSquare <em>En Passant Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>En Passant Square</em>' reference.
	 * @see #getEnPassantSquare()
	 * @generated
	 */
	void setEnPassantSquare(Square value);

} // SpecialMoves
