package game;

import enums.Color;
import enums.GameStatus;
import java.util.ArrayList;
import java.util.List;
import pieces.Piece;

public class Game {

    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    private GameStatus status;
    private List<Move> movesPlayed;

    public Game() {
        board = new Board();
        whitePlayer = new Player(Color.WHITE);
        blackPlayer = new Player(Color.BLACK);
        currentPlayer = whitePlayer;
        status = GameStatus.ACTIVE;
        movesPlayed = new ArrayList<>();

    }

    public boolean makeMove(int fromRow, int fromCol, int toRow, int toCol) {
        Square from = board.getSquare(fromRow, fromCol);
        Square to = board.getSquare(toRow, toCol);

        if (from == null || to == null || from.isEmpty()) {
            return false;
        }

        Piece piece = from.getPiece();

        if (piece.getColor() != currentPlayer.getColor()) {
            return false;
        }
        if (!piece.canMove(board, from, to)) {
            return false;
        }

        Move move = new Move(currentPlayer, from, to);

        to.setPiece(piece);
        from.setPiece(null);

        movesPlayed.add(move);
        switchTurn();
        return true;
    }

    private void switchTurn() {
        currentPlayer
                = (currentPlayer == whitePlayer) ? blackPlayer : whitePlayer;
    }

}
