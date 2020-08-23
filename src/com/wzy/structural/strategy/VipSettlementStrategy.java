package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020-08-21 10:54
 **/
//@Component
public class VipSettlementStrategy implements ISettlementStrategy {
    @Override
    public void cal() {
        System.out.println("使用vip策略");
    }

    @Override
    public int support() {
        return 1;
    }
}
