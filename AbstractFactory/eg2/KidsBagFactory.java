package AbstractFactory.eg2;

public class KidsBagFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new KidsBagProduct();
	}

}
