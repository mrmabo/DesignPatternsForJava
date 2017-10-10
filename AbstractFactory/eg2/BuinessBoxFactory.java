package AbstractFactory.eg2;

public class BuinessBoxFactory implements IFactory {

	@Override
	public Packaging produce() {
		return new BusinessBoxProduct();
	}
}
