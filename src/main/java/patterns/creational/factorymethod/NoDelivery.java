package patterns.creational.factorymethod;

public class NoDelivery implements Transport {
    @Override
    public void deliver() {
        System.out.println("oooops, there's nobody here\\\\");
    }
}
