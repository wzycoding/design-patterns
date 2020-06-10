package com.wzy.creational.builder;

/**
 * description: ColdDrink 冷饮用瓶子来打包<br>
 * date: 2020-06-09 14:43 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
