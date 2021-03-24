package com.designpatterns.old.singleton;

/**
 * @Author: jiangjiabin
 * @Description: 懒汉式（后实例化）
 * 饿汉线程安全，懒汉不安全
 * @Date: Create in 21:15 2019/2/19
 */
public class SingletonLazy {

    private static SingletonLazy instance2 = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance2 == null) {
            instance2 = new SingletonLazy();
        }
        return instance2;
    }

    public void showMessage() {
        System.out.println("SingletonLazy：我是懒汉，后实例化");
    }


}
