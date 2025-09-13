package FactoryMethodPattern;

import FactoryMethodPattern.Creator.Creator;

public class Client {
    public static void main(String[] args) {
        Creator truck = new FactoryMethodPattern.ConcreteCreator.Truck();
        truck.planDelivery();

        Creator ship = new FactoryMethodPattern.ConcreteCreator.Ship();
        ship.planDelivery();
    }
}
