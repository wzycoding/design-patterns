package com.wzy.structural.bridge;

/**
 * description: Shape <br>
 * date: 2020-06-10 09:24 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
