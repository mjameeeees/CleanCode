package FactoryAbstractPattern.ConcreteFactory;

import FactoryAbstractPattern.ConcreteProduct.ProductA;
import FactoryAbstractPattern.Factory.CreateProduct;
import FactoryAbstractPattern.Product.Product;

public class ProductCreator extends CreateProduct {
    public Product doWrapper(){
        return new ProductA();
    }
}
