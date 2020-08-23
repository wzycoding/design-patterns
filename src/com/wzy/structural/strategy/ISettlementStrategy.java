package com.wzy.structural.strategy;

/**
 * 结算接口
 *
 * @author wzy
 * @date 2020-08-21 10:54
 **/
public interface ISettlementStrategy {
    void cal();

    /**
     * 用户的类型
     */
    int support();
}
