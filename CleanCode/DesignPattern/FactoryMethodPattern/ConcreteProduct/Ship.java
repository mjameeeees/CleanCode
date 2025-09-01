package FactoryMethodPattern.ConcreteProduct;

import FactoryMethodPattern.Interface.Transport;

public class Ship implements Transport {
    public void delivery(){
        System.out.println("Delivered using Ship");
    }
}
