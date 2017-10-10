package AbstractFactory.eg2;

public class BusinessBagProduct implements Packaging {

	@Override
	public float getCost() {
		return 0.5f;
	}

	@Override
	public String getPackType() {
		return "Merchant Collection";
	}

}
