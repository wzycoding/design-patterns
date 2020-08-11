package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020/8/4 11:13
 **/
public class OrderedVIPStrategy implements IResultStrategy {
    @Override
    public String result(User userInfo) {
        String returnVal = "返回已下单VIP:" + userInfo;
        return returnVal;
    }
}
