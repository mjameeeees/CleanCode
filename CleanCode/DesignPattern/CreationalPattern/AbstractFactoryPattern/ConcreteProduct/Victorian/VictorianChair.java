package AbstractFactoryPattern.ConcreteProduct.Victorian;

import AbstractFactoryPattern.ProductInterface.Chair;
public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}
