package Visitor.eg;

public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success s = new Success();

        o.display(s);
    }
}
