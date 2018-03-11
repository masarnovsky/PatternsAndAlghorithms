package patterns.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        useDevice(new TV());
        useDevice(new Radio());
    }

    private static void useDevice(Device device) {
        System.out.println("test with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("test with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
