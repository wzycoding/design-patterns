package com.wzy.structural.strategy;

/**
 * 未下单用户策略
 * @author wzy
 * @date 2020/8/4 11:44
 **/
public class NonOrderedVIPStrategy implements IResultStrategy {
    @Override
    public String result(User userInfo) {
        String returnVal = "返回未下单VIP未下单逻辑" + userInfo;
        return returnVal;
    }
}
