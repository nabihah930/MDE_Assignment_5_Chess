/**
 */
package chess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>King</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.King#isInCheck <em>In Check</em>}</li>
 *   <li>{@link chess.King#isHasMoved <em>Has Moved</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getKing()
 * @model
 * @generated
 */
public interface King extends Piece {
	/**
	 * Returns the value of the '<em><b>In Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Check</em>' attribute.
	 * @see #setInCheck(boolean)
	 * @see chess.ChessPackage#getKing_InCheck()
	 * @model
	 * @generated
	 */
	boolean isInCheck();

	/**
	 * Sets the value of the '{@link chess.King#isInCheck <em>In Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Check</em>' attribute.
	 * @see #isInCheck()
	 * @generated
	 */
	void setInCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Moved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Moved</em>' attribute.
	 * @see #setHasMoved(boolean)
	 * @see chess.ChessPackage#getKing_HasMoved()
	 * @model
	 * @generated
	 */
	boolean isHasMoved();

	/**
	 * Sets the value of the '{@link chess.King#isHasMoved <em>Has Moved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Moved</em>' attribute.
	 * @see #isHasMoved()
	 * @generated
	 */
	void setHasMoved(boolean value);

} // King
