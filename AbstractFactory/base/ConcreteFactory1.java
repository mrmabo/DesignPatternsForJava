package AbstractFactory.base;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    AbstractProductA CreateProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB CreateProductB() {
        return new ProductB1();
    }
}
