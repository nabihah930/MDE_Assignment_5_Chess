/**
 */
package chess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Knight#isCanJump <em>Can Jump</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getKnight()
 * @model
 * @generated
 */
public interface Knight extends Piece {

	/**
	 * Returns the value of the '<em><b>Can Jump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Jump</em>' attribute.
	 * @see #setCanJump(boolean)
	 * @see chess.ChessPackage#getKnight_CanJump()
	 * @model
	 * @generated
	 */
	boolean isCanJump();

	/**
	 * Sets the value of the '{@link chess.Knight#isCanJump <em>Can Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Jump</em>' attribute.
	 * @see #isCanJump()
	 * @generated
	 */
	void setCanJump(boolean value);
} // Knight
