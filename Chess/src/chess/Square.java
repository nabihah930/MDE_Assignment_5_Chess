/**
 */
package chess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chess.Square#getFile <em>File</em>}</li>
 *   <li>{@link chess.Square#getRank <em>Rank</em>}</li>
 *   <li>{@link chess.Square#getColor <em>Color</em>}</li>
 *   <li>{@link chess.Square#getPiece <em>Piece</em>}</li>
 * </ul>
 *
 * @see chess.ChessPackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see chess.ChessPackage#getSquare_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link chess.Square#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see chess.ChessPackage#getSquare_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link chess.Square#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link chess.SquareColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see chess.SquareColor
	 * @see #setColor(SquareColor)
	 * @see chess.ChessPackage#getSquare_Color()
	 * @model
	 * @generated
	 */
	SquareColor getColor();

	/**
	 * Sets the value of the '{@link chess.Square#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see chess.SquareColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(SquareColor value);

	/**
	 * Returns the value of the '<em><b>Piece</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece</em>' containment reference.
	 * @see #setPiece(Piece)
	 * @see chess.ChessPackage#getSquare_Piece()
	 * @model containment="true"
	 * @generated
	 */
	Piece getPiece();

	/**
	 * Sets the value of the '{@link chess.Square#getPiece <em>Piece</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piece</em>' containment reference.
	 * @see #getPiece()
	 * @generated
	 */
	void setPiece(Piece value);

} // Square
