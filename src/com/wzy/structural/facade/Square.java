package com.wzy.structural.facade;

/**
 * description: Square <br>
 * date: 2020-06-10 13:41 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
