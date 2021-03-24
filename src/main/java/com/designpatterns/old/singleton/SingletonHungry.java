package com.designpatterns.old.singleton;

/**
 * @Author: jiangjiabin
 * @Description: 饿汉式（先实例化）
 * 饿汉线程安全，懒汉不安全
 * @Date: Create in 21:18 2019/2/19
 */
public class SingletonHungry {

    //create an object of Singleton
    private static SingletonHungry instance1 = new SingletonHungry();

    //make the constructor private so that this class cannot be instantiated
    private SingletonHungry(){}

    //Get the only object available
    public static SingletonHungry getInstance() {
        return instance1;
    }

    public void showMessage(){
        System.out.println("SingletonHungry：我是饿汉，先实例化！");
    }

}
