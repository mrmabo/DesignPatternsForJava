package Command.example2;

public class CreateCommand implements Command {

    private Receiver receiver = new Receiver();;
//    private Square square;

    CreateCommand(){
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
        return receiver.moveSquare(num);
    }

    @Override
    public boolean undo() {
        return receiver.destorySquare();
    }

    @Override
    public String toString() {
        return "create";
    }
}
