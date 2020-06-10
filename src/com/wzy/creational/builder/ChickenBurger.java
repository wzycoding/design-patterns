package com.wzy.creational.builder;

/**
 * description: ChickenBurger <br>
 * date: 2020-06-09 14:53 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
