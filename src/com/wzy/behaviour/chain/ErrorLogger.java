package com.wzy.behaviour.chain;

/**
 * description: ErrorLogger <br>
 * date: 2020-06-10 16:30 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
