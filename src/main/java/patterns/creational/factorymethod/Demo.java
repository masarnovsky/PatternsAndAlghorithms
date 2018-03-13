package patterns.creational.factorymethod;

public class Demo {
    public static void main(String[] args) {
        String[] continents = {"Asia", "Australia", "Antarctida", "Africa", "America", "Europe"};
        for (String c : continents) {
            System.out.println("Continent: " + c);
            Creator.factoryMethod(c).deliver();
        }
    }
}
