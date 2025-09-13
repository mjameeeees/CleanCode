package AbstractFactoryPattern.ConcreteProduct.ArtDeco;
import AbstractFactoryPattern.ProductInterface.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void placeOn() {
        System.out.println("Putting on an Art Deco coffee table.");
    }
}
