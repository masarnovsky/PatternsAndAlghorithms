package patterns.creational.abstractfactory.model;

public class VictorianTable implements Table {

    @Override
    public int legsCount() {
        return 4;
    }

    @Override
    public void name() {
        System.out.println("victorian table");
    }
}
