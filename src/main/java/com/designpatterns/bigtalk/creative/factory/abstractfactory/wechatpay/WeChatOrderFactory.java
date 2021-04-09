package com.designpatterns.bigtalk.creative.factory.abstractfactory.wechatpay;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.OrderFactory;
import com.designpatterns.bigtalk.creative.factory.abstractfactory.PayFactory;
import com.designpatterns.bigtalk.creative.factory.abstractfactory.RefundFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:20 2021/4/10
 * @description:
 */
public class WeChatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WeChatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WeChatRefund();
    }
}
