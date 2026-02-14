package game;

import pieces.Piece;

public class Move {

    private final Player player;
    private final Square from;
    private final Square to;
    private final Piece pieceMoved;
    private final Piece pieceKilled;

    public Move(Player player, Square from, Square to) {
        this.player = player;
        this.from = from;
        this.to = to;
        this.pieceMoved = from.getPiece();
        this.pieceKilled = from.getPiece();
    }
}
