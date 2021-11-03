package com.designpatterns.graph.pattern.struct.bridge;

/**
 * @author: jiangjiabin
 * @date: Create in 23:20 2021/11/3
 * @description:
 */
public abstract class Phone {

    protected Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void toCall();
}
