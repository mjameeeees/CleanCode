package FactoryMethodPattern.ConcreteCreator;
import FactoryMethodPattern.Creator.Creator;
import FactoryMethodPattern.ITransport.ITransport;


public class Ship extends Creator {
    @Override
    public ITransport transportCreator() {
        return new FactoryMethodPattern.ConcreteProduct.Ship();
    }
}