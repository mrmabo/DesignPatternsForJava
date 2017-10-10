package AbstractFactory.eg2;

public class AdultsBoxFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new AdultsBoxProduct();
	}

}
