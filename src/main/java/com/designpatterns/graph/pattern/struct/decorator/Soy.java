package com.designpatterns.graph.pattern.struct.decorator;

/**
 * @author: jiangjiabin
 * @date: Create in 0:35 2021/11/5
 * @description:
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "add soy";
    }

    @Override
    public int cost() {
        return super.cost() + 20;
    }
}
