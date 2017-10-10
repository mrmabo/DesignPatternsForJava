package AbstractFactory.eg2;

public class AdultsBoxProduct implements Packaging {

	@Override
	public float getCost() {
		return 0.25f;
	}

	@Override
	public String getPackType() {
		return "Plain Paper";
	}

}
