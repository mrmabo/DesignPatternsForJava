package ChainOfResponsibility.example;

import sun.misc.Request;

public abstract class AbstractAgent {

    protected AbstractAgent nextAgent;

    abstract public void handleRequest(Request req);

    boolean canHandleRequest(Request req){
        return false;
    }
}
