package AbstractFactoryPattern.ConcreteFactories;

import AbstractFactoryPattern.AbstractFactory.FurnitureFactory;
import AbstractFactoryPattern.ConcreteProduct.Modern.ModernChair;
import AbstractFactoryPattern.ConcreteProduct.Modern.ModernCoffeeTable;
import AbstractFactoryPattern.ConcreteProduct.Modern.ModernSofa;
import AbstractFactoryPattern.ProductInterface.Chair;
import AbstractFactoryPattern.ProductInterface.CoffeeTable;
import AbstractFactoryPattern.ProductInterface.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
    
}
