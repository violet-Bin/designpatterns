package com.designpatterns.bigtalk.creative.factory.abstractfactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:15 2021/4/10
 * @description:
 */
public interface OrderFactory {

    PayFactory createPay();

    RefundFactory createRefund();

}
