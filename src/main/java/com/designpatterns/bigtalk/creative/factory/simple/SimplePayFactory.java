package com.designpatterns.bigtalk.creative.factory.simple;

/**
 * @author: jiangjiabin
 * @date: Create in 16:36 2021/3/28
 * @description:
 */
public class SimplePayFactory {

    public static Pay createPay(String payType){
        if (payType == null) {
            return null;
        } else if (payType.equalsIgnoreCase("WECHAT_PAY")) {
            return new WechatPay();
        }else if (payType.equalsIgnoreCase("ALI_PAY")) {
            return new AliPay();
        }
        //...other
        return null;
    }
}
