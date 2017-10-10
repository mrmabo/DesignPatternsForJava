package Interpreter.hm;

public class ExpressionMain {
    public static void main(String[] args) {
        //return 9
        String tokenString = "- + 10 5 - 8 2";
        Expression expression = new Expression(tokenString);
        System.out.println(expression.interpret());
        //return 90
        String tokenString2 = "* + 10 5 - 8 2";
        Expression expression2 = new Expression(tokenString2);
        System.out.println(expression2.interpret());
    }
}
