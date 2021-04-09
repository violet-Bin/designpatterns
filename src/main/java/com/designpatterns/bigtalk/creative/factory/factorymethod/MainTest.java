package com.designpatterns.bigtalk.creative.factory.factorymethod;

/**
 * @author: jiangjiabin
 * @date: Create in 0:54 2021/4/10
 * @description:
 */
public class MainTest {

    public static void main(String[] args) {
        IFactory factoryA = new AFactory();
        IProduct productA = factoryA.createProduct();
        productA.produce();

        IFactory factoryB = new BFactory();
        IProduct productB = factoryB.createProduct();
        productB.produce();
    }
}
