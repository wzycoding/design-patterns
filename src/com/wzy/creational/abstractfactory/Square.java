package com.wzy.creational.abstractfactory;

/**
 * Created by wzy on 2020-06-09.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
