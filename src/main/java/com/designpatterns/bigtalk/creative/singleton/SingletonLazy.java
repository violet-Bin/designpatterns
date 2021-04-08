package com.designpatterns.bigtalk.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 1:04 2021/3/25
 * @description: 单例
 * 懒汉是延迟实例化，是线程不安全的
 * 这里实现 双重检查 的单例模式
 * 能在多线程情况下保证高性能
 *
 * volatile，可以禁止指令重排
 */
public class SingletonLazy {

    private static volatile SingletonLazy singletonLazy;

    private SingletonLazy() {

    }

    /**
     * new SingletonLazy() 不是原子的：
     *  1、分配空间给对象 -> 2、在空间内创建对象 -> 3、将对象复制给引用instance
     * 如果发生了指令重排，线程执行顺序是 1 -> 3 -> 2，会将值写进主内存，其他线程就会读到instance的最新值，
     * 但是这是一个不完全的对象
     * @return
     */
    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }


}
