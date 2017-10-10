package Composite.base;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");

        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        root.display(1);

    }
}
