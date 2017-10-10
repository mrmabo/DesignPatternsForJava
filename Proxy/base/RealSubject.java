package Proxy.base;

public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("true request");
    }
}
