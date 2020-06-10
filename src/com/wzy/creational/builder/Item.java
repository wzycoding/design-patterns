package com.wzy.creational.builder;

/**
 * description: 食品接口 <br>
 * date: 2020-06-09 14:26 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
