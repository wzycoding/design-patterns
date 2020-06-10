package com.wzy.behaviour.command;

/**
 * description: BuyStock <br>
 * date: 2020-06-10 17:38 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
