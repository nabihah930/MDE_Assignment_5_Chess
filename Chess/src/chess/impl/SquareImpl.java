/**
 */
package chess.impl;

import chess.ChessPackage;
import chess.Piece;
import chess.Square;
import chess.SquareColor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.SquareImpl#getFile <em>File</em>}</li>
 *   <li>{@link chess.impl.SquareImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link chess.impl.SquareImpl#getColor <em>Color</em>}</li>
 *   <li>{@link chess.impl.SquareImpl#getPiece <em>Piece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final SquareColor COLOR_EDEFAULT = SquareColor.WHITE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected SquareColor color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPiece() <em>Piece</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiece()
	 * @generated
	 * @ordered
	 */
	protected Piece piece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SQUARE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SQUARE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(SquareColor newColor) {
		SquareColor oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SQUARE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Piece getPiece() {
		return piece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiece(Piece newPiece, NotificationChain msgs) {
		Piece oldPiece = piece;
		piece = newPiece;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessPackage.SQUARE__PIECE, oldPiece, newPiece);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiece(Piece newPiece) {
		if (newPiece != piece) {
			NotificationChain msgs = null;
			if (piece != null)
				msgs = ((InternalEObject)piece).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessPackage.SQUARE__PIECE, null, msgs);
			if (newPiece != null)
				msgs = ((InternalEObject)newPiece).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessPackage.SQUARE__PIECE, null, msgs);
			msgs = basicSetPiece(newPiece, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SQUARE__PIECE, newPiece, newPiece));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChessPackage.SQUARE__PIECE:
				return basicSetPiece(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessPackage.SQUARE__FILE:
				return getFile();
			case ChessPackage.SQUARE__RANK:
				return getRank();
			case ChessPackage.SQUARE__COLOR:
				return getColor();
			case ChessPackage.SQUARE__PIECE:
				return getPiece();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChessPackage.SQUARE__FILE:
				setFile((String)newValue);
				return;
			case ChessPackage.SQUARE__RANK:
				setRank((Integer)newValue);
				return;
			case ChessPackage.SQUARE__COLOR:
				setColor((SquareColor)newValue);
				return;
			case ChessPackage.SQUARE__PIECE:
				setPiece((Piece)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChessPackage.SQUARE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ChessPackage.SQUARE__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case ChessPackage.SQUARE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ChessPackage.SQUARE__PIECE:
				setPiece((Piece)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChessPackage.SQUARE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case ChessPackage.SQUARE__RANK:
				return rank != RANK_EDEFAULT;
			case ChessPackage.SQUARE__COLOR:
				return color != COLOR_EDEFAULT;
			case ChessPackage.SQUARE__PIECE:
				return piece != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (file: ");
		result.append(file);
		result.append(", rank: ");
		result.append(rank);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //SquareImpl
