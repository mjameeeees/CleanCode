package FactoryMethodPattern.ConcreteProduct;

import FactoryMethodPattern.Interface.Transport;

public class Truck implements Transport{
        public void delivery(){
            System.out.println("Delivered by Truck");
        }
}
