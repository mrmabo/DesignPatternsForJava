package AbstractFactory.eg2;

public class BusinessBagFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new BusinessBagProduct();
	}
}
