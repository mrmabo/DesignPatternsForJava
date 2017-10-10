package AbstractFactory.eg2;

public class KidsBoxProduct implements Packaging {

	@Override
	public float getCost() {
		return 0.50f;
	}

	@Override
	public String getPackType() {
		return "Cartoon";
	}

}
