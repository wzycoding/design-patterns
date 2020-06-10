package com.wzy.structural.proxy;

/**
 * description: ProxyPatternDemo <br>
 * 代理，偏重因自己无法完成或自己无需关心，需要他人干涉事件流程，更多的是对对象的控制。
 * 装饰，偏重对原对象功能的扩展，扩展后的对象仍是是对象本身。
 * date: 2020-06-10 14:54 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("abc.jpg");

        // 将图像从磁盘加载
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
