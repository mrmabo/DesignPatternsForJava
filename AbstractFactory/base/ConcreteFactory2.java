package AbstractFactory.base;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    AbstractProductA CreateProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB CreateProductB() {
        return new ProductB2();
    }
}
