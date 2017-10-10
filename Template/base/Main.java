package Template.base;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();

        abstractClass.templateMethod();
    }
}
