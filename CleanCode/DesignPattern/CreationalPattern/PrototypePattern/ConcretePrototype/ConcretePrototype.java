package PrototypePattern.ConcretePrototype;
import PrototypePattern.IProtoype.IProtoype;

public class ConcretePrototype implements IProtoype {
    protected IProtoype field;
    protected String name;

    public ConcretePrototype(IProtoype field, String name) {
        this.field = field;
        this.name = name;
    }

    @Override
    public IProtoype clone() {
        return new ConcretePrototype(this.field, this.name); 
    }

    @Override
    public void showInfo() {
        System.out.println("ConcretePrototype with field: " + (field != null ? field.toString() : name));
    }
        
}
