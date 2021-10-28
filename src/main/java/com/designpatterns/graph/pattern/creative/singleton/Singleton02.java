package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:40 2021/10/29
 * @description: 饿汉式（静态代码块）
 * 优缺点同 静态常量
 */
public class Singleton02 {

    public static void main(String[] args) {
        SingletonHungryStatic instance1 = SingletonHungryStatic.getInstance();
        SingletonHungryStatic instance2 = SingletonHungryStatic.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class SingletonHungryStatic {

    private SingletonHungryStatic() {
    }

    static {
        instance = new SingletonHungryStatic();
    }

    private static SingletonHungryStatic instance;

    public static SingletonHungryStatic getInstance() {
        return instance;
    }
}