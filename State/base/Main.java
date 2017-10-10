package State.base;

public class Main {
    public static void main(String[] args) {
        Context c = new Context(new ContreteStateA());

        c.Request();
        c.Request();
        c.Request();
    }
}
