package com.wzy.behaviour.observer;

/**
 * @author wzy
 * @date 2020/8/4 9:21
 **/
public class F_Observer extends Obserser{

    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getSimpleName() + "收到消息: " + msg);
    }
}
