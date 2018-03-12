package patterns.structural.flyweight;

public class JavaPlatformFlyweight implements PlatformFlyweight {
    public JavaPlatformFlyweight() {
        System.out.println("Java platform created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("compiling and executing java code");
    }
}
