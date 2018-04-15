package patterns.creational.builder.components;

public class GPSNavigator {
    private String routeEndpoint;

    public GPSNavigator() {
        this.routeEndpoint = "Minsk, Belarus";
    }

    public GPSNavigator(String routeEndpoint) {
        this.routeEndpoint = routeEndpoint;
    }

    public String getRouteEndpoint() {
        return routeEndpoint;
    }
}
