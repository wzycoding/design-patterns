package com.wzy.creational.factory;

/**
 * Created by wzy on 2020-06-08.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
