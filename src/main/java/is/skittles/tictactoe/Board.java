package is.skittles.tictactoe;


public class Board {

    //0 equals empty cell, 1 equals x and 2 equals o

    private int n = 3;
    private int[][] board = new int[n][n];

    Board(){};

    //cell is the cell to be marked, team equals the team playing
    public void mark(int cell, int team) {
        if(cell < 0 || cell > 8) {
            throw new IndexOutOfBoundsException("Cell out of bound");
        }
        if(team < 1 || team > 2) {
            throw new IndexOutOfBoundsException("Team can only be 1 or 2");
        }

        int i = (int)(Math.floor(cell/n));
        int j = cell % n;

        if(board[i][j] == 0)
            board[i][j] = team;
    }

    public int getCellValue(int cell){
        if(cell < 0 || cell > 8) {
            throw new IndexOutOfBoundsException("Cell out of bound");
        }
        return board[(int)(Math.floor(cell/n))][cell % n];
    }

    public int findWinner(int team) {
        int winner = 1;

        // Horizontal check
        for(int i = 0; i < n; i++) {
            winner = 1;

            for (int j = 0; j < n; j++) {
                if (board[i][j] != team) winner = 0;
            }

            if (winner == 1) return team;
        }

        // Vertical check
        for(int i = 0; i < n; i++) {
            winner = 1;

            for (int j = 0; j < n; j++) {
                if (board[j][i] != team) winner = 0;
            }

            if (winner == 1) return team;
        }

        // Diagonal
        winner = 1;
        for (int i = 0; i < n; i++) {
            if (board[i][i] != team) winner = 0;
        }
        if (winner == 1) return team;

        // Anti-Diagonal
        winner = 1;
        for (int i = 0; i < n; i++) {
            if (board[i][n - 1 - i] != team) winner = 0;
        }
        if (winner == 1) return team;

        return 0;
    }
}
