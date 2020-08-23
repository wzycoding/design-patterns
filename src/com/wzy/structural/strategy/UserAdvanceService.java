package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020-08-21 10:52
 **/
public class UserAdvanceService {

//    @Autowired
    private UserSettlementContext userSettlementContext;

    public void settlement(User user) {
        userSettlementContext.handle(user.getType());
    }
}
