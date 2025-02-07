/**
 */
package chess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chess.ChessFactory
 * @model kind="package"
 * @generated
 */
public interface ChessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/chess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChessPackage eINSTANCE = chess.impl.ChessPackageImpl.init();

	/**
	 * The meta object id for the '{@link chess.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.GameImpl
	 * @see chess.impl.ChessPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__STATE = 0;

	/**
	 * The feature id for the '<em><b>Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TURN = 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 2;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__BOARD = 3;

	/**
	 * The feature id for the '<em><b>Move History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__MOVE_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Special Moves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SPECIAL_MOVES = 5;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chess.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.PlayerImpl
	 * @see chess.impl.ChessPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chess.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.BoardImpl
	 * @see chess.impl.ChessPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 2;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROWS = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Squares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SQUARES = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chess.impl.SpecialMovesImpl <em>Special Moves</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.SpecialMovesImpl
	 * @see chess.impl.ChessPackageImpl#getSpecialMoves()
	 * @generated
	 */
	int SPECIAL_MOVES = 3;

	/**
	 * The feature id for the '<em><b>Castle Queenside White</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE = 0;

	/**
	 * The feature id for the '<em><b>Castle Queenside Black</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK = 1;

	/**
	 * The feature id for the '<em><b>Castle Kingside White</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE = 2;

	/**
	 * The feature id for the '<em><b>Castle Kingside Black</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK = 3;

	/**
	 * The feature id for the '<em><b>En Passant Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES__EN_PASSANT_SQUARE = 4;

	/**
	 * The number of structural features of the '<em>Special Moves</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Special Moves</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MOVES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chess.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.SquareImpl
	 * @see chess.impl.ChessPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 6;

	/**
	 * The meta object id for the '{@link chess.impl.PieceImpl <em>Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.PieceImpl
	 * @see chess.impl.ChessPackageImpl#getPiece()
	 * @generated
	 */
	int PIECE = 7;

	/**
	 * The meta object id for the '{@link chess.impl.KingImpl <em>King</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.KingImpl
	 * @see chess.impl.ChessPackageImpl#getKing()
	 * @generated
	 */
	int KING = 8;

	/**
	 * The meta object id for the '{@link chess.impl.QueenImpl <em>Queen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.QueenImpl
	 * @see chess.impl.ChessPackageImpl#getQueen()
	 * @generated
	 */
	int QUEEN = 9;

	/**
	 * The meta object id for the '{@link chess.impl.RookImpl <em>Rook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.RookImpl
	 * @see chess.impl.ChessPackageImpl#getRook()
	 * @generated
	 */
	int ROOK = 10;

	/**
	 * The meta object id for the '{@link chess.impl.BishopImpl <em>Bishop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.BishopImpl
	 * @see chess.impl.ChessPackageImpl#getBishop()
	 * @generated
	 */
	int BISHOP = 11;

	/**
	 * The meta object id for the '{@link chess.impl.KnightImpl <em>Knight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.KnightImpl
	 * @see chess.impl.ChessPackageImpl#getKnight()
	 * @generated
	 */
	int KNIGHT = 12;

	/**
	 * The meta object id for the '{@link chess.impl.PawnImpl <em>Pawn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.PawnImpl
	 * @see chess.impl.ChessPackageImpl#getPawn()
	 * @generated
	 */
	int PAWN = 13;

	/**
	 * The meta object id for the '{@link chess.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.MoveImpl
	 * @see chess.impl.ChessPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 5;

	/**
	 * The meta object id for the '{@link chess.impl.MoveHistoryImpl <em>Move History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.impl.MoveHistoryImpl
	 * @see chess.impl.ChessPackageImpl#getMoveHistory()
	 * @generated
	 */
	int MOVE_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_HISTORY__MOVES = 0;

	/**
	 * The number of structural features of the '<em>Move History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Move History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Start Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__START_SQUARE = 0;

	/**
	 * The feature id for the '<em><b>End Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__END_SQUARE = 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FILE = 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__RANK = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__PIECE = 3;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__DIRECTION_OF_MOVEMENT = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__CURRENT_POSITION = 3;

	/**
	 * The number of structural features of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__COLOR = PIECE__COLOR;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__DIRECTION_OF_MOVEMENT = PIECE__DIRECTION_OF_MOVEMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__DISTANCE = PIECE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__CURRENT_POSITION = PIECE__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>In Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__IN_CHECK = PIECE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Moved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__HAS_MOVED = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>King</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING_FEATURE_COUNT = PIECE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>King</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__COLOR = PIECE__COLOR;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__DIRECTION_OF_MOVEMENT = PIECE__DIRECTION_OF_MOVEMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__DISTANCE = PIECE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN__CURRENT_POSITION = PIECE__CURRENT_POSITION;

	/**
	 * The number of structural features of the '<em>Queen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Queen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEEN_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__COLOR = PIECE__COLOR;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__DIRECTION_OF_MOVEMENT = PIECE__DIRECTION_OF_MOVEMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__DISTANCE = PIECE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__CURRENT_POSITION = PIECE__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Has Moved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK__HAS_MOVED = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK_FEATURE_COUNT = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOK_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__COLOR = PIECE__COLOR;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__DIRECTION_OF_MOVEMENT = PIECE__DIRECTION_OF_MOVEMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__DISTANCE = PIECE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP__CURRENT_POSITION = PIECE__CURRENT_POSITION;

	/**
	 * The number of structural features of the '<em>Bishop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bishop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISHOP_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__COLOR = PIECE__COLOR;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__DIRECTION_OF_MOVEMENT = PIECE__DIRECTION_OF_MOVEMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__DISTANCE = PIECE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__CURRENT_POSITION = PIECE__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Can Jump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT__CAN_JUMP = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT_FEATURE_COUNT = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Knight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIGHT_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__COLOR = PIECE__COLOR;

	/**
	 * The feature id for the '<em><b>Direction Of Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__DIRECTION_OF_MOVEMENT = PIECE__DIRECTION_OF_MOVEMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__DISTANCE = PIECE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__CURRENT_POSITION = PIECE__CURRENT_POSITION;

	/**
	 * The feature id for the '<em><b>Has Moved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__HAS_MOVED = PIECE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Promotion Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN__PROMOTION_TYPE = PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN_FEATURE_COUNT = PIECE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAWN_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chess.PlayerColor <em>Player Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.PlayerColor
	 * @see chess.impl.ChessPackageImpl#getPlayerColor()
	 * @generated
	 */
	int PLAYER_COLOR = 14;

	/**
	 * The meta object id for the '{@link chess.SquareColor <em>Square Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.SquareColor
	 * @see chess.impl.ChessPackageImpl#getSquareColor()
	 * @generated
	 */
	int SQUARE_COLOR = 15;

	/**
	 * The meta object id for the '{@link chess.MoveDirection <em>Move Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.MoveDirection
	 * @see chess.impl.ChessPackageImpl#getMoveDirection()
	 * @generated
	 */
	int MOVE_DIRECTION = 16;

	/**
	 * The meta object id for the '{@link chess.PromotionType <em>Promotion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chess.PromotionType
	 * @see chess.impl.ChessPackageImpl#getPromotionType()
	 * @generated
	 */
	int PROMOTION_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link chess.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see chess.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link chess.Game#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see chess.Game#getState()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_State();

	/**
	 * Returns the meta object for the attribute '{@link chess.Game#getTurn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turn</em>'.
	 * @see chess.Game#getTurn()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Turn();

	/**
	 * Returns the meta object for the containment reference list '{@link chess.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see chess.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the containment reference '{@link chess.Game#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see chess.Game#getBoard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Board();

	/**
	 * Returns the meta object for the containment reference '{@link chess.Game#getMoveHistory <em>Move History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Move History</em>'.
	 * @see chess.Game#getMoveHistory()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_MoveHistory();

	/**
	 * Returns the meta object for the containment reference '{@link chess.Game#getSpecialMoves <em>Special Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Moves</em>'.
	 * @see chess.Game#getSpecialMoves()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_SpecialMoves();

	/**
	 * Returns the meta object for class '{@link chess.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see chess.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link chess.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chess.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link chess.Player#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see chess.Player#getColor()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Color();

	/**
	 * Returns the meta object for class '{@link chess.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see chess.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link chess.Board#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see chess.Board#getRows()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Rows();

	/**
	 * Returns the meta object for the attribute '{@link chess.Board#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see chess.Board#getColumns()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link chess.Board#getSquares <em>Squares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Squares</em>'.
	 * @see chess.Board#getSquares()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Squares();

	/**
	 * Returns the meta object for class '{@link chess.SpecialMoves <em>Special Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Moves</em>'.
	 * @see chess.SpecialMoves
	 * @generated
	 */
	EClass getSpecialMoves();

	/**
	 * Returns the meta object for the attribute '{@link chess.SpecialMoves#isCastleQueensideWhite <em>Castle Queenside White</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castle Queenside White</em>'.
	 * @see chess.SpecialMoves#isCastleQueensideWhite()
	 * @see #getSpecialMoves()
	 * @generated
	 */
	EAttribute getSpecialMoves_CastleQueensideWhite();

	/**
	 * Returns the meta object for the attribute '{@link chess.SpecialMoves#isCastleQueensideBlack <em>Castle Queenside Black</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castle Queenside Black</em>'.
	 * @see chess.SpecialMoves#isCastleQueensideBlack()
	 * @see #getSpecialMoves()
	 * @generated
	 */
	EAttribute getSpecialMoves_CastleQueensideBlack();

	/**
	 * Returns the meta object for the attribute '{@link chess.SpecialMoves#isCastleKingsideWhite <em>Castle Kingside White</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castle Kingside White</em>'.
	 * @see chess.SpecialMoves#isCastleKingsideWhite()
	 * @see #getSpecialMoves()
	 * @generated
	 */
	EAttribute getSpecialMoves_CastleKingsideWhite();

	/**
	 * Returns the meta object for the attribute '{@link chess.SpecialMoves#isCastleKingsideBlack <em>Castle Kingside Black</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castle Kingside Black</em>'.
	 * @see chess.SpecialMoves#isCastleKingsideBlack()
	 * @see #getSpecialMoves()
	 * @generated
	 */
	EAttribute getSpecialMoves_CastleKingsideBlack();

	/**
	 * Returns the meta object for the reference '{@link chess.SpecialMoves#getEnPassantSquare <em>En Passant Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>En Passant Square</em>'.
	 * @see chess.SpecialMoves#getEnPassantSquare()
	 * @see #getSpecialMoves()
	 * @generated
	 */
	EReference getSpecialMoves_EnPassantSquare();

	/**
	 * Returns the meta object for class '{@link chess.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see chess.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the attribute '{@link chess.Square#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see chess.Square#getFile()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_File();

	/**
	 * Returns the meta object for the attribute '{@link chess.Square#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see chess.Square#getRank()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Rank();

	/**
	 * Returns the meta object for the attribute '{@link chess.Square#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see chess.Square#getColor()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Color();

	/**
	 * Returns the meta object for the containment reference '{@link chess.Square#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Piece</em>'.
	 * @see chess.Square#getPiece()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Piece();

	/**
	 * Returns the meta object for class '{@link chess.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece</em>'.
	 * @see chess.Piece
	 * @generated
	 */
	EClass getPiece();

	/**
	 * Returns the meta object for the attribute '{@link chess.Piece#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see chess.Piece#getColor()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Color();

	/**
	 * Returns the meta object for the attribute '{@link chess.Piece#getDirectionOfMovement <em>Direction Of Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Of Movement</em>'.
	 * @see chess.Piece#getDirectionOfMovement()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_DirectionOfMovement();

	/**
	 * Returns the meta object for the attribute '{@link chess.Piece#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see chess.Piece#getDistance()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Distance();

	/**
	 * Returns the meta object for the reference '{@link chess.Piece#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Position</em>'.
	 * @see chess.Piece#getCurrentPosition()
	 * @see #getPiece()
	 * @generated
	 */
	EReference getPiece_CurrentPosition();

	/**
	 * Returns the meta object for class '{@link chess.King <em>King</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>King</em>'.
	 * @see chess.King
	 * @generated
	 */
	EClass getKing();

	/**
	 * Returns the meta object for the attribute '{@link chess.King#isInCheck <em>In Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Check</em>'.
	 * @see chess.King#isInCheck()
	 * @see #getKing()
	 * @generated
	 */
	EAttribute getKing_InCheck();

	/**
	 * Returns the meta object for the attribute '{@link chess.King#isHasMoved <em>Has Moved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Moved</em>'.
	 * @see chess.King#isHasMoved()
	 * @see #getKing()
	 * @generated
	 */
	EAttribute getKing_HasMoved();

	/**
	 * Returns the meta object for class '{@link chess.Queen <em>Queen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queen</em>'.
	 * @see chess.Queen
	 * @generated
	 */
	EClass getQueen();

	/**
	 * Returns the meta object for class '{@link chess.Rook <em>Rook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rook</em>'.
	 * @see chess.Rook
	 * @generated
	 */
	EClass getRook();

	/**
	 * Returns the meta object for the attribute '{@link chess.Rook#isHasMoved <em>Has Moved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Moved</em>'.
	 * @see chess.Rook#isHasMoved()
	 * @see #getRook()
	 * @generated
	 */
	EAttribute getRook_HasMoved();

	/**
	 * Returns the meta object for class '{@link chess.Bishop <em>Bishop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bishop</em>'.
	 * @see chess.Bishop
	 * @generated
	 */
	EClass getBishop();

	/**
	 * Returns the meta object for class '{@link chess.Knight <em>Knight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knight</em>'.
	 * @see chess.Knight
	 * @generated
	 */
	EClass getKnight();

	/**
	 * Returns the meta object for the attribute '{@link chess.Knight#isCanJump <em>Can Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Jump</em>'.
	 * @see chess.Knight#isCanJump()
	 * @see #getKnight()
	 * @generated
	 */
	EAttribute getKnight_CanJump();

	/**
	 * Returns the meta object for class '{@link chess.Pawn <em>Pawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pawn</em>'.
	 * @see chess.Pawn
	 * @generated
	 */
	EClass getPawn();

	/**
	 * Returns the meta object for the attribute '{@link chess.Pawn#isHasMoved <em>Has Moved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Moved</em>'.
	 * @see chess.Pawn#isHasMoved()
	 * @see #getPawn()
	 * @generated
	 */
	EAttribute getPawn_HasMoved();

	/**
	 * Returns the meta object for the attribute '{@link chess.Pawn#getPromotionType <em>Promotion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promotion Type</em>'.
	 * @see chess.Pawn#getPromotionType()
	 * @see #getPawn()
	 * @generated
	 */
	EAttribute getPawn_PromotionType();

	/**
	 * Returns the meta object for class '{@link chess.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see chess.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the reference '{@link chess.Move#getStartSquare <em>Start Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Square</em>'.
	 * @see chess.Move#getStartSquare()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_StartSquare();

	/**
	 * Returns the meta object for the reference '{@link chess.Move#getEndSquare <em>End Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Square</em>'.
	 * @see chess.Move#getEndSquare()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_EndSquare();

	/**
	 * Returns the meta object for class '{@link chess.MoveHistory <em>Move History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move History</em>'.
	 * @see chess.MoveHistory
	 * @generated
	 */
	EClass getMoveHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link chess.MoveHistory#getMoves <em>Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moves</em>'.
	 * @see chess.MoveHistory#getMoves()
	 * @see #getMoveHistory()
	 * @generated
	 */
	EReference getMoveHistory_Moves();

	/**
	 * Returns the meta object for enum '{@link chess.PlayerColor <em>Player Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Color</em>'.
	 * @see chess.PlayerColor
	 * @generated
	 */
	EEnum getPlayerColor();

	/**
	 * Returns the meta object for enum '{@link chess.SquareColor <em>Square Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Square Color</em>'.
	 * @see chess.SquareColor
	 * @generated
	 */
	EEnum getSquareColor();

	/**
	 * Returns the meta object for enum '{@link chess.MoveDirection <em>Move Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Move Direction</em>'.
	 * @see chess.MoveDirection
	 * @generated
	 */
	EEnum getMoveDirection();

	/**
	 * Returns the meta object for enum '{@link chess.PromotionType <em>Promotion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Promotion Type</em>'.
	 * @see chess.PromotionType
	 * @generated
	 */
	EEnum getPromotionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChessFactory getChessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chess.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.GameImpl
		 * @see chess.impl.ChessPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__STATE = eINSTANCE.getGame_State();

		/**
		 * The meta object literal for the '<em><b>Turn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__TURN = eINSTANCE.getGame_Turn();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__BOARD = eINSTANCE.getGame_Board();

		/**
		 * The meta object literal for the '<em><b>Move History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__MOVE_HISTORY = eINSTANCE.getGame_MoveHistory();

		/**
		 * The meta object literal for the '<em><b>Special Moves</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SPECIAL_MOVES = eINSTANCE.getGame_SpecialMoves();

		/**
		 * The meta object literal for the '{@link chess.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.PlayerImpl
		 * @see chess.impl.ChessPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__COLOR = eINSTANCE.getPlayer_Color();

		/**
		 * The meta object literal for the '{@link chess.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.BoardImpl
		 * @see chess.impl.ChessPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ROWS = eINSTANCE.getBoard_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__COLUMNS = eINSTANCE.getBoard_Columns();

		/**
		 * The meta object literal for the '<em><b>Squares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SQUARES = eINSTANCE.getBoard_Squares();

		/**
		 * The meta object literal for the '{@link chess.impl.SpecialMovesImpl <em>Special Moves</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.SpecialMovesImpl
		 * @see chess.impl.ChessPackageImpl#getSpecialMoves()
		 * @generated
		 */
		EClass SPECIAL_MOVES = eINSTANCE.getSpecialMoves();

		/**
		 * The meta object literal for the '<em><b>Castle Queenside White</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_MOVES__CASTLE_QUEENSIDE_WHITE = eINSTANCE.getSpecialMoves_CastleQueensideWhite();

		/**
		 * The meta object literal for the '<em><b>Castle Queenside Black</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_MOVES__CASTLE_QUEENSIDE_BLACK = eINSTANCE.getSpecialMoves_CastleQueensideBlack();

		/**
		 * The meta object literal for the '<em><b>Castle Kingside White</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_MOVES__CASTLE_KINGSIDE_WHITE = eINSTANCE.getSpecialMoves_CastleKingsideWhite();

		/**
		 * The meta object literal for the '<em><b>Castle Kingside Black</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_MOVES__CASTLE_KINGSIDE_BLACK = eINSTANCE.getSpecialMoves_CastleKingsideBlack();

		/**
		 * The meta object literal for the '<em><b>En Passant Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_MOVES__EN_PASSANT_SQUARE = eINSTANCE.getSpecialMoves_EnPassantSquare();

		/**
		 * The meta object literal for the '{@link chess.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.SquareImpl
		 * @see chess.impl.ChessPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__FILE = eINSTANCE.getSquare_File();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__RANK = eINSTANCE.getSquare_Rank();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__COLOR = eINSTANCE.getSquare_Color();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__PIECE = eINSTANCE.getSquare_Piece();

		/**
		 * The meta object literal for the '{@link chess.impl.PieceImpl <em>Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.PieceImpl
		 * @see chess.impl.ChessPackageImpl#getPiece()
		 * @generated
		 */
		EClass PIECE = eINSTANCE.getPiece();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__COLOR = eINSTANCE.getPiece_Color();

		/**
		 * The meta object literal for the '<em><b>Direction Of Movement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__DIRECTION_OF_MOVEMENT = eINSTANCE.getPiece_DirectionOfMovement();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__DISTANCE = eINSTANCE.getPiece_Distance();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE__CURRENT_POSITION = eINSTANCE.getPiece_CurrentPosition();

		/**
		 * The meta object literal for the '{@link chess.impl.KingImpl <em>King</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.KingImpl
		 * @see chess.impl.ChessPackageImpl#getKing()
		 * @generated
		 */
		EClass KING = eINSTANCE.getKing();

		/**
		 * The meta object literal for the '<em><b>In Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KING__IN_CHECK = eINSTANCE.getKing_InCheck();

		/**
		 * The meta object literal for the '<em><b>Has Moved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KING__HAS_MOVED = eINSTANCE.getKing_HasMoved();

		/**
		 * The meta object literal for the '{@link chess.impl.QueenImpl <em>Queen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.QueenImpl
		 * @see chess.impl.ChessPackageImpl#getQueen()
		 * @generated
		 */
		EClass QUEEN = eINSTANCE.getQueen();

		/**
		 * The meta object literal for the '{@link chess.impl.RookImpl <em>Rook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.RookImpl
		 * @see chess.impl.ChessPackageImpl#getRook()
		 * @generated
		 */
		EClass ROOK = eINSTANCE.getRook();

		/**
		 * The meta object literal for the '<em><b>Has Moved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOK__HAS_MOVED = eINSTANCE.getRook_HasMoved();

		/**
		 * The meta object literal for the '{@link chess.impl.BishopImpl <em>Bishop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.BishopImpl
		 * @see chess.impl.ChessPackageImpl#getBishop()
		 * @generated
		 */
		EClass BISHOP = eINSTANCE.getBishop();

		/**
		 * The meta object literal for the '{@link chess.impl.KnightImpl <em>Knight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.KnightImpl
		 * @see chess.impl.ChessPackageImpl#getKnight()
		 * @generated
		 */
		EClass KNIGHT = eINSTANCE.getKnight();

		/**
		 * The meta object literal for the '<em><b>Can Jump</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNIGHT__CAN_JUMP = eINSTANCE.getKnight_CanJump();

		/**
		 * The meta object literal for the '{@link chess.impl.PawnImpl <em>Pawn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.PawnImpl
		 * @see chess.impl.ChessPackageImpl#getPawn()
		 * @generated
		 */
		EClass PAWN = eINSTANCE.getPawn();

		/**
		 * The meta object literal for the '<em><b>Has Moved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAWN__HAS_MOVED = eINSTANCE.getPawn_HasMoved();

		/**
		 * The meta object literal for the '<em><b>Promotion Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAWN__PROMOTION_TYPE = eINSTANCE.getPawn_PromotionType();

		/**
		 * The meta object literal for the '{@link chess.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.MoveImpl
		 * @see chess.impl.ChessPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Start Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__START_SQUARE = eINSTANCE.getMove_StartSquare();

		/**
		 * The meta object literal for the '<em><b>End Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__END_SQUARE = eINSTANCE.getMove_EndSquare();

		/**
		 * The meta object literal for the '{@link chess.impl.MoveHistoryImpl <em>Move History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.impl.MoveHistoryImpl
		 * @see chess.impl.ChessPackageImpl#getMoveHistory()
		 * @generated
		 */
		EClass MOVE_HISTORY = eINSTANCE.getMoveHistory();

		/**
		 * The meta object literal for the '<em><b>Moves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_HISTORY__MOVES = eINSTANCE.getMoveHistory_Moves();

		/**
		 * The meta object literal for the '{@link chess.PlayerColor <em>Player Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.PlayerColor
		 * @see chess.impl.ChessPackageImpl#getPlayerColor()
		 * @generated
		 */
		EEnum PLAYER_COLOR = eINSTANCE.getPlayerColor();

		/**
		 * The meta object literal for the '{@link chess.SquareColor <em>Square Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.SquareColor
		 * @see chess.impl.ChessPackageImpl#getSquareColor()
		 * @generated
		 */
		EEnum SQUARE_COLOR = eINSTANCE.getSquareColor();

		/**
		 * The meta object literal for the '{@link chess.MoveDirection <em>Move Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.MoveDirection
		 * @see chess.impl.ChessPackageImpl#getMoveDirection()
		 * @generated
		 */
		EEnum MOVE_DIRECTION = eINSTANCE.getMoveDirection();

		/**
		 * The meta object literal for the '{@link chess.PromotionType <em>Promotion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chess.PromotionType
		 * @see chess.impl.ChessPackageImpl#getPromotionType()
		 * @generated
		 */
		EEnum PROMOTION_TYPE = eINSTANCE.getPromotionType();

	}

} //ChessPackage
