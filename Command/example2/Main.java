package Command.example2;

import java.util.Stack;

public class Main {
    private Command currentCommand = null;
    private Stack<Command> commandsExecuted = new Stack<Command>();

    public void squareCommand(){
        currentCommand = new CreateCommand();
        if(currentCommand.create(4)){
            commandsExecuted.push(currentCommand);
        } else {
            System.out.println("create fail");
        }

        currentCommand = new ScaleCommand();
        if(currentCommand.scale(2)){
            commandsExecuted.push(currentCommand);
        } else {
            System.out.println("scale fail");
        }

        currentCommand = new MoveCommand();
        if(currentCommand.move(2)){
            commandsExecuted.push(currentCommand);
        } else {
            System.out.println("move fail");
        }

        currentCommand = new ScaleCommand();
        if(currentCommand.scale(2)){
            commandsExecuted.push(currentCommand);
        } else {
            System.out.println("scale fail");
        }

        System.out.println(currentCommand);
        commandsExecuted.pop().undo();
        System.out.println(currentCommand);


        currentCommand = new ScaleCommand();
        if(currentCommand.scale(2)){
            commandsExecuted.push(currentCommand);
        } else {
            System.out.println("scale fail");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.squareCommand();
    }
}
