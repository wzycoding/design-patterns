package com.wzy.behaviour.command;

/**
 * description: CommandPatternDemo <br>
 * date: 2020-06-10 17:50 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

    }
}
