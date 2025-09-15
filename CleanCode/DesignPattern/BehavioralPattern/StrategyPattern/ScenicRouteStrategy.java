package BehavioralPattern.StrategyPattern;
import java.util.ArrayList;
import java.util.List;

public class ScenicRouteStrategy implements RouteStrategy {
    @Override
    public List<String> buildRoute(String origin, String destination) {
        // Simulated route
        List<String> route = new ArrayList<>();
        route.add(origin);
        route.add("Take country road 1");
        route.add("Pass through lakeside road");
        route.add("Drive through forest path");
        route.add(destination);
        System.out.println("Using ScenicRouteStrategy");
        return route;
    }
}
