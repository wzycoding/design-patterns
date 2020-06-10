package com.wzy.behaviour.chain;

/**
 * description: ChainPatternDemo <br>
 * date: 2020-06-10 16:45 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "这是一条Info日志");
        loggerChain.logMessage(AbstractLogger.DEBUG, "这是一条Debug日志");
        loggerChain.logMessage(AbstractLogger.ERROR, "这是一条Error日志");
    }
}
