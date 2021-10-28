package com.designpatterns.graph.pattern.creative.singleton;


/**
 * @author: jiangjiabin
 * @date: Create in 0:47 2021/10/29
 * @description: 双重检查
 * 解决了懒加载和线程安全问题，同时保证了效率。推荐使用
 */
public class Singleton06 {

    public static void main(String[] args) {
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class SingletonDoubleCheck{

    private SingletonDoubleCheck(){}

    private static volatile SingletonDoubleCheck instance;

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
