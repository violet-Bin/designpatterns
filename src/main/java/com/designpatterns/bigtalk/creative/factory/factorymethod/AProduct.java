package com.designpatterns.bigtalk.creative.factory.factorymethod;

/**
 * @author: jiangjiabin
 * @date: Create in 0:50 2021/4/10
 * @description:
 */
public class AProduct implements IProduct {
    @Override
    public void produce() {
        System.out.println("create A Product!");
    }
}
