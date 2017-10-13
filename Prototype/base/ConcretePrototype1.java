package Prototype.base;

public class ConcretePrototype1 extends Prototype {

    public Prototype clone(){
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
