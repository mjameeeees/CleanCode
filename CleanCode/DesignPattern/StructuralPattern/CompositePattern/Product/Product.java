package StructuralPattern.CompositePattern.Product;

import StructuralPattern.CompositePattern.IItem.IItem;

public class Product implements IItem {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getPrice(){
        return price;
    }

}
