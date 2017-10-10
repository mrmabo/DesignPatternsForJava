package State.hm;

public class Regular implements State {
	
	Driving driving;
	
	public Regular(Driving driving){
		this.driving=driving;
	}

	@Override
	public int turnLeft() {
        return 5;
	}

	@Override
	public int turnRight() {
        return 5;
	}

	@Override
	public int accerlate() {
        return 9;
	}

	@Override
	public int brake() {
        return 8;
	}

}
