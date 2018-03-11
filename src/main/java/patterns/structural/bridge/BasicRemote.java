package patterns.structural.bridge;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelNext() {
        System.out.println("next channel");
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelPrev() {
        System.out.println("prev channel");
        device.setChannel(device.getChannel() - 1);
    }
}
