package com.wzy.behaviour.command;

/**
 * description: Stock <br>
 * date: 2020-06-10 17:31 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] sold");
    }
}
