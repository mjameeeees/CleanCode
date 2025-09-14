package StructuralPattern.BridgePattern.ConcreteColor;

import StructuralPattern.BridgePattern.IColor.IColor;

public class Blue implements IColor {
    @Override
    public void applyColor(){
        System.out.println("Applying Color Blue");
    }
}
