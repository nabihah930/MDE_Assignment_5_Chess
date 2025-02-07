/**
 */
package chess.impl;

import chess.ChessPackage;
import chess.King;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>King</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.KingImpl#isInCheck <em>In Check</em>}</li>
 *   <li>{@link chess.impl.KingImpl#isHasMoved <em>Has Moved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KingImpl extends PieceImpl implements King {
	/**
	 * The default value of the '{@link #isInCheck() <em>In Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInCheck() <em>In Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean inCheck = IN_CHECK_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.KING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInCheck() {
		return inCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInCheck(boolean newInCheck) {
		boolean oldInCheck = inCheck;
		inCheck = newInCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.KING__IN_CHECK, oldInCheck, inCheck));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.KING__HAS_MOVED, oldHasMoved, hasMoved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessPackage.KING__IN_CHECK:
				return isInCheck();
			case ChessPackage.KING__HAS_MOVED:
				return isHasMoved();
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
			case ChessPackage.KING__IN_CHECK:
				setInCheck((Boolean)newValue);
				return;
			case ChessPackage.KING__HAS_MOVED:
				setHasMoved((Boolean)newValue);
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
			case ChessPackage.KING__IN_CHECK:
				setInCheck(IN_CHECK_EDEFAULT);
				return;
			case ChessPackage.KING__HAS_MOVED:
				setHasMoved(HAS_MOVED_EDEFAULT);
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
			case ChessPackage.KING__IN_CHECK:
				return inCheck != IN_CHECK_EDEFAULT;
			case ChessPackage.KING__HAS_MOVED:
				return hasMoved != HAS_MOVED_EDEFAULT;
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
		result.append(" (inCheck: ");
		result.append(inCheck);
		result.append(", hasMoved: ");
		result.append(hasMoved);
		result.append(')');
		return result.toString();
	}

} //KingImpl
