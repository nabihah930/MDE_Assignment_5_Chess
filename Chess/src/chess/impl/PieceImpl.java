/**
 */
package chess.impl;

import chess.ChessPackage;
import chess.MoveDirection;
import chess.Piece;
import chess.PlayerColor;
import chess.Square;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.PieceImpl#getColor <em>Color</em>}</li>
 *   <li>{@link chess.impl.PieceImpl#getDirectionOfMovement <em>Direction Of Movement</em>}</li>
 *   <li>{@link chess.impl.PieceImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link chess.impl.PieceImpl#getCurrentPosition <em>Current Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PieceImpl extends MinimalEObjectImpl.Container implements Piece {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerColor COLOR_EDEFAULT = PlayerColor.WHITE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected PlayerColor color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionOfMovement() <em>Direction Of Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionOfMovement()
	 * @generated
	 * @ordered
	 */
	protected static final MoveDirection DIRECTION_OF_MOVEMENT_EDEFAULT = MoveDirection.FORWARD;

	/**
	 * The cached value of the '{@link #getDirectionOfMovement() <em>Direction Of Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionOfMovement()
	 * @generated
	 * @ordered
	 */
	protected MoveDirection directionOfMovement = DIRECTION_OF_MOVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentPosition() <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPosition()
	 * @generated
	 * @ordered
	 */
	protected Square currentPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(PlayerColor newColor) {
		PlayerColor oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.PIECE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveDirection getDirectionOfMovement() {
		return directionOfMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionOfMovement(MoveDirection newDirectionOfMovement) {
		MoveDirection oldDirectionOfMovement = directionOfMovement;
		directionOfMovement = newDirectionOfMovement == null ? DIRECTION_OF_MOVEMENT_EDEFAULT : newDirectionOfMovement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.PIECE__DIRECTION_OF_MOVEMENT, oldDirectionOfMovement, directionOfMovement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.PIECE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getCurrentPosition() {
		if (currentPosition != null && currentPosition.eIsProxy()) {
			InternalEObject oldCurrentPosition = (InternalEObject)currentPosition;
			currentPosition = (Square)eResolveProxy(oldCurrentPosition);
			if (currentPosition != oldCurrentPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChessPackage.PIECE__CURRENT_POSITION, oldCurrentPosition, currentPosition));
			}
		}
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetCurrentPosition() {
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(Square newCurrentPosition) {
		Square oldCurrentPosition = currentPosition;
		currentPosition = newCurrentPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.PIECE__CURRENT_POSITION, oldCurrentPosition, currentPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChessPackage.PIECE__COLOR:
				return getColor();
			case ChessPackage.PIECE__DIRECTION_OF_MOVEMENT:
				return getDirectionOfMovement();
			case ChessPackage.PIECE__DISTANCE:
				return getDistance();
			case ChessPackage.PIECE__CURRENT_POSITION:
				if (resolve) return getCurrentPosition();
				return basicGetCurrentPosition();
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
			case ChessPackage.PIECE__COLOR:
				setColor((PlayerColor)newValue);
				return;
			case ChessPackage.PIECE__DIRECTION_OF_MOVEMENT:
				setDirectionOfMovement((MoveDirection)newValue);
				return;
			case ChessPackage.PIECE__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case ChessPackage.PIECE__CURRENT_POSITION:
				setCurrentPosition((Square)newValue);
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
			case ChessPackage.PIECE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ChessPackage.PIECE__DIRECTION_OF_MOVEMENT:
				setDirectionOfMovement(DIRECTION_OF_MOVEMENT_EDEFAULT);
				return;
			case ChessPackage.PIECE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case ChessPackage.PIECE__CURRENT_POSITION:
				setCurrentPosition((Square)null);
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
			case ChessPackage.PIECE__COLOR:
				return color != COLOR_EDEFAULT;
			case ChessPackage.PIECE__DIRECTION_OF_MOVEMENT:
				return directionOfMovement != DIRECTION_OF_MOVEMENT_EDEFAULT;
			case ChessPackage.PIECE__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case ChessPackage.PIECE__CURRENT_POSITION:
				return currentPosition != null;
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
		result.append(" (color: ");
		result.append(color);
		result.append(", directionOfMovement: ");
		result.append(directionOfMovement);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //PieceImpl
