package Factory.example1;

public interface Trace {
    void setDebug(boolean debug);

    void debug(String message);

    void error(String message);
}
