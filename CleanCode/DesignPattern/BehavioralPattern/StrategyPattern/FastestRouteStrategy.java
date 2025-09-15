package BehavioralPattern.StrategyPattern;
import java.util.ArrayList;
import java.util.List;

public class FastestRouteStrategy implements RouteStrategy {
    
    @Override
    public List<String> buildRoute(String origin, String destination) {
        // Simulated algorithm
        List<String> route = new ArrayList<>();
        route.add(origin);
        route.add("Take highway A");
        route.add("Merge to highway B");
        route.add("Exit to city roads");
        route.add(destination);
        System.out.println("Using FastestRouteStrategy");
        return route;
    }
}
