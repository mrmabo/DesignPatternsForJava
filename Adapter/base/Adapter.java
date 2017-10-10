package Adapter.base;

public class Adapter extends Target { //pack the Adaptee interface, make this interface to fit the target.
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
