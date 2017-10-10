package Mediator.base;

public class ConcreteMediatorA extends Mediator {

    private ConcreteColleageA concreteColleageA;
    private ConcreteColleageB concreteColleageB;

    public void setConcreteColleageA(ConcreteColleageA concreteColleageA) {
        this.concreteColleageA = concreteColleageA;
    }

    public void setConcreteColleageB(ConcreteColleageB concreteColleageB) {
        this.concreteColleageB = concreteColleageB;
    }

    @Override
    public void send(String message, Colleage colleage) {

        if(colleage == concreteColleageA){
            concreteColleageB.Notify(message);
        }

        if(colleage == concreteColleageB){
            concreteColleageA.Notify(message);
        }

    }
}
