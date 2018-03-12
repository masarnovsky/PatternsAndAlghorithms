package patterns.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        Code code = new Code();
        code.setCode("C++");
        PlatformFlyweight platform = FlyweightFactory.getInstance("CPP");
        platform.execute(code);
        code = new Code();
        code.setCode("C-- --");
        platform = FlyweightFactory.getInstance("CPP");
        platform.execute(code);
        code = new Code();
        code.setCode("Java");
        platform = FlyweightFactory.getInstance("Java");
        platform.execute(code);
    }
}
