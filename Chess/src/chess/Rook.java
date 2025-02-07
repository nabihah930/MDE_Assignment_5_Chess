/**
 */
package chess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Rook#isHasMoved <em>Has Moved</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getRook()
 * @model
 * @generated
 */
public interface Rook extends Piece {
	/**
	 * Returns the value of the '<em><b>Has Moved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Moved</em>' attribute.
	 * @see #setHasMoved(boolean)
	 * @see chess.ChessPackage#getRook_HasMoved()
	 * @model
	 * @generated
	 */
	boolean isHasMoved();

	/**
	 * Sets the value of the '{@link chess.Rook#isHasMoved <em>Has Moved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Moved</em>' attribute.
	 * @see #isHasMoved()
	 * @generated
	 */
	void setHasMoved(boolean value);

} // Rook
