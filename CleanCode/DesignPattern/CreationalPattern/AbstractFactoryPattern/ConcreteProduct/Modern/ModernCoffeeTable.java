package AbstractFactoryPattern.ConcreteProduct.Modern;

import AbstractFactoryPattern.ProductInterface.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeOn() {
        System.out.println("Placing items on a modern coffee table.");
    }
}
