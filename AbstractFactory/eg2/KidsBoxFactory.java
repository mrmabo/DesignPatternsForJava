package AbstractFactory.eg2;

public class KidsBoxFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new KidsBoxProduct();
	}

}
