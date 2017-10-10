package Adapter.hm2;

public interface Target2 { //queue
    public void enqueue(String str);

    public String dequeue();

    public boolean isEmpty();

    public int size();
}
