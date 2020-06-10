package com.wzy.structural.facade;

/**
 * description: Rectangle <br>
 * date: 2020-06-10 13:37 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
