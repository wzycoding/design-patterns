package com.wzy.creational.builder;

/**
 * description: Pepsi <br>
 * date: 2020-06-09 14:55 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
