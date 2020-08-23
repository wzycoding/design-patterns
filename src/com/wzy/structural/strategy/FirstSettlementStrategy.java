package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020-08-21 10:56
 **/
//@Component
public class FirstSettlementStrategy implements ISettlementStrategy {
    @Override
    public void cal() {
        System.out.println("一级用户策略");
    }

    @Override
    public int support() {
        return 2;
    }
}
