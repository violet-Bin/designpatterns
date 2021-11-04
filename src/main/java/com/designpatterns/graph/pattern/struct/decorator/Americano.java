package com.designpatterns.graph.pattern.struct.decorator;

/**
 * @author: jiangjiabin
 * @date: Create in 0:32 2021/11/5
 * @description:
 */
public class Americano extends Drink {

    @Override
    public String getDesc() {
        return "Americano";
    }

    @Override
    public int cost() {
        return 2;
    }
}
