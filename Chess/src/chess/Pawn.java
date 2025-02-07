/**
 */
package chess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pawn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Pawn#isHasMoved <em>Has Moved</em>}</li>
 *   <li>{@link chess.Pawn#getPromotionType <em>Promotion Type</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getPawn()
 * @model
 * @generated
 */
public interface Pawn extends Piece {
	/**
	 * Returns the value of the '<em><b>Has Moved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Moved</em>' attribute.
	 * @see #setHasMoved(boolean)
	 * @see chess.ChessPackage#getPawn_HasMoved()
	 * @model
	 * @generated
	 */
	boolean isHasMoved();

	/**
	 * Sets the value of the '{@link chess.Pawn#isHasMoved <em>Has Moved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Moved</em>' attribute.
	 * @see #isHasMoved()
	 * @generated
	 */
	void setHasMoved(boolean value);

	/**
	 * Returns the value of the '<em><b>Promotion Type</b></em>' attribute.
	 * The literals are from the enumeration {@link chess.PromotionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion Type</em>' attribute.
	 * @see chess.PromotionType
	 * @see #setPromotionType(PromotionType)
	 * @see chess.ChessPackage#getPawn_PromotionType()
	 * @model
	 * @generated
	 */
	PromotionType getPromotionType();

	/**
	 * Sets the value of the '{@link chess.Pawn#getPromotionType <em>Promotion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion Type</em>' attribute.
	 * @see chess.PromotionType
	 * @see #getPromotionType()
	 * @generated
	 */
	void setPromotionType(PromotionType value);

} // Pawn
