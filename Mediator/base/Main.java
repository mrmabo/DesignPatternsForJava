package Mediator.base;

public class Main {
    public static void main(String[] args) {
        ConcreteMediatorA m = new ConcreteMediatorA();

        ConcreteColleageA c1 = new ConcreteColleageA(m);
        ConcreteColleageB c2 = new ConcreteColleageB(m);

        m.setConcreteColleageA(c1);
        m.setConcreteColleageB(c2);

        c1.send("AAAA");
        c2.send("BBBB");
    }
}
