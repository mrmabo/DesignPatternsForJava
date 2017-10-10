package Proxy.example;

import java.io.IOException;

public class CommandExecutor implements ICommandExecutor {
    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
