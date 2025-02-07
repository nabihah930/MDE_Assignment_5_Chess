/**
 */
package chess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.MoveHistory#getMoves <em>Moves</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getMoveHistory()
 * @model
 * @generated
 */
public interface MoveHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Moves</b></em>' containment reference list.
	 * The list contents are of type {@link chess.Move}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moves</em>' containment reference list.
	 * @see chess.ChessPackage#getMoveHistory_Moves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMoves();

} // MoveHistory
