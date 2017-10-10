package Adapter.base;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.Request();
    }
}
