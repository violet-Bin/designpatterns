package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:33 2021/10/29
 * @description: 饿汉式（静态常量）
 * 优点：写法简单，在类装载的时候完成了实例化，避免了线程同步问题。
 * 缺点：没有达到懒加载的效果，可能造成内存浪费。
 */
public class Singleton01 {

    public static void main(String[] args) {
        SingletonHungry instance1 = SingletonHungry.getInstance();
        SingletonHungry instance2 = SingletonHungry.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class SingletonHungry{
    private SingletonHungry(){}

    private static final SingletonHungry instance = new SingletonHungry();

    public static SingletonHungry getInstance() {
        return instance;
    }
}
