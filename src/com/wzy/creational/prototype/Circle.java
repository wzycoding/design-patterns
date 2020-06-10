package com.wzy.creational.prototype;

/**
 * description: Circle <br>
 * date: 2020-06-09 15:32 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
