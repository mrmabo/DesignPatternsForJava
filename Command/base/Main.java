package Command.base;

public class Main {

    public static void main(String[] args) {
        Receiver r = new Receiver();

        Command aCommand = new ConcreteCommand(r);
        Invoker invoker = new Invoker();
        invoker.addCommand(aCommand);
//        invoker.removeCommand(aCommand);
        invoker.excuteCommand();
    }
}
