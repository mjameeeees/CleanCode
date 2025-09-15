package StructuralPattern.CompositePattern;

import StructuralPattern.CompositePattern.Box.Box;
import StructuralPattern.CompositePattern.Product.Product;

public class Client {


    public static void main(String[] args) {
            Product phone = new Product("Samsung OS", 120093);

            Box accessoriesBox = new Box("Accessories Box", 2);
            accessoriesBox.addItem(phone);
            double totalPrice =  accessoriesBox.getPrice();
            System.out.println(totalPrice);
    }
}