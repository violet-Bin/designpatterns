package com.designpatterns.graph.pattern.struct.bridge;

/**
 * @author: jiangjiabin
 * @date: Create in 23:18 2021/11/3
 * @description:
 */
public class Huawei implements Brand {

    @Override
    public void call(String msg) {
        System.out.println(msg + " Huawei call...");
    }
}
