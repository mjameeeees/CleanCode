package AbstractFactoryPattern.ConcreteProduct.Victorian;

import AbstractFactoryPattern.ProductInterface.Sofa;

public class VictorianSofa implements Sofa{
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa.");
    }
}
