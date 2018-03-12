package patterns.structural.flyweight;

public interface PlatformFlyweight {
    // operations with memory consumptions, common to all
    void execute(Code code);
}
