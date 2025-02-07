/**
 */
package chess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Game#getState <em>State</em>}</li>
 *   <li>{@link chess.Game#getTurn <em>Turn</em>}</li>
 *   <li>{@link chess.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link chess.Game#getBoard <em>Board</em>}</li>
 *   <li>{@link chess.Game#getMoveHistory <em>Move History</em>}</li>
 *   <li>{@link chess.Game#getSpecialMoves <em>Special Moves</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see chess.ChessPackage#getGame_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link chess.Game#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Turn</b></em>' attribute.
	 * The literals are from the enumeration {@link chess.PlayerColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn</em>' attribute.
	 * @see chess.PlayerColor
	 * @see #setTurn(PlayerColor)
	 * @see chess.ChessPackage#getGame_Turn()
	 * @model
	 * @generated
	 */
	PlayerColor getTurn();

	/**
	 * Sets the value of the '{@link chess.Game#getTurn <em>Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn</em>' attribute.
	 * @see chess.PlayerColor
	 * @see #getTurn()
	 * @generated
	 */
	void setTurn(PlayerColor value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link chess.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see chess.ChessPackage#getGame_Players()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see chess.ChessPackage#getGame_Board()
	 * @model containment="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link chess.Game#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Move History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move History</em>' containment reference.
	 * @see #setMoveHistory(MoveHistory)
	 * @see chess.ChessPackage#getGame_MoveHistory()
	 * @model containment="true"
	 * @generated
	 */
	MoveHistory getMoveHistory();

	/**
	 * Sets the value of the '{@link chess.Game#getMoveHistory <em>Move History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move History</em>' containment reference.
	 * @see #getMoveHistory()
	 * @generated
	 */
	void setMoveHistory(MoveHistory value);

	/**
	 * Returns the value of the '<em><b>Special Moves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Moves</em>' containment reference.
	 * @see #setSpecialMoves(SpecialMoves)
	 * @see chess.ChessPackage#getGame_SpecialMoves()
	 * @model containment="true"
	 * @generated
	 */
	SpecialMoves getSpecialMoves();

	/**
	 * Sets the value of the '{@link chess.Game#getSpecialMoves <em>Special Moves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Moves</em>' containment reference.
	 * @see #getSpecialMoves()
	 * @generated
	 */
	void setSpecialMoves(SpecialMoves value);

} // Game
