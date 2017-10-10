package Interpreter.hm;

public class Operate {

    String operator;
    int a;
    int b;

    public Operate(String operator, int a, int b) {
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    public int processExpression() {
        if (this.operator.equals("+")) {
            return a + b;
        } else if (this.operator.equals("-")) {
            return a - b;
        } else if (this.operator.equals("*")) {
            return a * b;
        } else if (this.operator.equals("/")) {
            if (b == 0)
                return 0;
            else
                return a / b;
        }
        return 0;
    }

}
