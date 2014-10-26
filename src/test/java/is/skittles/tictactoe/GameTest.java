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
}