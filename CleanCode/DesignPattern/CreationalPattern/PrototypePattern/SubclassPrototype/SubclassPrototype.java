package PrototypePattern.SubclassPrototype;

import PrototypePattern.ConcretePrototype.ConcretePrototype;
import PrototypePattern.IProtoype.IProtoype;

public class SubclassPrototype extends ConcretePrototype {
    protected String name;

    public SubclassPrototype(IProtoype field, String name) {
        super(field, name);
        this.name = name;
    }

    @Override
    public IProtoype clone() {
        return new SubclassPrototype(this.field, this.name);
    }
    
}
