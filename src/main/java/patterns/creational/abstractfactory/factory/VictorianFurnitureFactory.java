package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.model.Chair;
import patterns.creational.abstractfactory.model.Table;
import patterns.creational.abstractfactory.model.VictorianChair;
import patterns.creational.abstractfactory.model.VictorianTable;

public class VictorianFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
