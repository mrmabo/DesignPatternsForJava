package Prototype.base;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1();
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();
        System.out.println(p1);
        System.out.println(c1);
    }
}
