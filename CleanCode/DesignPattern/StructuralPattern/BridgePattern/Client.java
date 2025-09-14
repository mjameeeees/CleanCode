package StructuralPattern.BridgePattern;

import StructuralPattern.BridgePattern.AbstractShape.Shape;
import StructuralPattern.BridgePattern.ConcreteColor.Blue;
import StructuralPattern.BridgePattern.ConcreteColor.Red;
import StructuralPattern.BridgePattern.ConcreteShape.Circle;
import StructuralPattern.BridgePattern.IColor.IColor;

public class Client {
    public static void main(String[] args) {
        IColor red = new Red();
        IColor blue = new Blue();
        Shape redCircle = new Circle(red);
        Shape blueCircle = new Circle(blue);
        redCircle.draw();
        blueCircle.draw();
        
    }
}
