package StructuralPattern.BridgePattern.ConcreteColor;

import StructuralPattern.BridgePattern.IColor.IColor;

public class Red implements IColor {
    @Override
    public void applyColor(){
        System.out.println("Applying color Red");
    }
}
