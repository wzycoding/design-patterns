package com.wzy.creational.builder;

/**
 * description: 瓶装打包 <br>
 * date: 2020-06-09 14:30 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
