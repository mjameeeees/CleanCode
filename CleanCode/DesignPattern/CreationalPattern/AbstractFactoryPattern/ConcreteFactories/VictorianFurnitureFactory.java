package AbstractFactoryPattern.ConcreteFactories;

import AbstractFactoryPattern.AbstractFactory.FurnitureFactory;
import AbstractFactoryPattern.ConcreteProduct.Victorian.VictorianChair;
import AbstractFactoryPattern.ConcreteProduct.Victorian.VictorianCoffeeTable;
import AbstractFactoryPattern.ConcreteProduct.Victorian.VictorianSofa;
import AbstractFactoryPattern.ProductInterface.Chair;
import AbstractFactoryPattern.ProductInterface.CoffeeTable;
import AbstractFactoryPattern.ProductInterface.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
