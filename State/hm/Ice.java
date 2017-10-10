package State.hm;

public class Ice implements State {

    Driving driving;

    public Ice(Driving driving) {
        this.driving = driving;
    }

    @Override
    public int turnLeft() {
        return 1;
    }

    @Override
    public int turnRight() {
        return 1;
    }

    @Override
    public int accerlate() {
        return 3;
    }

    @Override
    public int brake() {
        return 2;
    }

}
