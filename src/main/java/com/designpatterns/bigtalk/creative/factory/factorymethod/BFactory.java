package com.designpatterns.bigtalk.creative.factory.factorymethod;

/**
 * @author: jiangjiabin
 * @date: Create in 0:53 2021/4/10
 * @description:
 */
public class BFactory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new BProduct();
    }
}
