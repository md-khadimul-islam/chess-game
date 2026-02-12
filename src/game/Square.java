package game;

import pieces.Piece;

public class Square {

    public int row, col;
    private Piece piece;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isEmpty() {
        return piece == null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
