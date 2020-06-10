package com.wzy.structural.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * description: JdkProxyDemo <br>
 * date: 2020-06-10 15:27 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class JdkProxyDemo {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, new PersonInvocationHandler(realSubject));
        subject.eat();
        System.out.println("==============分割线===============");
        subject.drink();
    }
}
