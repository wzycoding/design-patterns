package com.wzy.structural.proxy.jdk;

/**
 * description: RealSubject <br>
 * date: 2020-06-10 15:16 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class RealSubject implements Subject {
    @Override
    public void eat() {
        System.out.println("开始吃东西...");
    }

    @Override
    public void drink() {
        System.out.println("开始喝水...");
    }
}
