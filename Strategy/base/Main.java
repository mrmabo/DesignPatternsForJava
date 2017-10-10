package Strategy.base;

public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ContreteStragegyA());
        context.ContextInterface();

        context = new Context(new ContreteStragegyB());
        context.ContextInterface();
    }
}
