package PrototypePattern;

import PrototypePattern.ConcretePrototype.ConcretePrototype;
import PrototypePattern.IProtoype.IProtoype;

public class Client {
    public static void main(String[] args) {
        IProtoype prototype = new ConcretePrototype(null, "Mark James Dinong Object");
        prototype.clone();
        prototype.showInfo();
    }
}
