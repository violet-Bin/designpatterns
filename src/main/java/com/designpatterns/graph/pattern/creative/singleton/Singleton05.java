package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:47 2021/10/29
 * @description: 懒汉式（同步代码块，线程安全）
 */
public class Singleton05 {

    public static void main(String[] args) {
        SingletonLazySyncBlock instance1 = SingletonLazySyncBlock.getInstance();
        SingletonLazySyncBlock instance2 = SingletonLazySyncBlock.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class SingletonLazySyncBlock {

    private SingletonLazySyncBlock() {
    }

    private static SingletonLazySyncBlock instance;

    public static SingletonLazySyncBlock getInstance() {
        // 同步代码块，解决线程安全问题，但是有性能问题
        synchronized (SingletonLazySyncBlock.class) {
            if (instance == null) {
                instance = new SingletonLazySyncBlock();
            }
        }
        return instance;
    }
}