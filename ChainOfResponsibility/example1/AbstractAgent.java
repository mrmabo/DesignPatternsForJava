package ChainOfResponsibility.example1;

public abstract class AbstractAgent {
    protected AbstractAgent nextAgent;

    abstract public void checkRecord(CallRecord record);
}
