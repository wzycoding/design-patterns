package com.wzy.creational.abstractfactory;

/**
 * Created by wzy on 2020-06-09.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
