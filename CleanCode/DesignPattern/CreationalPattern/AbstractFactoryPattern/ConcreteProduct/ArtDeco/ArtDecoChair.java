package AbstractFactoryPattern.ConcreteProduct.ArtDeco;

import AbstractFactoryPattern.ProductInterface.Chair;
public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an Art Deco chair.");
    }
}
