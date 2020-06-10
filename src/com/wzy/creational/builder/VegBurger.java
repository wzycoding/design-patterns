package com.wzy.creational.builder;

/**
 * description: VegBurger 蔬菜汉堡<br>
 * date: 2020-06-09 14:48 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
