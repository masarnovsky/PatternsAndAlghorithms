package patterns.structural.composite;

public class Item implements Component {
    private String title;
    private int price;

    public Item(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
