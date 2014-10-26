package is.skittles.tictactoe;

public class Game {
    private Board board;
    private int currentPlayer = 1;
    private int winner = 0;

    public Game(Board b) {
        board = b;
    }

    public int getPlayer() {
        return currentPlayer;
    }
    public int getWinner() {
        return winner;
    }

    public void mark(int cell) {
        board.mark(cell, currentPlayer);
        winner = board.findWinner(currentPlayer);
        currentPlayer = (currentPlayer == 1 ? 2 : 1);
    }


    // This code kind of belongs to board
    public int[] getBoard() {
        int[] result = new int[9];
        for (int i = 0; i < 9; i++) {
            result[i] = board.getCellValue(i);
        }
        return result;
    }
}
