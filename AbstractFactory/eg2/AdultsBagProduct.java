package AbstractFactory.eg2;

public class AdultsBagProduct implements Packaging {

	@Override
	public float getCost() {
		return 0.5f;
	}

	@Override
	public String getPackType() {
		return "Reusable Shopper";
	}

}
