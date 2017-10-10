package Factory.example1;

public class Client {
    public static void main(String[] args) {
        Factory factory = TraceFactory.getInstance();
        Trace debug1 = factory.createTrace("console");

        debug1.setDebug(false);
        debug1.debug("This is console trace message");
        debug1.error("This is console trace message");

        Trace debug2 = factory.createTrace("trace.log");
        debug2.setDebug(false);
        debug2.debug("This is file trace message");
        debug2.error("This is file trace message");
    }
}
