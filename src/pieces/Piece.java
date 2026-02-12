package pieces;

import enums.Color;
import game.Square;
import game.Board;

public abstract class Piece {

    protected Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean canMove(Board board, Square from, Square to);
}
