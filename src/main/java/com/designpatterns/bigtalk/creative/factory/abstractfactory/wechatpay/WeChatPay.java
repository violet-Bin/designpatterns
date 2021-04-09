package com.designpatterns.bigtalk.creative.factory.abstractfactory.wechatpay;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.PayFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 16:35 2021/3/28
 * @description:
 */
public class WeChatPay implements PayFactory {

    @Override
    public void unifiedPay() {
        System.out.println("WeChat Pay!");
    }
}
