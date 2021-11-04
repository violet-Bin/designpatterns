package com.designpatterns.graph.pattern.struct.decorator;


/**
 * @author: jiangjiabin
 * @date: Create in 0:31 2021/11/5
 * @description:
 */
public class Espresso extends Drink {

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public int cost() {
        return 1;
    }
}
