package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.model.Chair;
import patterns.creational.abstractfactory.model.Table;

public interface AbstractFurnitureFactory {
    Chair createChair();
    Table createTable();
}
