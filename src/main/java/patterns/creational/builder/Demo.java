package patterns.creational.builder;

import patterns.creational.builder.cars.Car;
import patterns.creational.builder.cars.Manual;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSportCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built: " + car.getType() + "\n");

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Manual for car: " + manual.print());
    }
}
