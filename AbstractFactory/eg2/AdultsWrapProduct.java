package AbstractFactory.eg2;

public class AdultsWrapProduct implements Packaging {

	@Override
	public float getCost() {
		return 0f;
	}

	@Override
	public String getPackType() {
		return "Everyday Value";
	}

}
