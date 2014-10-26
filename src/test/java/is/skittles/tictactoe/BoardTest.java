package is.skittles.tictactoe;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import org.junit.Rule;


public class BoardTest {

    private Board b;

    @Before
    public void setUp() {
        b = new Board();

    }

    @Test public void testPlayerXmarksAtCell0() {
        b.mark(0, 1);
        assertEquals(b.getCellValue(0), 1);
    }

    @Test public void testCannotPlaceAtAlreadyMarkedCell() {
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
    b.mark(9, 1);
    }

    @Test
    public void testTeamCannotBe3() {
    thrown.expect(IndexOutOfBoundsException.class);
    thrown.expectMessage("Team can only be 1 or 2");
    b.mark(5, 3);
    }

    @Test
    public void testCellCannotBe10() {
    thrown.expect(IndexOutOfBoundsException.class);
    thrown.expectMessage("Cell out of bound");
    b.getCellValue(10);
    }

    @Test
    public void testIfThereIsAWinnerInHorizontalLine() {
        b.mark(0, 1);
        b.mark(4, 2);
        b.mark(1, 1);
        b.mark(7, 2); 
        b.mark(2, 1);
        assertEquals(b.findWinner(1), 1);
    }
    @Test
    public void testIfThereIsAWinnerInHorizontalLinePLayer2() {
        b.mark(0, 2);
        b.mark(4, 1);
        b.mark(1, 2);
        b.mark(7, 1); 
        b.mark(2, 2);
        assertEquals(b.findWinner(2), 2);
    }

    @Test
    public void testIfThereIsNoWinner() {
        b.mark(0, 1);
        b.mark(4, 2);
        b.mark(1, 1);
        b.mark(7, 2); 
        assertEquals(b.findWinner(1), 0);
    }
}