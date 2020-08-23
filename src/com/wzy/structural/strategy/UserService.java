package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020-08-21 10:48
 **/
public class UserService {
    public void settlement(User user) {
        if (user.getType() == 1) {
            System.out.println("使用会员价格");
        } else if (user.getType() == 2) {
            System.out.println("使用一级用户价格");
        } else if (user.getType() == 3) {
            System.out.println("使用二级会员价格");
        }
    }
}
