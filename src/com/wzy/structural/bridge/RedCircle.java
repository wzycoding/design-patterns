package com.wzy.structural.bridge;

/**
 * description: RedCircle <br>
 * date: 2020-06-10 09:16 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color: red, radius: " +
                radius + ", x: " + x + ", " + y + "]");
    }
}
