package com.wzy.creational.abstractfactory;

/**
 * Created by wzy on 2020-06-09.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.\"");
    }
}
