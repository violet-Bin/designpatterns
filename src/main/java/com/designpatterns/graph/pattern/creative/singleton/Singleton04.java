package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:47 2021/10/29
 * @description: 懒汉式（同步方法，线程安全）
 */
public class Singleton04 {

    public static void main(String[] args) {
        SingletonLazySyncFun instance1 = SingletonLazySyncFun.getInstance();
        SingletonLazySyncFun instance2 = SingletonLazySyncFun.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class SingletonLazySyncFun {

    private SingletonLazySyncFun() {
    }

    private static SingletonLazySyncFun instance;

    // 同步方法，解决线程安全问题，但是有性能问题
    public static synchronized SingletonLazySyncFun getInstance() {
        if (instance == null) {
            instance = new SingletonLazySyncFun();
        }
        return instance;
    }
}

