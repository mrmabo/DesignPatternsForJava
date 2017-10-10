package Decorator.hm2;


public class Client {
    public static void main(String[] args) {
        Decorator d = new AddDecorator(new AddDecorator(new ArrayListProfiler()));
        d.excute();

        Decorator d1 = new SizeDecorator(new AddDecorator(new LinkedListProfiler()));
        d1.excute();
    }
}
