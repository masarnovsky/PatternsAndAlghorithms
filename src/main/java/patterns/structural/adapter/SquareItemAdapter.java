package patterns.structural.adapter;

public class SquareItemAdapter extends RoundItem {
    SquareItem squareItem;

    public SquareItemAdapter(SquareItem squareItem) {
        this.squareItem = squareItem;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((squareItem.getWidth() / 2), 2) * 2);
    }
}
