package patterns.creational.abstractfactory.model;

public class ModernTable implements Table {

    @Override
    public int legsCount() {
        return 3;
    }

    @Override
    public void name() {
        System.out.println("modern table");
    }
}
