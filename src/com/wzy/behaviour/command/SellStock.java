package com.wzy.behaviour.command;

/**
 * description: SellStock <br>
 * date: 2020-06-10 17:39 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
