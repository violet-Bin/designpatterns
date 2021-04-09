package com.designpatterns.bigtalk.creative.factory.abstractfactory;

import com.designpatterns.bigtalk.creative.factory.abstractfactory.alipay.AliOrderFactory;
import com.designpatterns.bigtalk.creative.factory.abstractfactory.wechatpay.WeChatOrderFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 1:26 2021/4/10
 * @description: 抽象工厂创建，使用简单工厂
 */
public class FactoryProduce {

    public static OrderFactory getOrderFactory(String factoryType) {
        if ("ALI_PAY".equalsIgnoreCase(factoryType)) {
            return new AliOrderFactory();
        } else if ("WECHAT_PAY".equalsIgnoreCase(factoryType)) {
            return new WeChatOrderFactory();
        }
        return null;
    }
}
