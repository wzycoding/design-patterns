package com.wzy.structural.decorator;

/**
 * description: RedShapeDecorator <br>
 * date: 2020-06-10 11:38 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);

    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
