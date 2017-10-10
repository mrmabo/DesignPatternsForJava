package AbstractFactory.eg2;

public class AdultsWrapFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new AdultsWrapProduct();
	}

}
