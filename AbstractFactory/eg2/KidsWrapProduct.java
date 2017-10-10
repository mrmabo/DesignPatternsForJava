package AbstractFactory.eg2;

public class KidsWrapProduct implements Packaging {

	@Override
	public float getCost() {
		return 0.10f;
	}

	@Override
	public String getPackType() {
		return "Happy Kid";
	}

}
