package com.wzy.creational.prototype;

/**
 * description: Square <br>
 * date: 2020-06-09 15:30 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
