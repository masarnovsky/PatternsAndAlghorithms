package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.factory.AbstractFurnitureFactory;
import patterns.creational.abstractfactory.model.Chair;
import patterns.creational.abstractfactory.model.Table;

public class FurnitureSet {
    private Chair chair;
    private Table table;

    public FurnitureSet(AbstractFurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
    }

    public void getInfo() {
        chair.name();
        table.name();
    }
}
