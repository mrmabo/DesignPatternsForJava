package AbstractFactory.eg2;

public class AdultsBagFactory implements IFactory {
    @Override
    public Packaging produce() {
        return new AdultsBagProduct();
    }
}
