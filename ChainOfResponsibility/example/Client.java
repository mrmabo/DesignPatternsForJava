package ChainOfResponsibility.example;

import sun.misc.Request;

public class Client {
    private ChainBuilder chain; //can be injected or received from a constructor
    public void sendRequest(Request request) {
        chain.getHandler().handleRequest(request);
    }
}
