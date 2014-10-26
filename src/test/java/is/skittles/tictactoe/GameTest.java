package is.skittles.tictactoe;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

/*
 * Game class
 *
 * Maintains the state of a tictactoe game
 *
 * @author eggert, @date 10/26/14 2:38 PM
 */
public class GameTest {
    Board mockedBoard;
    Game g;

    @Before
    public void setupTest() {
        mockedBoard = mock(Board.class);
        g = new Game(mockedBoard);
    }

    @Test public void testGetPlayerAtStart() {
        assertEquals("Initital player should be 1", g.getPlayer(), 1);
    }

    @Test public void testGetPlayerAfterOnePlay() {
        g.mark(1);
        assertEquals("Correct player after one move", g.getPlayer(), 2);
    }

    @Test public void testGetCleanBoard() {
        int[] clean = new int[9];
        
        assertArrayEquals("IntialBoard should be empty", g.getBoard(), clean);
    }


    @Test public void testForWinner() {
        when(mockedBoard.findWinner(1)).thenReturn(1);
        g.mark(1);
        assertEquals(g.getWinner(), 1);
    }

    @Test public void testGetBoardAfterPlayed() {
        when(mockedBoard.getCellValue(1)).thenReturn(1);
        int[] boardArray = g.getBoard();
        assertEquals("Board array has correct player mark", boardArray[1], 1);
    }

    // This test is maybe not so useful
    // Verify that Game calls Board to find the board status
    @Test public void testBoardGetsCalled() {
        when(mockedBoard.getCellValue(0)).thenReturn(1);
        g.getBoard();
        verify(mockedBoard).getCellValue(1);
    }
}