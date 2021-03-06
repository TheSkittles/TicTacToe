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

        int i = findHorizontal(cell);
        int j = findVertical(cell);
        System.out.println(i + ":" + j);

        if(board[i][j] != 0) {
            throw new IndexOutOfBoundsException("Cell has already been used");
        }
        else {
            board[i][j] = team;
        }
    }

    public int getCellValue(int cell){
        if(cell < 0 || cell > 8) {
            throw new IndexOutOfBoundsException("Cell out of bound");
        }
        return board[findHorizontal(cell)][findVertical(cell)];
    }

    public int findVertical(int cell) {
        return cell % n;
    }

    public int findHorizontal(int cell) {
        if (cell < 3)
            return 0;
        if (cell < 6)
            return 1;
        return 2;
    }

    public int findWinner(int team) {
        // horizontal and vertical
        for(int i = 0; i < n; i++) {
            if (board[i][i] == team) {
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                    return team;
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                    return team;
            }
        }

        // diagonal and anti-diagonal
        if (board[1][1] == team) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                return team;
            if (board[2][0] == board[1][1] && board[1][1] == board[0][2])
                return team;
        }

        return 0;
    }
}
