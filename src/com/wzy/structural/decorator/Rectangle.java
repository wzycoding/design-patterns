package com.wzy.structural.decorator;

/**
 * description: Rectangle <br>
 * date: 2020-06-10 11:25 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : Rectangle");
    }
}
