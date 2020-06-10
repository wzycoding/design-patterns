package com.wzy.creational.builder;

/**
 * description: 包装方式打包 <br>
 * date: 2020-06-09 14:29 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
