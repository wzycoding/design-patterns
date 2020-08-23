package com.wzy.structural.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wzy
 * @date 2020-08-21 10:53
 **/
public class UserSettlementContext {

    private Map<Integer, ISettlementStrategy> settlementStrategyMap;
//    @Autowired
    public UserSettlementContext(List<ISettlementStrategy> strategyList) {
        settlementStrategyMap = new HashMap<>();
        strategyList.forEach( s -> settlementStrategyMap.put(s.support(), s));
    }

    public void handle(int type) {
        settlementStrategyMap.get(type).cal();
    }
}
