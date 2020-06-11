package com.wzy.behaviour.Interpreter;

/**
 * description: AndExpression <br>
 * date: 2020-06-11 10:24 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;

    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
