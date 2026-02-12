package game;

import pieces.Piece;

public class Move {

    private Player player;
    private Square from;
    private Square to;
    private Piece pieceMoved;
    private Piece pieceKilled;

    public Move(Player player, Square from, Square to) {
        this.player = player;
        this.from = from;
        this.to = to;
        this.pieceMoved = from.getPiece();
        this.pieceKilled = from.getPiece();
    }
}
