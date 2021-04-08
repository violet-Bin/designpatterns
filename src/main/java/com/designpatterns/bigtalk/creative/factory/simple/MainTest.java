package com.designpatterns.bigtalk.creative.factory.simple;

/**
 * @author: jiangjiabin
 * @date: Create in 16:39 2021/3/28
 * @description:
 */
public class MainTest {

    public static void main(String[] args) {
        Pay pay = SimplePayFactory.createPay("WECHAT_PAY");
        pay.unifiedorder();
    }
}
