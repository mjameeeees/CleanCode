package FactoryMethodPattern.ConcreteCreator;

import FactoryMethodPattern.Creator.Creator;
import FactoryMethodPattern.ITransport.ITransport;

public class Truck extends Creator {
    @Override
    public ITransport transportCreator() {
        return new FactoryMethodPattern.ConcreteProduct.Truck();
    }
    
}
