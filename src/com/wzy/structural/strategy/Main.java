package com.wzy.structural.strategy;

/**
 * 主方法
 * @author wzy
 * @date 2020/8/4 11:18
 **/
public class Main {
    public static void main(String[] args) {
        User user = new User("wzy", true, false);

        ResultContext context = new ResultContext(user);

        System.out.println(context.executeStrategy(user));
    }
}
