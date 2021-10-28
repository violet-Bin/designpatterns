package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:48 2021/10/29
 * @description: 枚举
 * 推荐使用
 */
public class Singleton08 {

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.sayOk();
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

enum  SingletonEnum {

    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}