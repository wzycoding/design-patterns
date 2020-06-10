package com.wzy.behaviour.chain;

/**
 * description: ConsoleLogger <br>
 * date: 2020-06-10 16:25 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
