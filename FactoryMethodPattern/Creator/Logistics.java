package FactoryMethodPattern.Creator;

import FactoryMethodPattern.Interface.Transport;

public abstract class Logistics{
        //Factory Method Declaration
        public abstract Transport createTransport();

        public void planDelivery(){
            Transport transport = createTransport();
            transport.delivery();
    }
}