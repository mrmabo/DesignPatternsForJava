package State.hm;

public class Driving {

    private State regular;
    private State gravel;
    private State wet;
    private State ice;

    private State state = regular;//current state


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Driving() {
        regular = new Regular(this);
        gravel = new Gravel(this);
        wet = new Wet(this);
        ice = new Ice(this);
    }

    public int turnLeft() {
        return state.turnLeft();
    }

    public int trunRight() {
        return state.turnRight();
    }

    public int accerlate() {
        return state.accerlate();
    }

    public int brake() {
        return state.brake();
    }

    public State getRegular() {
        return regular;
    }

    public void setRegular(State regular) {
        this.regular = regular;
    }

    public State getGravel() {
        return gravel;
    }

    public void setGravel(State gravel) {
        this.gravel = gravel;
    }

    public State getWet() {
        return wet;
    }

    public void setWet(State wet) {
        this.wet = wet;
    }

    public State getIce() {
        return ice;
    }

    public void setIce(State ice) {
        this.ice = ice;
    }


}
