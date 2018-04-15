package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.model.Chair;
import patterns.creational.abstractfactory.model.ModernChair;
import patterns.creational.abstractfactory.model.ModernTable;
import patterns.creational.abstractfactory.model.Table;

public class ModernFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
