package Adapter.hm2;

public class Adapter implements Target1, Target2 {

    private Adaptee adaptee;

    @Override
    public void push(String str) {
        adaptee.add(str);
    }

    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public String peek() {
        return adaptee.get(0);
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }

    @Override
    public int size() {
        return adaptee.getEnd() + 1;
    }

    @Override
    public String dequeue() {
        int start = adaptee.getStart();
        String str = adaptee.get(start);
        adaptee.remove(start);
        return str;
    }

    @Override
    public void enqueue(String str) {
        adaptee.add(str);
    }
}
