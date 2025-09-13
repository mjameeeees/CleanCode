package FactoryMethodPattern.ConcreteProduct;

import FactoryMethodPattern.ITransport.ITransport;

public class Ship implements ITransport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container");
    }
}
