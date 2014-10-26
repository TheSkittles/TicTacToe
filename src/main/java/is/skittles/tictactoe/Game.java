package is.skittles.tictactoe;

public class Game {
    private Board board;
    private int currentPlayer = 1;

    public Game(Board b) {
        board = b;
    }

    public int getPlayer() {
        return currentPlayer;
    }

    public void mark(int cell) {
        board.mark(cell, currentPlayer);
        currentPlayer = (currentPlayer == 1 ? 2 : 1);
    }

    // This code kind of belongs to board
    public int[] getBoard() {
        return new int[9];
    }
}
