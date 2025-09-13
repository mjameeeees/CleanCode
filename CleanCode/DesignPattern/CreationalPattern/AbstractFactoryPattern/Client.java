package AbstractFactoryPattern;

import AbstractFactoryPattern.ConcreteFactories.ModernFurnitureFactory;

public class Client {
    public static void main(String[] args) {
        FurnitureShop modernShop = new FurnitureShop(new ModernFurnitureFactory());
        modernShop.showFurniture();
        }
}
