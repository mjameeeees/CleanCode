package AbstractFactoryPattern;

import AbstractFactoryPattern.AbstractFactory.FurnitureFactory;
import AbstractFactoryPattern.ProductInterface.Chair;
import AbstractFactoryPattern.ProductInterface.CoffeeTable;
import AbstractFactoryPattern.ProductInterface.Sofa;

public class FurnitureShop {
        private Chair chair;
        private Sofa sofa;
        private CoffeeTable coffeeTable;

        public FurnitureShop(FurnitureFactory factory) {
            chair = factory.createChair();
            sofa = factory.createSofa();
            coffeeTable = factory.createCoffeeTable();
        }

        public void showFurniture() {
            chair.sitOn();
            sofa.lieOn();
            coffeeTable.placeOn();
        }
}
