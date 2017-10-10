package AbstractFactory.eg2;

public class KidsWrapFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new KidsWrapProduct();
	}

}
