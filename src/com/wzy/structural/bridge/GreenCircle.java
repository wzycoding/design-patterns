package com.wzy.structural.bridge;

/**
 * description: GreenCircle <br>
 * date: 2020-06-10 09:22 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " +
                radius + ", x:" + x + ", " + y + "]");
    }
}
