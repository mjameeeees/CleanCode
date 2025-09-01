package CleanCode.DesignPattern.FactoryMethodPattern.ConcreteCreator;

import CleanCode.DesignPattern.FactoryMethodPattern.ConcreteProduct.Ship;
import CleanCode.DesignPattern.FactoryMethodPattern.Creator.Logistics;
import CleanCode.DesignPattern.FactoryMethodPattern.Interface.Transport;

public class ShipLogistics extends Logistics {
    @Override
    public Tranport createTransport(){
        return new Ship();
    }
}
