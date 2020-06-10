package com.wzy.creational.abstractfactory;

/**
 * Created by wzy on 2020-06-09.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
