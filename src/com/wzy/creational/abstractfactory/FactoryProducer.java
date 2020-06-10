package com.wzy.creational.abstractfactory;

/**
 * 创建一个工厂创造器，通过传递形状或者颜色信息来获取工厂
 * Created by wzy on 2020-06-09.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
