/**
 */
package chess.impl;

import chess.ChessPackage;
import chess.Move;
import chess.Square;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.MoveImpl#getStartSquare <em>Start Square</em>}</li>
 *   <li>{@link chess.impl.MoveImpl#getEndSquare <em>End Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends MinimalEObjectImpl.Container implements Move {
	/**
	 * The cached value of the '{@link #getStartSquare() <em>Start Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSquare()
	 * @generated
	 * @ordered
	 */
	protected Square startSquare;

	/**
	 * The cached value of the '{@link #getEndSquare() <em>End Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSquare()
	 * @generated
	 * @ordered
	 */
	protected Square endSquare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getStartSquare() {
		if (startSquare != null && startSquare.eIsProxy()) {
			InternalEObject oldStartSquare = (InternalEObject)startSquare;
			startSquare = (Square)eResolveProxy(oldStartSquare);
			if (startSquare != oldStartSquare) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChessPackage.MOVE__START_SQUARE, oldStartSquare, startSquare));
			}
		}
		return startSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetStartSquare() {
		return startSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSquare(Square newStartSquare) {
		Square oldStartSquare = startSquare;
		startSquare = newStartSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.MOVE__START_SQUARE, oldStartSquare, startSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getEndSquare() {
		if (endSquare != null && endSquare.eIsProxy()) {
			InternalEObject oldEndSquare = (InternalEObject)endSquare;
			endSquare = (Square)eResolveProxy(oldEndSquare);
			if (endSquare != oldEndSquare) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChessPackage.MOVE__END_SQUARE, oldEndSquare, endSquare));
			}
		}
		return endSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetEndSquare() {
		return endSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSquare(Square newEndSquare) {
		Square oldEndSquare = endSquare;
		endSquare = newEndSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.MOVE__END_SQUARE, oldEndSquare, endSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessPackage.MOVE__START_SQUARE:
				if (resolve) return getStartSquare();
				return basicGetStartSquare();
			case ChessPackage.MOVE__END_SQUARE:
				if (resolve) return getEndSquare();
				return basicGetEndSquare();
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
			case ChessPackage.MOVE__START_SQUARE:
				setStartSquare((Square)newValue);
				return;
			case ChessPackage.MOVE__END_SQUARE:
				setEndSquare((Square)newValue);
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
			case ChessPackage.MOVE__START_SQUARE:
				setStartSquare((Square)null);
				return;
			case ChessPackage.MOVE__END_SQUARE:
				setEndSquare((Square)null);
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
			case ChessPackage.MOVE__START_SQUARE:
				return startSquare != null;
			case ChessPackage.MOVE__END_SQUARE:
				return endSquare != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveImpl
