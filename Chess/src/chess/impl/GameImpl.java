/**
 */
package chess.impl;

import chess.Board;
import chess.ChessPackage;
import chess.Game;
import chess.MoveHistory;
import chess.Player;
import chess.PlayerColor;
import chess.SpecialMoves;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chess.impl.GameImpl#getState <em>State</em>}</li>
 *   <li>{@link chess.impl.GameImpl#getTurn <em>Turn</em>}</li>
 *   <li>{@link chess.impl.GameImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link chess.impl.GameImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link chess.impl.GameImpl#getMoveHistory <em>Move History</em>}</li>
 *   <li>{@link chess.impl.GameImpl#getSpecialMoves <em>Special Moves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTurn() <em>Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurn()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerColor TURN_EDEFAULT = PlayerColor.WHITE;

	/**
	 * The cached value of the '{@link #getTurn() <em>Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurn()
	 * @generated
	 * @ordered
	 */
	protected PlayerColor turn = TURN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getMoveHistory() <em>Move History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveHistory()
	 * @generated
	 * @ordered
	 */
	protected MoveHistory moveHistory;

	/**
	 * The cached value of the '{@link #getSpecialMoves() <em>Special Moves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialMoves()
	 * @generated
	 * @ordered
	 */
	protected SpecialMoves specialMoves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerColor getTurn() {
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurn(PlayerColor newTurn) {
		PlayerColor oldTurn = turn;
		turn = newTurn == null ? TURN_EDEFAULT : newTurn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__TURN, oldTurn, turn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, ChessPackage.GAME__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__BOARD, oldBoard, newBoard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject)board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessPackage.GAME__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject)newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessPackage.GAME__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveHistory getMoveHistory() {
		return moveHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoveHistory(MoveHistory newMoveHistory, NotificationChain msgs) {
		MoveHistory oldMoveHistory = moveHistory;
		moveHistory = newMoveHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__MOVE_HISTORY, oldMoveHistory, newMoveHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveHistory(MoveHistory newMoveHistory) {
		if (newMoveHistory != moveHistory) {
			NotificationChain msgs = null;
			if (moveHistory != null)
				msgs = ((InternalEObject)moveHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessPackage.GAME__MOVE_HISTORY, null, msgs);
			if (newMoveHistory != null)
				msgs = ((InternalEObject)newMoveHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessPackage.GAME__MOVE_HISTORY, null, msgs);
			msgs = basicSetMoveHistory(newMoveHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__MOVE_HISTORY, newMoveHistory, newMoveHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialMoves getSpecialMoves() {
		return specialMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialMoves(SpecialMoves newSpecialMoves, NotificationChain msgs) {
		SpecialMoves oldSpecialMoves = specialMoves;
		specialMoves = newSpecialMoves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__SPECIAL_MOVES, oldSpecialMoves, newSpecialMoves);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialMoves(SpecialMoves newSpecialMoves) {
		if (newSpecialMoves != specialMoves) {
			NotificationChain msgs = null;
			if (specialMoves != null)
				msgs = ((InternalEObject)specialMoves).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessPackage.GAME__SPECIAL_MOVES, null, msgs);
			if (newSpecialMoves != null)
				msgs = ((InternalEObject)newSpecialMoves).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessPackage.GAME__SPECIAL_MOVES, null, msgs);
			msgs = basicSetSpecialMoves(newSpecialMoves, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessPackage.GAME__SPECIAL_MOVES, newSpecialMoves, newSpecialMoves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChessPackage.GAME__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case ChessPackage.GAME__BOARD:
				return basicSetBoard(null, msgs);
			case ChessPackage.GAME__MOVE_HISTORY:
				return basicSetMoveHistory(null, msgs);
			case ChessPackage.GAME__SPECIAL_MOVES:
				return basicSetSpecialMoves(null, msgs);
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
			case ChessPackage.GAME__STATE:
				return getState();
			case ChessPackage.GAME__TURN:
				return getTurn();
			case ChessPackage.GAME__PLAYERS:
				return getPlayers();
			case ChessPackage.GAME__BOARD:
				return getBoard();
			case ChessPackage.GAME__MOVE_HISTORY:
				return getMoveHistory();
			case ChessPackage.GAME__SPECIAL_MOVES:
				return getSpecialMoves();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChessPackage.GAME__STATE:
				setState((String)newValue);
				return;
			case ChessPackage.GAME__TURN:
				setTurn((PlayerColor)newValue);
				return;
			case ChessPackage.GAME__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case ChessPackage.GAME__BOARD:
				setBoard((Board)newValue);
				return;
			case ChessPackage.GAME__MOVE_HISTORY:
				setMoveHistory((MoveHistory)newValue);
				return;
			case ChessPackage.GAME__SPECIAL_MOVES:
				setSpecialMoves((SpecialMoves)newValue);
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
			case ChessPackage.GAME__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ChessPackage.GAME__TURN:
				setTurn(TURN_EDEFAULT);
				return;
			case ChessPackage.GAME__PLAYERS:
				getPlayers().clear();
				return;
			case ChessPackage.GAME__BOARD:
				setBoard((Board)null);
				return;
			case ChessPackage.GAME__MOVE_HISTORY:
				setMoveHistory((MoveHistory)null);
				return;
			case ChessPackage.GAME__SPECIAL_MOVES:
				setSpecialMoves((SpecialMoves)null);
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
			case ChessPackage.GAME__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case ChessPackage.GAME__TURN:
				return turn != TURN_EDEFAULT;
			case ChessPackage.GAME__PLAYERS:
				return players != null && !players.isEmpty();
			case ChessPackage.GAME__BOARD:
				return board != null;
			case ChessPackage.GAME__MOVE_HISTORY:
				return moveHistory != null;
			case ChessPackage.GAME__SPECIAL_MOVES:
				return specialMoves != null;
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
		result.append(" (state: ");
		result.append(state);
		result.append(", turn: ");
		result.append(turn);
		result.append(')');
		return result.toString();
	}

} //GameImpl
