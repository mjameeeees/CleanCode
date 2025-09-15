package BehavioralPattern.StrategyPattern;

public class Client {
    public static void main(String[] args) {
               String origin = "Home";
        String destination = "Museum";

        Navigator navigator = new Navigator(new FastestRouteStrategy());
        navigator.navigate(origin, destination);

        // Switch strategy at runtime
        navigator.setRouteStrategy(new ScenicRouteStrategy());
        navigator.navigate(origin, destination);

        navigator.setRouteStrategy(new PublicTransportStrategy());
        navigator.navigate(origin, destination);
    }
}
