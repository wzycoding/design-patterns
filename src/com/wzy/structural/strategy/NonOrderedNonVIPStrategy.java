package com.wzy.structural.strategy;

/**
 * 非VIP策略
 * @author wzy
 * @date 2020/8/4 11:18
 **/
public class NonOrderedNonVIPStrategy implements IResultStrategy {
    @Override
    public String result(User userInfo) {
        String returnVal = "返回未下单非VIP:" + userInfo;
        return returnVal;
    }
}
