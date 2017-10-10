package Mediator.base;

public class ConcreteColleageA extends Colleage {

    public ConcreteColleageA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void Notify(String message){
        System.out.println("colleage A print : " + message);
    }
}
