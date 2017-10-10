package Singleton.eg;

public class MyThread extends Thread {
    @Override
    public void run() {
        UnThreadSafeSingleton.getInstance();
    }
}
