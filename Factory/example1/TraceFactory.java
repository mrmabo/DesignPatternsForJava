package Factory.example1;

public class TraceFactory implements Factory {

    private static Factory factory = new TraceFactory();

    private TraceFactory(){}

    public static Factory getInstance() {
        return factory;
    }

    @Override
    public Trace createTrace(String type) {

        Trace trace = null;

        if(type.equalsIgnoreCase("trace.log")){
            trace = new FileTrace();
        } else if(type.equalsIgnoreCase("console")){
            trace = new ConsoleTrace();
        }

        return trace;
    }
}
