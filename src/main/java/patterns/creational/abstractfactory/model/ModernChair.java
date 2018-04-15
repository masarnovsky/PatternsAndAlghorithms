package patterns.creational.abstractfactory.model;

public class ModernChair implements Chair {

    @Override
    public boolean isChairHasBack() {
        return false;
    }

    @Override
    public void name() {
        System.out.println("modern chair");
    }
}
