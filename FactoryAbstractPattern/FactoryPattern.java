package FactoryAbstractPattern;

import FactoryAbstractPattern.ConcreteFactory.ProductCreator;
import FactoryAbstractPattern.Factory.CreateProduct;

public class FactoryPattern {
    public static void main(String[] args) {
        CreateProduct a = new ProductCreator();
        a.displayProduct();
    }
}
