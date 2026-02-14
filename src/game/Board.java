package game;

import enums.Color;
import pieces.Knight;

public class Board {

    private final Square[][] squares = new Square[8][8];

    public Board() {
        initializeBoard();
        setupPieces();
    }

    private void initializeBoard() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                squares[r][c] = new Square(r, c);
            }
        }
    }

    private void setupPieces() {
        squares[0][1].setPiece(new Knight(Color.WHITE));
        squares[7][1].setPiece(new Knight(Color.BLACK));
    }

    public Square getSquare(int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8) {
            return null;
        }
        return squares[row][col];
    }
}
