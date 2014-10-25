package is.skittles.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import org.junit.Rule;


public class BoardTest {

    @Test public void testArraySize() {
        Board b = new Board();
        assertEquals(b.size(), 9);
    }

    @Test public void testPlayerXmarksAtCell0() {
        Board b = new Board();
        b.mark(0, 1);
        assertEquals(b.getCellValue(0), 1);
    }

    @Test public void testCannotPlaceAtAlreadyMarkedCell() {
        Board b = new Board();
        b.mark(0, 1);
        b.mark(0, 2); 
        assertEquals(b.getCellValue(0), 1);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCannotPlaceAtCell9() {
    thrown.expect(IndexOutOfBoundsException.class);
    thrown.expectMessage("Cell out of bound");
    Board b = new Board();
    b.mark(9, 1);
    }

    @Test
    public void testTeamCannotBe3() {
    thrown.expect(IndexOutOfBoundsException.class);
    thrown.expectMessage("Team can only be 1 or 2");
    Board b = new Board();
    b.mark(5, 3);
    }

    @Test
    public void testCellCannotBe10() {
    thrown.expect(IndexOutOfBoundsException.class);
    thrown.expectMessage("Cell out of bound");
    Board b = new Board();
    b.getCellValue(10);
    }
}