package FactoryMethodPattern.ConcreteCreator;

import FactoryMethodPattern.ConcreteProduct.Ship;
import FactoryMethodPattern.Creator.Logistics;
import FactoryMethodPattern.Interface.Transport;

public class ShipLogistics extends Logistics {
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}
