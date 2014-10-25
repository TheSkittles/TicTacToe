package is.skittles.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;


public class BoardTest {
    @Test public void testArraySize() {
        Board b = new Board();
        assertEquals(b.size(), 9);
    }
}