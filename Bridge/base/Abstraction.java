package Bridge.base;

public abstract class Abstraction {
    protected Implemetor implemetor;

    public void setImplemetor(Implemetor implemetor) {
        this.implemetor = implemetor;
    }

    public void Operation(){
        implemetor.OperationImpl();
    }
}
