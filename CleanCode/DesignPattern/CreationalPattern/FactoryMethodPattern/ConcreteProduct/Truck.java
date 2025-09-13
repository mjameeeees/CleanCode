package FactoryMethodPattern.ConcreteProduct;

import FactoryMethodPattern.ITransport.ITransport;

public class Truck implements ITransport{
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box");
    }
    
}
