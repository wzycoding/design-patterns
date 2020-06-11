package com.wzy.behaviour.Interpreter;

/**
 * description: OrExpression <br>
 * date: 2020-06-10 18:30 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;

    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
