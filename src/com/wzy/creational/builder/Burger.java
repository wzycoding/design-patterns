package com.wzy.creational.builder;

/**
 * description: Burger 汉堡抽象类，汉堡用包装打包 <br>
 * date: 2020-06-09 14:34 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
