package com.wzy.structural.flyweight;

import java.util.HashMap;

/**
 * description: ShapeFactory <br>
 * date: 2020-06-10 14:17 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
