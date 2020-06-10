package com.wzy.creational.abstractfactory;

/**
 * 抽象工厂接口
 * Created by wzy on 2020-06-09.
 */
public interface AbstractFactory {
    /**
     * 获取颜色对象
     * @param color 颜色
     * @return 颜色对象
     */
    Color getColor(String color);

    /**
     * 获取形状对象
     * @param shapeType 形状
     * @return 形状对象
     */
    Shape getShape(String shapeType);
}
