package Mediator.base;

public class ConcreteColleageB extends Colleage {

    public ConcreteColleageB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void Notify(String message){
        System.out.println("colleage B print : " + message);
    }
}
