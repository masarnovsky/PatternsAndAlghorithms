package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.factory.AbstractFurnitureFactory;
import patterns.creational.abstractfactory.factory.ModernFurnitureFactory;
import patterns.creational.abstractfactory.factory.VictorianFurnitureFactory;

import java.time.LocalDateTime;

public class Demo {

    private static FurnitureSet getSet() {
        FurnitureSet set;
        AbstractFurnitureFactory factory;

        if (LocalDateTime.now().getYear() > 2000) {
            factory = new ModernFurnitureFactory();
        } else {
            factory = new VictorianFurnitureFactory();
        }

        set = new FurnitureSet(factory);
        return set;
    }

    public static void main(String[] args) {
        FurnitureSet newFurnitureSetForHome = getSet();
        newFurnitureSetForHome.getInfo();
    }
}
