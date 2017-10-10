package Command.example2;

public class MoveCommand implements Command {

    private Receiver receiver = new Receiver();;
    private int moveNum;

    public MoveCommand() {
    }

    @Override
    public boolean create(int slide) {
        return receiver.createSquare(slide);
    }

    @Override
    public boolean scale(int num) {
        return receiver.scaleSquare(num);
    }

    @Override
    public boolean move(int num) {
        moveNum = num;
        return receiver.moveSquare(num);
    }

    @Override
    public boolean undo() {
        return receiver.moveSquare(-1 * moveNum);
    }

    @Override
    public String toString() {
        return "move";
    }
}
