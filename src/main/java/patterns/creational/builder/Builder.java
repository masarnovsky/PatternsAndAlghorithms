package patterns.creational.builder;

import patterns.creational.builder.cars.Type;
import patterns.creational.builder.components.Engine;
import patterns.creational.builder.components.GPSNavigator;
import patterns.creational.builder.components.Transmission;

public interface Builder {
    public void setType(Type type);

    public void setSeats(int seats);

    public void setEngine(Engine engine);

    public void setTransmission(Transmission transmission);

    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
