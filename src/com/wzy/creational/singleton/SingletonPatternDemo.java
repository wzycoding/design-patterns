package com.wzy.creational.singleton;

/**
 * 单例模式测试类
 * Created by wzy on 2020-06-09.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取单例对象
        Singleton00 instance1 = Singleton00.getInstance();

        // 调用单例对象方法
        instance1.showMessage();

        // 获取单例对象
        Singleton01 instance2 = Singleton01.getInstance();

        // 调用单例对象方法
        instance2.showMessage();

        // 获取单例对象
        Singleton02 singleton02 = Singleton02.getInstance();

        // 调用单例对象方法
        singleton02.showMessage();

//        Class.forName("com.wzy.creational.singleton.Singleton03");
        // 获取单例对象方法
        Singleton03 singleton03 = Singleton03.getInstance();

        // 调用单例对象方法
        singleton03.showMessage();

        // 通过枚举方式获取单例对象
        Singleton04 instance = Singleton04.INSTANCE;
        instance.showMessage();
    }
}
