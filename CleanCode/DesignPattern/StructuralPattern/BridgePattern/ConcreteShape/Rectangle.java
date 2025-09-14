package StructuralPattern.BridgePattern.ConcreteShape;

import StructuralPattern.BridgePattern.AbstractShape.Shape;
import StructuralPattern.BridgePattern.IColor.IColor;

public class Rectangle extends Shape {
    public Rectangle(IColor color){
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
        color.applyColor();
    }
}