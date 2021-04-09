package com.designpatterns.bigtalk.creative.factory.abstractfactory.alipay;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.PayFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 16:35 2021/3/28
 * @description:
 */
public class AliPay implements PayFactory {

    @Override
    public void unifiedPay() {
        System.out.println("Ali Pay!");
    }
}
