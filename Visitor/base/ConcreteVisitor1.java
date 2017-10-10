package Visitor.base;

public class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("1 concreteElementA");
    }

    @Override
    public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("1 concreteElementB");
    }
}
