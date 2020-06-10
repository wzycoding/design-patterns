package com.wzy.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 一餐所包含的食物的集合<br>
 * date: 2020-06-09 14:58 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    /**
     * 添加食品
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 计算食品总价
     * @return 食品总价
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
