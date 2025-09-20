package FactoryMethodPattern;

import FactoryMethodPattern.Creator.Creator;
import FactoryMethodPattern.ConcreteCreator.Truck;
import FactoryMethodPattern.ConcreteCreator.Ship;

public class Client {
    public static void main(String[] args) {
        Creator truck = new Truck();
        truck.planDelivery();

        Creator ship = new Ship();
        ship.planDelivery();
    }
}
