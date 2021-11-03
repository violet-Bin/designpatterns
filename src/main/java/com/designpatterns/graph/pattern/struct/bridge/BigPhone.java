package com.designpatterns.graph.pattern.struct.bridge;

/**
 * @author: jiangjiabin
 * @date: Create in 23:23 2021/11/3
 * @description:
 */
public class BigPhone extends Phone {

    public BigPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void toCall() {
        brand.call("BigPhone");
    }
}
