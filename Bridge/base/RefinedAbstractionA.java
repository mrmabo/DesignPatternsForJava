package Bridge.base;

public class RefinedAbstractionA extends Abstraction {

    @Override
    public void Operation() {
        System.out.println("A");
        super.Operation();
    }
}
