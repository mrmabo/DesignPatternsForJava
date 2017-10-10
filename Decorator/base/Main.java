package Decorator.base;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        a.setCompenent(concreteComponent);

        b.setCompenent(a);

        b.Operation();
    }
}
