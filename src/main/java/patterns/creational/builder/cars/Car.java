package patterns.creational.builder.cars;

import patterns.creational.builder.components.Engine;
import patterns.creational.builder.components.GPSNavigator;
import patterns.creational.builder.components.Transmission;

public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private static double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public static double getFuel() {
        return fuel;
    }
}
