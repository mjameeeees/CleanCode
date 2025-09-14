package StructuralPattern.BridgePattern.AbstractShape;

import StructuralPattern.BridgePattern.IColor.IColor;

public abstract class Shape {
    protected IColor color;

    public Shape (IColor color){
        this.color = color;
    }

    public abstract void draw();
}
