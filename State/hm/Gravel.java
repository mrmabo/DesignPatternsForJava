package State.hm;

public class Gravel implements State {

    Driving driving;

    public Gravel(Driving driving) {
        this.driving = driving;
    }


    @Override
    public int turnLeft() {
        return 3;
    }

    @Override
    public int turnRight() {
        return 3;
    }

    @Override
    public int accerlate() {
        return 7;
    }

    @Override
    public int brake() {
        return 6;
    }

}
