package com.designpatterns.bigtalk.creative.factory.abstractfactory.alipay;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.RefundFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:23 2021/4/10
 * @description:
 */
public class AliRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("Ali refund!");
    }
}
