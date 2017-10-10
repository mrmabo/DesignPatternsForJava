package Visitor.base;

public class ConcreteElementB extends Element{
    @Override
    public void Accept(Visitor visitor) {
        visitor.visitorConcreteElementB(this);
    }
}
