package com.wzy.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author wzy
 * @date 2020/8/4 9:23
 **/
public class Subject {
    private List<Obserser> observerList = new ArrayList<>();

    public void setMsg(String msg) {
        notifyAll(msg);
    }

    /**
     * 订阅消息
     */
    public void addAttach(Obserser obserser) {
        observerList.add(obserser);
    }

    public void notifyAll(String msg) {
        for (Obserser obserser : observerList) {
            obserser.update(msg);
        }
    }
}

