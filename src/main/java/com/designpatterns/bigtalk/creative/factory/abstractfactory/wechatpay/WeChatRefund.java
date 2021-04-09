package com.designpatterns.bigtalk.creative.factory.abstractfactory.wechatpay;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.RefundFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:23 2021/4/10
 * @description:
 */
public class WeChatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("WeChat refund!");
    }
}
