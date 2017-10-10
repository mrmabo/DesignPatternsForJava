package AbstractFactory.eg2;

public class BusinessWrapFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new BusinessWrapProduct();
	}
}
