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
}
