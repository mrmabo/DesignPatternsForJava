package Command.example2;

public interface Command {
    boolean create(int slide);
    boolean scale(int num);
    boolean move(int num);
    boolean undo();
}
