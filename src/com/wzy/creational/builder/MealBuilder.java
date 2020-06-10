package com.wzy.creational.builder;

/**
 * description: MealBuilder
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。<br>
 * date: 2020-06-09 15:06 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class MealBuilder {
    public Meal prepareVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
