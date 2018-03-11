package patterns.structural.bridge;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    void setChannel(int channel);

    int getChannel();

    void printStatus();
}
