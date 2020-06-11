package com.wzy.behaviour.Interpreter;

/**
 * description: TerminalExpression <br>
 * date: 2020-06-10 18:24 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
