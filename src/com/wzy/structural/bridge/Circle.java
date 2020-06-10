package com.wzy.structural.bridge;

/**
 * description: Circle <br>
 * date: 2020-06-10 09:30 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Circle extends Shape {
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
