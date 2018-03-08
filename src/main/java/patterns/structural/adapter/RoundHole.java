package patterns.structural.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundItem roundItem) {
        return this.radius >= roundItem.getRadius();
    }
}
