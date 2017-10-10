package Interpreter.base;

public class NonTerminalExpression extends abstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("not terminal expression");
    }
}
