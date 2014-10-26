package is.skittles.tictactoe;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/*
 * Game class
 *
 * Maintains the state of a tictactoe game
 *
 * @author eggert, @date 10/26/14 2:38 PM
 */
public class GameTest {
    private Board b;
    private Game g;

    @Before
    public void setupTest() {
        b = new Board();
        g = new Game(b);
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

    @Test public void testGetBoardAfterPlayed() {
        g.mark(1);
        int[] boardArray = g.getBoard();
        assertEquals("Board array has correct player mark", boardArray[1], 1);
    }
}