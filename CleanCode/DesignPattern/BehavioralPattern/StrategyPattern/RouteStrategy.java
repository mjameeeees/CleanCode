package BehavioralPattern.StrategyPattern;

import java.util.List;

public interface RouteStrategy {
    List<String> buildRoute(String origin, String destination);
}
