package FactoryAbstractPattern.Factory;

import FactoryAbstractPattern.Product.Product;

public abstract class CreateProduct {
    public abstract Product doWrapper();

    public void displayProduct(){
        Product p = doWrapper();
        p.wrapper();

    }
      
}
