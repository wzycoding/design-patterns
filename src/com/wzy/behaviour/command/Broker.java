package com.wzy.behaviour.command;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Broker 命令调用类<br>
 * date: 2020-06-10 17:43 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
