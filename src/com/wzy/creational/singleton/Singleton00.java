package com.wzy.creational.singleton;

/**
 * Created by wzy on 2020-06-09.
 */
public class Singleton00 {
    /**
     * 饿汉式单例对象
     */
    private static Singleton00 instance = new Singleton00();

    /**
     * 私有化构造函数
     */
    private Singleton00() {

    }

    /**
     * 获取单例对象
     * @return 单例对象
     */
    public static Singleton00 getInstance() {
        return instance;
    }

    /**
     * 打印HelloWorld
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
