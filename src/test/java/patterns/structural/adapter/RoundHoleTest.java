package patterns.structural.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoundHoleTest {

    private final double STANDART_RADIUS = 5;
    private final double SMALL_RADIUS = 2;
    private final double BIG_RADIUS = 20;
    private RoundHole roundHole = new RoundHole(STANDART_RADIUS);

    @Test
    public void fitsForRoundItem() {
        RoundItem roundItem = new RoundItem(STANDART_RADIUS);
        assertTrue(roundHole.fits(roundItem));
    }

    @Test
    public void fitsForSquareItem() {
        SquareItem squareItem = new SquareItem(SMALL_RADIUS);
        SquareItemAdapter squareItemAdapter = new SquareItemAdapter(squareItem);

        assertTrue(roundHole.fits(squareItemAdapter));
    }

    @Test
    public void fitsFailForBigRadius() {
        SquareItem squareItem = new SquareItem(BIG_RADIUS);
        SquareItemAdapter squareItemAdapter = new SquareItemAdapter(squareItem);

        assertFalse(roundHole.fits(squareItemAdapter));
    }
}