package com.wzy.structural.facade;

/**
 * description: ShapeMaker 外观类 <br>
 * date: 2020-06-10 13:43 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
