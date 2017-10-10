package State.hm;

public class Wet implements State {
	
    Driving driving;
	
	public Wet(Driving driving){
		this.driving=driving;
	}

	@Override
	public int turnLeft() {
		return 4;
	}

	@Override
	public int turnRight() {
		return 4;
	}

	@Override
	public int accerlate() {
		return 9;
	}

	@Override
	public int brake() {
		return 7;
	}

}
