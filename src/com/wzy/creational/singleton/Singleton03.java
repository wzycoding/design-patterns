package com.wzy.creational.singleton;

/**
 * 静态内部类实现单例
 * Created by wzy on 2020-06-09.
 */
public class Singleton03 {
    /**
     * 静态内部类中的静态成员变量，如果不访问，就不会被初始化
     */
    private static class SingletonHolder {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    /**
     * 私有化构造函数
     */
    private Singleton03() {
        System.out.println("创建了Singleton03对象");
    }

    /**
     * 获取单例对象
     * @return 单例对象
     */
    public static Singleton03 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
