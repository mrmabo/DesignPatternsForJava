package ChainOfResponsibility.example1;

public class Chain {

    private ChainBuilder chain;

    Chain(){
        chain = new ChainBuilder();
        chain.buildChain();
    }

    public void sendRequest(CallRecord record) {
        chain.getHandler().checkRecord(record);
    }

}
