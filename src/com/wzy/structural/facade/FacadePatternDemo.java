package com.wzy.structural.facade;

/**
 * description: FacadePatternDemo <br>
 * date: 2020-06-10 13:46 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
