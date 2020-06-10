package com.wzy.behaviour.chain;

/**
 * description: FileLogger <br>
 * date: 2020-06-10 16:33 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
