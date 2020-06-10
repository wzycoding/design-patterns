package com.wzy.creational.factory;

/**
 * 工厂模式演示demo
 * Created by wzy on 2020-06-08.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle的对象，并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        // 获取Square的对象，并调用它的draw方法
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        // 获取Rectangle的对象，并调用它的draw方法
        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

    }
}
