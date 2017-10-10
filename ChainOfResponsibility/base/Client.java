package ChainOfResponsibility.base;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = new int[]{2, 5, 22, 17, 23, 3, 14};

        for (int i = 0; i < requests.length; i++) {
            h1.HandleRequest(requests[i]);
        }
    }
}
