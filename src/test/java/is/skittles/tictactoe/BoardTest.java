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

    @Test
    public void testPlayerXmarksAtCell0() {
        b.mark(0, 1);
        assertEquals(b.getCellValue(0), 1);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ?marks=11 did not return an error, instead it kept playing
    // as nothing was wrong, by throwing an error the server
    // displays an error message
    @Test
    public void testCannotPlaceAtAlreadyMarkedCell() {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Cell has already been used");
        b.mark(0, 1);
        b.mark(0, 2);
    }

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
    public void testIfThereIsAVerticalWinner() {
        b.mark(0, 1);
        b.mark(4, 2);
        b.mark(3, 1);
        b.mark(7, 2);
        b.mark(6, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    public void testIfThereIsNoWinner() {
        b.mark(0, 1);
        b.mark(4, 2);
        b.mark(1, 1);
        b.mark(7, 2);
        assertEquals(b.findWinner(1), 0);
        assertEquals(b.findWinner(2), 0);
    }

    @Test
    public void testIfThereIsADiagonalWinner() {
        b.mark(0, 1);
        b.mark(3, 2);
        b.mark(4, 1);
        b.mark(7, 2);
        b.mark(8, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    public void testIfThereIsAnAntiDiagonalWinner() {
        b.mark(2, 1);
        b.mark(3, 2);
        b.mark(4, 1);
        b.mark(7, 2);
        b.mark(6, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    // There was a case where the marks 201 wrongly gave a winner
    public void testNoWinnerForMarks201() {
        b.mark(2, 1);
        b.mark(0, 2);
        b.mark(1, 1);
        assertEquals(b.findWinner(1), 0);
        assertEquals(b.findWinner(2), 0);
    }

    @Test
    public void testIfThereIsAHorizontalWinnerRow0() {
        b.mark(0, 1);
        b.mark(1, 1);
        b.mark(2, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    public void testIfThereIsAHorizontalWinnerRow1() {
        b.mark(3, 1);
        b.mark(4, 1);
        b.mark(5, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    public void testIfThereIsAHorizontalWinnerRow2() {
        b.mark(6, 1);
        b.mark(7, 1);
        b.mark(8, 1);
    }

    @Test
    public void testIfThereIsAVerticalWinnerRow0() {
        b.mark(0, 1);
        b.mark(3, 1);
        b.mark(6, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    public void testIfThereIsAVerticalWinnerRow1() {
        b.mark(1, 1);
        b.mark(4, 1);
        b.mark(7, 1);
        assertEquals(b.findWinner(1), 1);
    }

    @Test
    public void testIfThereIsAVerticalWinnerRow2() {
        b.mark(2, 1);
        b.mark(5, 1);
        b.mark(8, 1);
        assertEquals(b.findWinner(1), 1);
    }
}
