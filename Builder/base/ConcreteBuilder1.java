package Builder.base;

public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        System.out.println("part A");
    }

    @Override
    public void buildPartB() {
        System.out.println("part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
