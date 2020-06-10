package com.wzy.structural.decorator;

/**
 * description: Circle <br>
 * date: 2020-06-10 11:29 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : Circle");
    }
}
