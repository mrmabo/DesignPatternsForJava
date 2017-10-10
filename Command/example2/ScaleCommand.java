package Command.example2;

public class ScaleCommand implements Command {
    private Receiver receiver = new Receiver();;

    private int slideNum;

    public ScaleCommand() {
    }

    @Override
    public boolean create(int slide) {
        return receiver.createSquare(slide);
    }

    @Override
    public boolean scale(int num) {
        slideNum = num;
        return receiver.scaleSquare(num);
    }

    @Override
    public boolean move(int num) {
        return receiver.moveSquare(num);
    }

    @Override
    public boolean undo() {
        return receiver.unDoScaleSquare(slideNum);
    }

    @Override
    public String toString() {
        return "scale";
    }
}
