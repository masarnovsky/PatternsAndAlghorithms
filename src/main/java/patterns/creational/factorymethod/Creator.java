package patterns.creational.factorymethod;

public class Creator {

    public static Transport factoryMethod(String continent) {
        if (continent.equals("Europe") || continent.equals("Asia")) {
            return new Truck();
        }
        if (continent.equals("Antarctida")) {
            return new NoDelivery();
        }
        return new Ship();
    }
}
