/**
 */
package chess.impl;

import chess.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChessFactoryImpl extends EFactoryImpl implements ChessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChessFactory init() {
		try {
			ChessFactory theChessFactory = (ChessFactory)EPackage.Registry.INSTANCE.getEFactory(ChessPackage.eNS_URI);
			if (theChessFactory != null) {
				return theChessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChessPackage.GAME: return createGame();
			case ChessPackage.PLAYER: return createPlayer();
			case ChessPackage.BOARD: return createBoard();
			case ChessPackage.SPECIAL_MOVES: return createSpecialMoves();
			case ChessPackage.MOVE_HISTORY: return createMoveHistory();
			case ChessPackage.MOVE: return createMove();
			case ChessPackage.SQUARE: return createSquare();
			case ChessPackage.KING: return createKing();
			case ChessPackage.QUEEN: return createQueen();
			case ChessPackage.ROOK: return createRook();
			case ChessPackage.BISHOP: return createBishop();
			case ChessPackage.KNIGHT: return createKnight();
			case ChessPackage.PAWN: return createPawn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ChessPackage.PLAYER_COLOR:
				return createPlayerColorFromString(eDataType, initialValue);
			case ChessPackage.SQUARE_COLOR:
				return createSquareColorFromString(eDataType, initialValue);
			case ChessPackage.MOVE_DIRECTION:
				return createMoveDirectionFromString(eDataType, initialValue);
			case ChessPackage.PROMOTION_TYPE:
				return createPromotionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ChessPackage.PLAYER_COLOR:
				return convertPlayerColorToString(eDataType, instanceValue);
			case ChessPackage.SQUARE_COLOR:
				return convertSquareColorToString(eDataType, instanceValue);
			case ChessPackage.MOVE_DIRECTION:
				return convertMoveDirectionToString(eDataType, instanceValue);
			case ChessPackage.PROMOTION_TYPE:
				return convertPromotionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialMoves createSpecialMoves() {
		SpecialMovesImpl specialMoves = new SpecialMovesImpl();
		return specialMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public King createKing() {
		KingImpl king = new KingImpl();
		return king;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queen createQueen() {
		QueenImpl queen = new QueenImpl();
		return queen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rook createRook() {
		RookImpl rook = new RookImpl();
		return rook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bishop createBishop() {
		BishopImpl bishop = new BishopImpl();
		return bishop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knight createKnight() {
		KnightImpl knight = new KnightImpl();
		return knight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pawn createPawn() {
		PawnImpl pawn = new PawnImpl();
		return pawn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveHistory createMoveHistory() {
		MoveHistoryImpl moveHistory = new MoveHistoryImpl();
		return moveHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerColor createPlayerColorFromString(EDataType eDataType, String initialValue) {
		PlayerColor result = PlayerColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayerColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareColor createSquareColorFromString(EDataType eDataType, String initialValue) {
		SquareColor result = SquareColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSquareColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveDirection createMoveDirectionFromString(EDataType eDataType, String initialValue) {
		MoveDirection result = MoveDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoveDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionType createPromotionTypeFromString(EDataType eDataType, String initialValue) {
		PromotionType result = PromotionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPromotionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChessPackage getChessPackage() {
		return (ChessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChessPackage getPackage() {
		return ChessPackage.eINSTANCE;
	}

} //ChessFactoryImpl
