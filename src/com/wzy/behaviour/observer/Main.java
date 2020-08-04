package com.wzy.behaviour.observer;

/**
 * 主方法
 * @author wzy
 * @date 2020/8/4 9:29
 **/
public class Main {
    public static void main(String[] args) {
        F_Observer observer1 = new F_Observer();
        S_Observer observer2 = new S_Observer();
        T_Observer observer3 = new T_Observer();

        // 创建被监听对象
        Subject subject = new Subject();
        subject.addAttach(observer1);
        subject.addAttach(observer2);
        subject.addAttach(observer3);

        subject.setMsg("Hello World!!!");
    }
}
