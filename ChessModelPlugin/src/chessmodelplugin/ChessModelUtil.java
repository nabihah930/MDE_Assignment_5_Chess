package chessmodelplugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import chess.Bishop;
import chess.Board;
import chess.ChessFactory;
import chess.Game;
import chess.King;
import chess.Knight;
import chess.Move;
import chess.MoveHistory;
import chess.Pawn;
import chess.Piece;
import chess.Player;
import chess.PlayerColor;
import chess.Queen;
import chess.Rook;
import chess.Square;
import chess.SquareColor;

public class ChessModelUtil {

	private static void placePiece(Board board, Piece piece, String file, int rank) {
	    Square square = findSquare(board, file, rank);
	    square.setPiece(piece);
	    piece.setCurrentPosition(square);
	}

	private static Square findSquare(Board board, String file, int rank) {
	    return board.getSquares().stream()
	        .filter(sq -> sq.getFile().equals(file) && sq.getRank() == rank)
	        .findFirst()
	        .orElseThrow(() -> new IllegalArgumentException("Square not found"));
	}

	public static Game createFirstChessGame() {
	    Game game = ChessFactory.eINSTANCE.createGame();
	    game.setTurn(PlayerColor.WHITE);
	    game.getPlayers().addAll(createPlayers());
	    Board board = ChessFactory.eINSTANCE.createBoard();
	    board.setRows(8);
	    board.setColumns(8);
	    game.setBoard(board);
	    createSquares(board);
	    
	    placePiece(board, createRook(PlayerColor.WHITE), "a", 1);
	    placePiece(board, createKnight(PlayerColor.WHITE), "b", 1);
	    placePiece(board, createBishop(PlayerColor.WHITE), "c", 1);
	    placePiece(board, createQueen(PlayerColor.WHITE), "d", 1);
	    placePiece(board, createKing(PlayerColor.WHITE), "e", 1);
	    placePiece(board, createBishop(PlayerColor.WHITE), "f", 1);
	    placePiece(board, createKnight(PlayerColor.WHITE), "g", 1);
	    placePiece(board, createRook(PlayerColor.WHITE), "h", 1);

	    for (char file = 'a'; file <= 'h'; file++) {
	        placePiece(board, createPawn(PlayerColor.WHITE), String.valueOf(file), 2);
	    }

	    placePiece(board, createRook(PlayerColor.BLACK), "a", 8);
	    placePiece(board, createKnight(PlayerColor.BLACK), "b", 8);
	    placePiece(board, createBishop(PlayerColor.BLACK), "c", 8);
	    placePiece(board, createQueen(PlayerColor.BLACK), "d", 8);
	    placePiece(board, createKing(PlayerColor.BLACK), "e", 8);
	    placePiece(board, createBishop(PlayerColor.BLACK), "f", 8);
	    placePiece(board, createKnight(PlayerColor.BLACK), "g", 8);
	    placePiece(board, createRook(PlayerColor.BLACK), "h", 8);

	    for (char file = 'a'; file <= 'h'; file++) { 
	        placePiece(board, createPawn(PlayerColor.BLACK), String.valueOf(file), 7);
	    }

	    return game;
	}

	 public static Game createSecondChessGame() {
        Game game = ChessFactory.eINSTANCE.createGame();
        game.setTurn(PlayerColor.WHITE);
        game.getPlayers().addAll(createPlayers());
        Board board = ChessFactory.eINSTANCE.createBoard();
        board.setRows(8);
        board.setColumns(8);
        game.setBoard(board);
        createSquares(board);

        placePiece(board, createRook(PlayerColor.WHITE), "f", 1);  
        placePiece(board, createKing(PlayerColor.WHITE), "g", 1); 
        placePiece(board, createKnight(PlayerColor.WHITE), "f", 3);
        placePiece(board, createBishop(PlayerColor.WHITE), "c", 4);

        
        for (char file = 'a'; file <= 'h'; file++) {
            if (file != 'e' && file != 'g') {  
                placePiece(board, createPawn(PlayerColor.WHITE), String.valueOf(file), 2);
            }
        }

        placePiece(board, createRook(PlayerColor.BLACK), "f", 8);  
        placePiece(board, createKing(PlayerColor.BLACK), "g", 8);  
        placePiece(board, createBishop(PlayerColor.BLACK), "c", 5);
        placePiece(board, createKnight(PlayerColor.BLACK), "f", 6);


        for (char file = 'a'; file <= 'h'; file++) {
             if (file != 'f') {  
                 placePiece(board, createPawn(PlayerColor.BLACK), String.valueOf(file), 7);
             }
        }

        MoveHistory moveHistory = ChessFactory.eINSTANCE.createMoveHistory();
        
        addMove(moveHistory, board, "e", 1, "g", 1);
        addMove(moveHistory, board, "h", 1, "f", 1);
         addMove(moveHistory, board, "g", 1, "f", 3);
         addMove(moveHistory, board, "f", 1, "c", 4);
      
        addMove(moveHistory, board, "e", 8, "g", 8);
        addMove(moveHistory, board, "h", 8, "f", 8);
        addMove(moveHistory, board, "g", 8, "f", 6);
        addMove(moveHistory, board, "f", 8, "c", 5);
        game.setMoveHistory(moveHistory);

        return game;
    }
    
        private static void addMove(MoveHistory moveHistory, Board board, String startFile, int startRank, String endFile, int endRank) {
        Move move = ChessFactory.eINSTANCE.createMove();
        move.setStartSquare(findSquare(board, startFile, startRank));
        move.setEndSquare(findSquare(board, endFile, endRank));
        moveHistory.getMoves().add(move);
    }
	        


    public static void saveModel(Game gameInstance, File file) throws IOException {
        Resource resource = new ResourceSetImpl().createResource(org.eclipse.emf.common.util.URI.createFileURI(file.getAbsolutePath()));
        resource.getContents().add(gameInstance);
        resource.save(null); 
    }

    public static Game loadModel(File file) throws IOException {
        Resource resource = new ResourceSetImpl().createResource(org.eclipse.emf.common.util.URI.createFileURI(file.getAbsolutePath()));
        resource.load(null); 
        return (Game) resource.getContents().get(0); 
    }

    public static Diagnostic validateModel(Game gameInstance) {
        BasicDiagnostic diagnostic = new BasicDiagnostic();

        if (gameInstance.getPlayers().size() != 2) {
            diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "ChessValidation", 0, "Game must have exactly two players.", new Object[] {}));
        }

        Board board = gameInstance.getBoard();
        if (board == null || board.getRows() != 8 || board.getColumns() != 8) {
            diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, "ChessValidation", 0, "Game must have an 8x8 board.", new Object[] {}));
        }

        if (diagnostic.getChildren().isEmpty()) {
            return Diagnostic.OK_INSTANCE;
        }
        return diagnostic;
    }
    

    
    private static List<Player> createPlayers() {
        Player whitePlayer = ChessFactory.eINSTANCE.createPlayer();
        whitePlayer.setName("White");
        whitePlayer.setColor(PlayerColor.WHITE);

        Player blackPlayer = ChessFactory.eINSTANCE.createPlayer();
        blackPlayer.setName("Black");
        blackPlayer.setColor(PlayerColor.BLACK);

        List<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);

        return players;
    }

    private static List<Square> createSquares(Board board) {
        List<Square> squares = new ArrayList<>();
        String[] files = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int rank = 1; rank <= 8; rank++) {
            for (int fileIndex = 0; fileIndex < files.length; fileIndex++) {
                Square square = ChessFactory.eINSTANCE.createSquare();
                square.setFile(files[fileIndex]); 
                square.setRank(rank);
                square.setColor((rank + fileIndex) % 2 == 0 ? SquareColor.WHITE : SquareColor.BLACK); 

                squares.add(square);
            }
        }
        board.getSquares().addAll(squares); 
        return squares;
    }


    
    private static Rook createRook(PlayerColor color) {
        Rook rook = ChessFactory.eINSTANCE.createRook();
        rook.setColor(color);
        return rook;
    }

    private static Knight createKnight(PlayerColor color) {
        Knight knight = ChessFactory.eINSTANCE.createKnight();
        knight.setColor(color);
        return knight;
    }

    private static Bishop createBishop(PlayerColor color) {
        Bishop bishop = ChessFactory.eINSTANCE.createBishop();
        bishop.setColor(color);
        return bishop;
    }

    private static Queen createQueen(PlayerColor color) {
        Queen queen = ChessFactory.eINSTANCE.createQueen();
        queen.setColor(color);
        return queen;
    }

    private static King createKing(PlayerColor color) {
        King king = ChessFactory.eINSTANCE.createKing();
        king.setColor(color);
        return king;
    }

    private static Pawn createPawn(PlayerColor color) {
        Pawn pawn = ChessFactory.eINSTANCE.createPawn();
        pawn.setColor(color);
        return pawn;
    }

}


