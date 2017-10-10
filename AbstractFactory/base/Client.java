package AbstractFactory.base;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new ConcreteFactory1();

        AbstractProductA abstractProductA1 = abstractFactory1.CreateProductA();

        abstractProductA1.show();

        AbstractProductB abstractProductB1 = abstractFactory1.CreateProductB();

        abstractProductB1.print();



        AbstractFactory abstractFactory2 = new ConcreteFactory2();

        AbstractProductA abstractProductA2 = abstractFactory2.CreateProductA();
        abstractProductA2.show();

        AbstractProductB abstractProductB2 = abstractFactory2.CreateProductB();

        abstractProductB2.print();
    }
}
