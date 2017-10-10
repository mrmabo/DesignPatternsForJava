package Decorator.base;

public class ConcreteDecoratorA extends Decorator {
    private int index = 1;

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("Concrete Decorator A index = " + index);
    }
}
