package patterns.structural.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoxTest {

    @Test
    public void getPriceForBox() {
        int price1 = 4;
        int price2 = 6;
        int expectedResult = price1 + price2;
        Box mainBox = new Box("mainBox");
        Item item1 = new Item("item1", price1);
        Item item2 = new Item("item2", price2);
        mainBox.add(item1);
        mainBox.add(item2);

        assertEquals(mainBox.getPrice(), expectedResult);
    }

    @Test
    public void getPriceForBoxWithSecondBox() {
        int price1 = 4;
        int price2 = 6;
        int price3 = 1;
        int price4 = 2;
        int expectedResultForMainBox = price1 + price2 + price3 + price4;
        int expectedResultForLittleBox = price3 + price4;
        Box mainBox = new Box("mainBox");
        Item item1 = new Item("item1", price1);
        Item item2 = new Item("item2", price2);
        mainBox.add(item1);
        mainBox.add(item2);

        Box littleBox = new Box("littleBox");
        Item item3 = new Item("item3", price3);
        Item item4 = new Item("item4", price4);
        littleBox.add(item3);
        littleBox.add(item4);
        mainBox.add(littleBox);

        assertEquals(mainBox.getPrice(), expectedResultForMainBox);
        assertEquals(littleBox.getPrice(), expectedResultForLittleBox);
    }
}