package app;

import game.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Chess Game Started");

        boolean move1 = game.makeMove(0, 1, 2, 2);
        System.out.println("Move 1 success: " + move1);

        boolean move2 = game.makeMove(7, 1, 5, 2);
        System.out.println("Move 2 success: " + move2);
    }
}
