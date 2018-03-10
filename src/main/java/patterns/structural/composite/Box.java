package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private String title;

    public Box(String title) {
        this.title = title;
    }

    private List<Component> itemsInsideBox = new ArrayList<>();

    @Override
    public int getPrice() {
        int price = 0;
        for (Component c : itemsInsideBox) {
            price += c.getPrice();
        }
        return price;
    }

    public void add(Component c) {
        itemsInsideBox.add(c);
    }

    public void remove(Component c) {
        itemsInsideBox.remove(c);
    }
}
