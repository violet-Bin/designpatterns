package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:45 2021/10/29
 * @description: 懒汉式（线程不安全）
 *
 */
public class Singleton03 {

    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class SingletonLazy {

    private SingletonLazy() {
    }

    private static SingletonLazy instance;

    public static SingletonLazy getInstance() {
        // 存在线程安全
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
