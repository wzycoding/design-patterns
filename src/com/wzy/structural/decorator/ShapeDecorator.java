package com.wzy.structural.decorator;

/**
 * description: ShapeDecorator 抽象装饰器类<br>
 * date: 2020-06-10 11:35 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
