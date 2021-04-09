package com.designpatterns.bigtalk.creative.factory.simple;

/**
 * @author: jiangjiabin
 * @date: Create in 16:35 2021/3/28
 * @description:
 */
public class AliPay implements Pay {

    @Override
    public void unifiedorder() {
        System.out.println("Ali pay---");
    }
}
