package is.skittles.tictactoe;


public class Board {	

	//0 eqauls empty cell, 1 equals x and 2 equals o
	
    private int n = 3;
    private int[][] board = new int[n][n];

	Board(){};

	//cell is the cell to be marked, team equals the team playing
    public void mark(int cell, int team){

    	if(cell<0||cell>8){
            throw new IndexOutOfBoundsException("Cell out of bound");
        }
        if(team<1||team>2){
            throw new IndexOutOfBoundsException("Team can only be 1 or 2");
        }
        if(board[(int)(Math.floor(cell/n))][cell % n] == 0) 
            board[(int)(Math.floor(cell/n))][cell % n] = team;

    }

    public int getCellValue(int cell){
        if(cell<0||cell>8){
            throw new IndexOutOfBoundsException("Cell out of bound");
        }
    	return board[(int)(Math.floor(cell/n))][cell % n];
    }

}
