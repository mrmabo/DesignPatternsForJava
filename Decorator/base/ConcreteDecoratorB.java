package Decorator.base;

public class ConcreteDecoratorB extends Decorator {

    private void print(){
        System.out.println("Concrete Decorator B inner method print");
    }

    @Override
    public void Operation() {
        super.Operation();
        print();
    }
}
