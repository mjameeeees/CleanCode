package StructuralPattern.CompositePattern.Box;

import java.util.ArrayList;
import java.util.List;

import StructuralPattern.CompositePattern.IItem.IItem;

public class Box implements IItem {
    private String name;
    private double packagingCost;
    private List<IItem> items = new ArrayList<>();

    public Box(String name , double packagingCost){
        this.name = name;
        this.packagingCost = packagingCost;
    }

    public void addItem(IItem item){
        items.add(item);
        }

        @Override
        public double getPrice(){
            double total = packagingCost;

             for (IItem item : items) {
            total += item.getPrice();
            }
            return total;
        }


    @Override
    public String getName() {
        return name;
    }


}
