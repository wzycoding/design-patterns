package com.wzy.structural.facade;

/**
 * description: Circle <br>
 * date: 2020-06-10 13:42 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
