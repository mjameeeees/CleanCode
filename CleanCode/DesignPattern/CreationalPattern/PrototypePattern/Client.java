package PrototypePattern;

import PrototypePattern.ConcretePrototype.ConcretePrototype;
import PrototypePattern.IProtoype.IProtoype;
import PrototypePattern.SubclassPrototype.SubclassPrototype;

public class Client {
    public static void main(String[] args) {
        IProtoype prototype = new ConcretePrototype(null, "Mark James Dinong Object");
        prototype.clone();
        prototype.showInfo();

        IProtoype clonedPrototype = prototype.clone();
        clonedPrototype.showInfo();

        IProtoype anotherClone = new SubclassPrototype(clonedPrototype, null);
        anotherClone.showInfo();
    }
}
