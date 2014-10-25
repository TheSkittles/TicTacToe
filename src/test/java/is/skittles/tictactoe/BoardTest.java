package is.skittles.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;


public class BoardTest {

	Board b = new Board();

    @Test public void testArraySize() {
        assertEquals(b.size(), 9);
    }

    @Test public void testPlayerXmarksAtCell0() {
        b.mark(0, 1);
        assertEquals(b.getCellValue(0), 1);
    }

   /* @Test public void testPlayerXmarksAtCell0() {
        Board b = new Board();
        b.mark(0, 1);
        assertEquals(b.getCellValue(0), 1);
    }*/
}