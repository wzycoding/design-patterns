package com.wzy.structural.strategy;

/**
 * 返回结果上下文
 * @author wzy
 * @date 2020/8/4 11:14
 **/
public class ResultContext {

    private IResultStrategy strategy;

    public ResultContext(User user) {
        // 判断是否下单
        if (user.getOrdered()) {
            // 判断是否是VIP
            if (user.getVip()) {
                strategy = new OrderedVIPStrategy();
            } else {
                strategy = new OrderedNonVIPStrategy();
            }
        } else {
            // 判断是否是VIP
            if (user.getVip()) {
                strategy = new NonOrderedVIPStrategy();
            } else {
                strategy = new NonOrderedNonVIPStrategy();
            }
        }
    }

    public String executeStrategy(User userInfo) {
        return strategy.result(userInfo);
    }
}
