package BehavioralPattern.StrategyPattern;

import java.util.List;

public class Navigator {
        private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String origin, String destination) {
        List<String> route = strategy.buildRoute(origin, destination);
        System.out.println("Route from " + origin + " to " + destination + ":");
        for (String step : route) {
            System.out.println("  - " + step);
        }
        System.out.println();
    }
}
