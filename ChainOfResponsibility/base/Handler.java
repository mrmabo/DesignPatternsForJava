package ChainOfResponsibility.base;

public abstract class Handler {
    protected Handler successor;
    public void setSuccessor(Handler successor){  //set the successor;
        this.successor = successor;
    }
    public abstract void HandleRequest(int request);
}
