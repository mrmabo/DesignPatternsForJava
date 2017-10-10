package Singleton.eg;

public class Main {

    public static void testSingleton(){
        for (int i = 0 ; i < 10 ; i++){
            UnThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingletonBetter.INSTANCE.setName("12");
        }
    }

    public static void testSingletonThreadSafe(){
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    UnThreadSafeSingleton.getInstance();
                    ThreadSafeSingleton.getInstance();
                    ThreadSafeSingletonBetter.INSTANCE.setName("12");
                }
            }.start();
        }
    }

    public static void main(String[] args) {

//        Main.testSingleton();
        Main.testSingletonThreadSafe();

    }
}
