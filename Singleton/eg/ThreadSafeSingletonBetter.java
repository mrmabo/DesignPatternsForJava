package Singleton.eg;

public enum ThreadSafeSingletonBetter {
    INSTANCE;

    private int id;
    private String name;

    private ThreadSafeSingletonBetter() {  //enum constructor must be private
        System.out.println("2222");
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
