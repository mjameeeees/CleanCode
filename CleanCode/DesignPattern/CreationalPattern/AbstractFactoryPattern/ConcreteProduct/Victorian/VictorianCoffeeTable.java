package AbstractFactoryPattern.ConcreteProduct.Victorian;

import AbstractFactoryPattern.ProductInterface.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public void placeOn() {
        System.out.println("Placing items on a Victorian coffee table.");
    }
}
