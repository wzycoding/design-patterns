package com.wzy.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * description: PersonInvocationHandler <br>
 * date: 2020-06-10 15:22 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class PersonInvocationHandler implements InvocationHandler {
    private RealSubject realSubject;

    public PersonInvocationHandler(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (method.getName().equals("eat")) {
            System.out.println("买菜，洗菜、做菜");
            result = method.invoke(realSubject, args);
            System.out.println("洗碗，擦桌子");
        } else if (method.getName().equals("drink")) {
            System.out.println("烧水");
            result = method.invoke(realSubject, args);
            System.out.println("洗杯子");
        }
        return result;
    }
}
