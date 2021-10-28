package com.designpatterns.graph.pattern.creative.singleton;

/**
 * @author: jiangjiabin
 * @date: Create in 0:48 2021/10/29
 * @description: 静态内部类
 * SingletonStaticInClass装载的时候，静态内部类不会立刻装载，保证懒加载；
 * 调用getInstance()时会装载静态内部类，而jvm装载静态内部类是线程安全的，因此保证了线程安全。
 * 推荐使用
 */
public class Singleton07 {

    public static void main(String[] args) {
        SingletonStaticInClass instance1 = SingletonStaticInClass.getInstance();
        SingletonStaticInClass instance2 = SingletonStaticInClass.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class SingletonStaticInClass {

    private SingletonStaticInClass() {
    }

    private static class SingletonStaticInClassInstance{
        private static final SingletonStaticInClass INSTANCE = new SingletonStaticInClass();
    }

    public static SingletonStaticInClass getInstance() {
        return SingletonStaticInClassInstance.INSTANCE;
    }
}
