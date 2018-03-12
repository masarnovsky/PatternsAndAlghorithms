package patterns.structural.flyweight;

public class CppPlatformFlyweight implements PlatformFlyweight {
    public CppPlatformFlyweight() {
        System.out.println("C++ platform created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("compiling and executing c++ code");
    }
}
