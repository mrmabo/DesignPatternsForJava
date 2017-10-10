package Singleton.eg;

public class ThreadSafeSingleton {

    private static final ThreadSafeSingleton instance = new ThreadSafeSingleton();

    private ThreadSafeSingleton(){
        System.out.println("this singleton is thread safe");
    }
    public static ThreadSafeSingleton getInstance(){
        return instance;
    }

}
