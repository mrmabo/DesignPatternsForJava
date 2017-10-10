package Interpreter.base;

public class TerminalExpression extends abstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("terminal expression");
    }
}
