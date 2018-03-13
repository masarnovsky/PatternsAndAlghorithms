package patterns.creational.factorymethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("deliver by truck");
    }
}
