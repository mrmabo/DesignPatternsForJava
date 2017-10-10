package Visitor.base;

public class ConcreteElementA extends Element {

    @Override
    public void Accept(Visitor visitor) {
        visitor.visitorConcreteElementA(this);
    }
}
