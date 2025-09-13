package AbstractFactoryPattern.ConcreteProduct.ArtDeco;
import AbstractFactoryPattern.ProductInterface.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on an Art Deco sofa.");
    }
}
