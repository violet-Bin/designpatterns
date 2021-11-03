package com.designpatterns.graph.pattern.struct.bridge;

/**
 * @author: jiangjiabin
 * @date: Create in 23:29 2021/11/3
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        Phone bigPhone = new BigPhone(new Huawei());
        bigPhone.toCall();
    }
}
