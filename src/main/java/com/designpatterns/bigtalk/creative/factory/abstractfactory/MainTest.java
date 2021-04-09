package com.designpatterns.bigtalk.creative.factory.abstractfactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:29 2021/4/10
 * @description:
 */
public class MainTest {

    public static void main(String[] args) {
        OrderFactory orderFactory = FactoryProduce.getOrderFactory("ali_pay");
        if (orderFactory != null) {
            PayFactory payFactory = orderFactory.createPay();
            payFactory.unifiedPay();
            RefundFactory refundFactory = orderFactory.createRefund();
            refundFactory.refund();
        }
    }
}
