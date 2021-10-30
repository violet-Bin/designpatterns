package com.designpatterns.graph.pattern.creative.simplefactory.pizze;

/**
 * @author: jiangjiabin
 * @date: Create in 15:13 2021/10/30
 * @description:
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(this.getName() + "is preparing");
    }
}
