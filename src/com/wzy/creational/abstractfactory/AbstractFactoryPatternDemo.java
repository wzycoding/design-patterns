package com.wzy.creational.abstractfactory;

/**
 * 抽象工厂模式测试类
 * Created by wzy on 2020-06-09.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取抽象工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Shape circle = shapeFactory.getShape("circle");
        Color red = colorFactory.getColor("red");

        circle.draw();
        red.fill();
    }
}
