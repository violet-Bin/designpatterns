package com.designpatterns.bigtalk.creative.factory.abstractfactory.alipay;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.OrderFactory;
import com.designpatterns.bigtalk.creative.factory.abstractfactory.PayFactory;
import com.designpatterns.bigtalk.creative.factory.abstractfactory.RefundFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:20 2021/4/10
 * @description:
 */
public class AliOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
