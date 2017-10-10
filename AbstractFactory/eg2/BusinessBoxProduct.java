package AbstractFactory.eg2;

public class BusinessBoxProduct implements Packaging {

	@Override
	public float getCost() {
		return 1.0f;
	}

	@Override
	public String getPackType() {
		return "Hard Plastic";
	}

}
