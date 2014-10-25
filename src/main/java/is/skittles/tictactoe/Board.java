package is.skittles.tictactoe;

public class Board {	

	//0 eqauls empty cell, 1 equals x and 2 equals o
	private int[] board = new int[9];

	Board(){};

	public int size(){
		return board.length;
	}

	//cell is the cell to be marked, team equals the team playing
    public void mark(int cell, int team){
    	if(cell<0||cell>8){
            throw new IndexOutOfBoundsException("Cell out of bound");
        }
        if(team<1||team>2){
            throw new IndexOutOfBoundsException("Team can only be 1 or 2");
        }
        board[cell] = team;
    }

    public int getCellValue(int cell){
    	return board[cell];
    }
}
