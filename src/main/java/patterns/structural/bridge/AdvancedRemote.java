package patterns.structural.bridge;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("mute mode");
        device.setVolume(0);
    }
}
