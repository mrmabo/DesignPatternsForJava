package Bridge.base;

public class RefinedAbstractionB extends Abstraction {

    @Override
    public void Operation() {
        System.out.println("B");
        super.Operation();
    }
}
