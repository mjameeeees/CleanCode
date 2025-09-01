package FactoryMethodPattern;

import FactoryMethodPattern.ConcreteCreator.RoadLogistics;
import FactoryMethodPattern.ConcreteCreator.ShipLogistics;
import FactoryMethodPattern.Creator.Logistics;

public class FactoryMethod {
    public static void main(String[] args) {
        Logistics a = new RoadLogistics();
        Logistics b = new ShipLogistics();
        a.planDelivery();
        b.planDelivery();
        System.out.println(a == b);
    }
}
