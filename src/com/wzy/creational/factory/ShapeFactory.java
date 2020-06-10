package com.wzy.creational.factory;

/**
 * Created by wzy on 2020-06-08.
 */
public class ShapeFactory {
    /**
     * 获取形状对象
     * @param shapeType 形状类型
     * @return 形状对象
     */
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
