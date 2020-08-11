package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020/8/4 11:13
 **/
public class OrderedNonVIPStrategy implements IResultStrategy {
    @Override
    public String result(User userInfo) {
        String returnVal = "返回已下单，非VIP:" + userInfo;
        return returnVal;
    }
}
