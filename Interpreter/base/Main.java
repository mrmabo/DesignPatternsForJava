package Interpreter.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<abstractExpression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());

        for (abstractExpression expression: list) {
            expression.interpret(context);
        }
    }
}
