package Interpreter.hm;

public class Expression {
    String input;

    public Expression(String input) {
        this.input = input;
    }

    public int interpret() {

        String[] stokens = input.split(" ");
        String[] values = new String[7];
        Operate paraExpression1 = new Operate(stokens[1], Integer.parseInt(stokens[2]), Integer.parseInt(stokens[3]));
        Operate paraExpressioin2 = new Operate(stokens[4], Integer.parseInt(stokens[5]), Integer.parseInt(stokens[6]));
        int value1 = paraExpression1.processExpression();
        int value2 = paraExpressioin2.processExpression();
        Operate resultExpressioin = new Operate(stokens[0], value1, value2);
        return resultExpressioin.processExpression();
    }

}
