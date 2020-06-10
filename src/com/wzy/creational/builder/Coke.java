package com.wzy.creational.builder;

/**
 * description: Coke <br>
 * date: 2020-06-09 14:55 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
