package com.wzy.creational.prototype;

/**
 * description: Rectangle <br>
 * date: 2020-06-09 15:28 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
