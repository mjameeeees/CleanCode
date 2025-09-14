package StructuralPattern.BridgePattern.ConcreteShape;

import StructuralPattern.BridgePattern.AbstractShape.Shape;
import StructuralPattern.BridgePattern.IColor.IColor;

public class Circle extends Shape {
    public Circle(IColor color){
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
        color.applyColor();
    }
}
