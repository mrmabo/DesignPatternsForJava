package Visitor.base;

public class ConcreteVisitor2 extends Visitor {

    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("2 concreteElementA");
    }

    @Override
    public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("2 concreteElementB");
    }
}
