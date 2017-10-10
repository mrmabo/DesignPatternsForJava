package Factory.example1;

public class ConsoleTrace implements Trace {

    private boolean debug = false;

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if(debug){
            System.out.println("debug message : " + message);
        }
    }

    @Override
    public void error(String message) {
        if(debug){
            System.out.println("error message : " + message);
        }
    }
}
