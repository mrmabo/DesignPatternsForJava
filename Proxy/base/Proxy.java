package Proxy.base;

public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}
