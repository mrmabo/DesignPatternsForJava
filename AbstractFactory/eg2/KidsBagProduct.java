package AbstractFactory.eg2;

public class KidsBagProduct implements Packaging {

	@Override
	public float getCost() {
		return 0.25f;
	}

	@Override
	public String getPackType() {
		return "Micky";
	}

}
