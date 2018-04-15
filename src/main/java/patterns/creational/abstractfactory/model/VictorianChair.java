package patterns.creational.abstractfactory.model;

public class VictorianChair implements Chair {

    @Override
    public boolean isChairHasBack() {
        return true;
    }

    @Override
    public void name() {
        System.out.println("victorian chair");
    }
}
