package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.ProductInterface.Chair;
import AbstractFactoryPattern.ProductInterface.CoffeeTable;
import AbstractFactoryPattern.ProductInterface.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
