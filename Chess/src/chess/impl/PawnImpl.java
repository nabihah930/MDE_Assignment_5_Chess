/**
 */
package chess.impl;

import chess.ChessPackage;
import chess.Pawn;
import chess.PromotionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pawn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.PawnImpl#isHasMoved <em>Has Moved</em>}</li>
 *   <li>{@link chess.impl.PawnImpl#getPromotionType <em>Promotion Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PawnImpl extends PieceImpl implements Pawn {
	/**
	 * The default value of the '{@link #isHasMoved() <em>Has Moved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMoved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MOVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMoved() <em>Has Moved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMoved()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMoved = HAS_MOVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromotionType() <em>Promotion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotionType()
	 * @generated
	 * @ordered
	 */
	protected static final PromotionType PROMOTION_TYPE_EDEFAULT = PromotionType.QUEEN;

	/**
	 * The cached value of the '{@link #getPromotionType() <em>Promotion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotionType()
	 * @generated
	 * @ordered
	 */
	protected PromotionType promotionType = PROMOTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PawnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.PAWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMoved() {
		return hasMoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMoved(boolean newHasMoved) {
		boolean oldHasMoved = hasMoved;
		hasMoved = newHasMoved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.PAWN__HAS_MOVED, oldHasMoved, hasMoved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionType getPromotionType() {
		return promotionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromotionType(PromotionType newPromotionType) {
		PromotionType oldPromotionType = promotionType;
		promotionType = newPromotionType == null ? PROMOTION_TYPE_EDEFAULT : newPromotionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.PAWN__PROMOTION_TYPE, oldPromotionType, promotionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessPackage.PAWN__HAS_MOVED:
				return isHasMoved();
			case ChessPackage.PAWN__PROMOTION_TYPE:
				return getPromotionType();
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
			case ChessPackage.PAWN__HAS_MOVED:
				setHasMoved((Boolean)newValue);
				return;
			case ChessPackage.PAWN__PROMOTION_TYPE:
				setPromotionType((PromotionType)newValue);
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
			case ChessPackage.PAWN__HAS_MOVED:
				setHasMoved(HAS_MOVED_EDEFAULT);
				return;
			case ChessPackage.PAWN__PROMOTION_TYPE:
				setPromotionType(PROMOTION_TYPE_EDEFAULT);
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
			case ChessPackage.PAWN__HAS_MOVED:
				return hasMoved != HAS_MOVED_EDEFAULT;
			case ChessPackage.PAWN__PROMOTION_TYPE:
				return promotionType != PROMOTION_TYPE_EDEFAULT;
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
		result.append(" (hasMoved: ");
		result.append(hasMoved);
		result.append(", promotionType: ");
		result.append(promotionType);
		result.append(')');
		return result.toString();
	}

} //PawnImpl
