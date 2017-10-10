package State.hm;

public class DrivingTest {

    public static void main(String[] args) {

        Driving driving = new Driving();
        //Regular
        State state = new Regular(driving);
        System.out.println(state.accerlate());
        System.out.println(state.turnLeft());
        System.out.println(state.turnRight());
        System.out.println(state.brake());
        //Gravel
        State state1 = new Gravel(driving);
        System.out.println(state1.accerlate());
        System.out.println(state1.turnLeft());
        System.out.println(state1.turnRight());
        System.out.println(state1.brake());

        //Wet
        State state2 = new Wet(driving);
        System.out.println(state2.accerlate());
        System.out.println(state2.turnLeft());
        System.out.println(state2.turnRight());
        System.out.println(state2.brake());

        //Ice
        State state3 = new Wet(driving);
        System.out.println(state3.accerlate());
        System.out.println(state3.turnLeft());
        System.out.println(state3.turnRight());
        System.out.println(state3.brake());
    }

}
