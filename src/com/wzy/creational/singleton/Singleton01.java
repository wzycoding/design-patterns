package com.wzy.creational.singleton;

/**
 * 线程不安全的懒汉模式
 * Created by wzy on 2020-06-09.
 */
public class Singleton01 {

    /**
     * 饿汉模式单例对象
     */
    private static Singleton01 instance = null;

    /**
     * 私有化
     */
    private Singleton01() {

    }

    /**
     * 获取单例对象
     * @return 单例对象
     */
    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }

    /**
     * 打印信息
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
