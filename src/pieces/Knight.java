package pieces;

import enums.Color;
import game.Board;
import game.Square;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Square from, Square to) {
        int dx = Math.abs(from.row - to.row);
        int dy = Math.abs(from.col - to.col);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

}
