package Prototype.base;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(Prototype example){
        Prototype copyPrototype = (Prototype) prototype.clone();

    }
}
