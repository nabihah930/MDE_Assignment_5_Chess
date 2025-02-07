/**
 */
package chess.impl;

import chess.ChessPackage;
import chess.SpecialMoves;
import chess.Square;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Moves</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.SpecialMovesImpl#isCastleQueensideWhite <em>Castle Queenside White</em>}</li>
 *   <li>{@link chess.impl.SpecialMovesImpl#isCastleQueensideBlack <em>Castle Queenside Black</em>}</li>
 *   <li>{@link chess.impl.SpecialMovesImpl#isCastleKingsideWhite <em>Castle Kingside White</em>}</li>
 *   <li>{@link chess.impl.SpecialMovesImpl#isCastleKingsideBlack <em>Castle Kingside Black</em>}</li>
 *   <li>{@link chess.impl.SpecialMovesImpl#getEnPassantSquare <em>En Passant Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialMovesImpl extends MinimalEObjectImpl.Container implements SpecialMoves {
	/**
	 * The default value of the '{@link #isCastleQueensideWhite() <em>Castle Queenside White</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleQueensideWhite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASTLE_QUEENSIDE_WHITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCastleQueensideWhite() <em>Castle Queenside White</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleQueensideWhite()
	 * @generated
	 * @ordered
	 */
	protected boolean castleQueensideWhite = CASTLE_QUEENSIDE_WHITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCastleQueensideBlack() <em>Castle Queenside Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleQueensideBlack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASTLE_QUEENSIDE_BLACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCastleQueensideBlack() <em>Castle Queenside Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleQueensideBlack()
	 * @generated
	 * @ordered
	 */
	protected boolean castleQueensideBlack = CASTLE_QUEENSIDE_BLACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isCastleKingsideWhite() <em>Castle Kingside White</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleKingsideWhite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASTLE_KINGSIDE_WHITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCastleKingsideWhite() <em>Castle Kingside White</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleKingsideWhite()
	 * @generated
	 * @ordered
	 */
	protected boolean castleKingsideWhite = CASTLE_KINGSIDE_WHITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCastleKingsideBlack() <em>Castle Kingside Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleKingsideBlack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASTLE_KINGSIDE_BLACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCastleKingsideBlack() <em>Castle Kingside Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastleKingsideBlack()
	 * @generated
	 * @ordered
	 */
	protected boolean castleKingsideBlack = CASTLE_KINGSIDE_BLACK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnPassantSquare() <em>En Passant Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnPassantSquare()
	 * @generated
	 * @ordered
	 */
	protected Square enPassantSquare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialMovesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.SPECIAL_MOVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCastleQueensideWhite() {
		return castleQueensideWhite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastleQueensideWhite(boolean newCastleQueensideWhite) {
		boolean oldCastleQueensideWhite = castleQueensideWhite;
		castleQueensideWhite = newCastleQueensideWhite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE, oldCastleQueensideWhite, castleQueensideWhite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCastleQueensideBlack() {
		return castleQueensideBlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastleQueensideBlack(boolean newCastleQueensideBlack) {
		boolean oldCastleQueensideBlack = castleQueensideBlack;
		castleQueensideBlack = newCastleQueensideBlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK, oldCastleQueensideBlack, castleQueensideBlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCastleKingsideWhite() {
		return castleKingsideWhite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastleKingsideWhite(boolean newCastleKingsideWhite) {
		boolean oldCastleKingsideWhite = castleKingsideWhite;
		castleKingsideWhite = newCastleKingsideWhite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE, oldCastleKingsideWhite, castleKingsideWhite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCastleKingsideBlack() {
		return castleKingsideBlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastleKingsideBlack(boolean newCastleKingsideBlack) {
		boolean oldCastleKingsideBlack = castleKingsideBlack;
		castleKingsideBlack = newCastleKingsideBlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK, oldCastleKingsideBlack, castleKingsideBlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getEnPassantSquare() {
		if (enPassantSquare != null && enPassantSquare.eIsProxy()) {
			InternalEObject oldEnPassantSquare = (InternalEObject)enPassantSquare;
			enPassantSquare = (Square)eResolveProxy(oldEnPassantSquare);
			if (enPassantSquare != oldEnPassantSquare) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChessPackage.SPECIAL_MOVES__EN_PASSANT_SQUARE, oldEnPassantSquare, enPassantSquare));
			}
		}
		return enPassantSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetEnPassantSquare() {
		return enPassantSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnPassantSquare(Square newEnPassantSquare) {
		Square oldEnPassantSquare = enPassantSquare;
		enPassantSquare = newEnPassantSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.SPECIAL_MOVES__EN_PASSANT_SQUARE, oldEnPassantSquare, enPassantSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE:
				return isCastleQueensideWhite();
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK:
				return isCastleQueensideBlack();
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE:
				return isCastleKingsideWhite();
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK:
				return isCastleKingsideBlack();
			case ChessPackage.SPECIAL_MOVES__EN_PASSANT_SQUARE:
				if (resolve) return getEnPassantSquare();
				return basicGetEnPassantSquare();
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
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE:
				setCastleQueensideWhite((Boolean)newValue);
				return;
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK:
				setCastleQueensideBlack((Boolean)newValue);
				return;
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE:
				setCastleKingsideWhite((Boolean)newValue);
				return;
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK:
				setCastleKingsideBlack((Boolean)newValue);
				return;
			case ChessPackage.SPECIAL_MOVES__EN_PASSANT_SQUARE:
				setEnPassantSquare((Square)newValue);
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
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE:
				setCastleQueensideWhite(CASTLE_QUEENSIDE_WHITE_EDEFAULT);
				return;
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK:
				setCastleQueensideBlack(CASTLE_QUEENSIDE_BLACK_EDEFAULT);
				return;
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE:
				setCastleKingsideWhite(CASTLE_KINGSIDE_WHITE_EDEFAULT);
				return;
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK:
				setCastleKingsideBlack(CASTLE_KINGSIDE_BLACK_EDEFAULT);
				return;
			case ChessPackage.SPECIAL_MOVES__EN_PASSANT_SQUARE:
				setEnPassantSquare((Square)null);
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
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE:
				return castleQueensideWhite != CASTLE_QUEENSIDE_WHITE_EDEFAULT;
			case ChessPackage.SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK:
				return castleQueensideBlack != CASTLE_QUEENSIDE_BLACK_EDEFAULT;
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE:
				return castleKingsideWhite != CASTLE_KINGSIDE_WHITE_EDEFAULT;
			case ChessPackage.SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK:
				return castleKingsideBlack != CASTLE_KINGSIDE_BLACK_EDEFAULT;
			case ChessPackage.SPECIAL_MOVES__EN_PASSANT_SQUARE:
				return enPassantSquare != null;
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
		result.append(" (castleQueensideWhite: ");
		result.append(castleQueensideWhite);
		result.append(", castleQueensideBlack: ");
		result.append(castleQueensideBlack);
		result.append(", castleKingsideWhite: ");
		result.append(castleKingsideWhite);
		result.append(", castleKingsideBlack: ");
		result.append(castleKingsideBlack);
		result.append(')');
		return result.toString();
	}

} //SpecialMovesImpl
