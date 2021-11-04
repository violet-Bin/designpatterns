package com.designpatterns.graph.pattern.struct.decorator;

/**
 * @author: jiangjiabin
 * @date: Create in 0:34 2021/11/5
 * @description:
 */
public class Decorator extends Drink {

    protected Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return drink.getDesc();
    }

    @Override
    public int cost() {
        return drink.cost();
    }
}
