package BehavioralPattern.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class PublicTransportStrategy implements RouteStrategy {
        @Override
    public List<String> buildRoute(String origin, String destination) {
        // Simulated public transport route
        List<String> route = new ArrayList<>();
        route.add(origin);
        route.add("Walk to nearest bus stop");
        route.add("Bus line 23 to central station");
        route.add("Train to destination station");
        route.add("Walk to destination");
        System.out.println("Using PublicTransportStrategy");
        return route;
    }
}
