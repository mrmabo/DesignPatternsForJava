package Singleton.eg;

public class UnThreadSafeSingleton {
    private static UnThreadSafeSingleton instance = null;
    private int data = 0;

    private UnThreadSafeSingleton(){
        System.out.println("this singleton is not thread safe");
    }

    public static UnThreadSafeSingleton getInstance() {
        if(instance == null){
            instance = new UnThreadSafeSingleton();
        }

        return instance;
    }
}
