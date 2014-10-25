package is.skittles.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import org.junit.Rule;


public class BoardTest {

	Board b = new Board();

    @Test public void testArraySize() {
        assertEquals(b.size(), 9);
    }

    @Test public void testPlayerXmarksAtCell0() {
        b.mark(0, 1);
        assertEquals(b.getCellValue(0), 1);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCannotPlaceAtCell9() {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Cell out of bound");
        b.mark(9, 1);
    }

    @Test
    public void testTeamCannotBe3() {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Team can only be 1 or 2");
        b.mark(5, 3);
    }
}