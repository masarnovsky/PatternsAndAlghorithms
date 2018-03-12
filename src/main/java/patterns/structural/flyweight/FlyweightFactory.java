package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class FlyweightFactory {
    private static Map<String, PlatformFlyweight> map = new HashMap<>();

    public static synchronized PlatformFlyweight getInstance(String platformType) {
        PlatformFlyweight platform = map.get(platformType);
        if (platform == null) {
            switch (platformType) {
                case "CPP":
                    platform = new CppPlatformFlyweight();
                    break;
                case "Java":
                    platform = new JavaPlatformFlyweight();
            }
            map.put(platformType, platform);
        }

        return platform;
    }
}
