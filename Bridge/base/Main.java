package Bridge.base;

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstractionA();

        abstraction.setImplemetor(new ConcreteImplementorA());
        abstraction.Operation();

        abstraction.setImplemetor(new ConcreteImplementorB());
        abstraction.Operation();

        Abstraction abstraction1 = new RefinedAbstractionB();
        abstraction1.setImplemetor(new ConcreteImplementorB());
        abstraction1.Operation();

        abstraction1.setImplemetor(new ConcreteImplementorC());
        abstraction1.Operation();

    }
}
