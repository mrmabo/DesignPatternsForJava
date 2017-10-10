package Flyweight.base;

public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("conrete flyweight : " + extrinsicstate);
    }
}
