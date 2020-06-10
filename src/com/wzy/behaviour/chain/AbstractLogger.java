package com.wzy.behaviour.chain;

/**
 * description: AbstractLogger <br>
 * date: 2020-06-10 16:11 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链模式的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 钩子方法
     * @param message 打印日志内容
     */
    abstract protected void write(String message);
}
