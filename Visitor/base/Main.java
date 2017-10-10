package Visitor.base;

public class Main {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.attach(new ConcreteElementA());
        os.attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        os.accept(v1);
        os.accept(v2);

    }
}
