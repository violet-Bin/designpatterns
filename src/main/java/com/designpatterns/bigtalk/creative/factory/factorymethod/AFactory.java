package com.designpatterns.bigtalk.creative.factory.factorymethod;

/**
 * @author: jiangjiabin
 * @date: Create in 0:52 2021/4/10
 * @description:
 */
public class AFactory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new AProduct();
    }
}
