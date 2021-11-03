package com.designpatterns.graph.pattern.struct.bridge;

/**
 * @author: jiangjiabin
 * @date: Create in 23:24 2021/11/3
 * @description:
 */
public class SmallPhone extends Phone {

    public SmallPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void toCall() {
        brand.call("SmallPhone");
    }
}
