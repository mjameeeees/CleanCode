package AbstractFactoryPattern.ConcreteFactories;

import AbstractFactoryPattern.AbstractFactory.FurnitureFactory;
import AbstractFactoryPattern.ConcreteProduct.ArtDeco.ArtDecoChair;
import AbstractFactoryPattern.ConcreteProduct.ArtDeco.ArtDecoCoffeeTable;
import AbstractFactoryPattern.ConcreteProduct.ArtDeco.ArtDecoSofa;
import AbstractFactoryPattern.ProductInterface.Chair;
import AbstractFactoryPattern.ProductInterface.CoffeeTable;
import AbstractFactoryPattern.ProductInterface.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
    
}
