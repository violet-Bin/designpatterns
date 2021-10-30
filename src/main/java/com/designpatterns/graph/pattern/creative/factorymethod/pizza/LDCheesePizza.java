package com.designpatterns.graph.pattern.creative.factorymethod.pizza;

/**
 * @author: jiangjiabin
 * @date: Create in 16:29 2021/10/30
 * @description:
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(this.getName() + "is preparing");

    }
}
