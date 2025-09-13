package FactoryMethodPattern.Creator;

import FactoryMethodPattern.ITransport.ITransport;

public abstract class Creator {
    public abstract ITransport transportCreator();

    public void planDelivery(){
        ITransport transport = transportCreator();
        transport.deliver();
    }
}
