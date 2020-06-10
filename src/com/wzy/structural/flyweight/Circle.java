package com.wzy.structural.flyweight;

/**
 * description: Circle <br>
 * date: 2020-06-10 14:11 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [ Color : " + color +
                ", x : " + x + ", y :" + y + ",radius : " + radius);
    }
}
