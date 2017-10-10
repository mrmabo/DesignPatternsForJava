package Flyweight.base;

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("unshared concrete flyweight : " + extrinsicstate);
    }
}
