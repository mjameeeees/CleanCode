package CleanCode.DesignPattern.FactoryMethodPattern.Creator;

import CleanCode.DesignPattern.FactoryMethodPattern.Interface.Transport;

public abstract class Logistics{
        //Factory Method Declaration
        public abstract Transport createTransport();

        public void planDelivery(){
            Transport transport = createTransport();
            transport.delivery();
    }
}