package com.wzy.creational.singleton;

/**
 * Double Checked
 * Created by wzy on 2020-06-09.
 */
public class Singleton02 {
    public static Singleton02 instance = null;

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        if (instance == null) {
            synchronized (Singleton02.class) {
                if (instance == null) {
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
