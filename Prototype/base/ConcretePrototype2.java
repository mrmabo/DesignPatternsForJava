package Prototype.base;

public class ConcretePrototype2 extends Prototype {
    public Prototype clone(){
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
