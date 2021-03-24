package com.designpatterns.old.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:23 2019/2/19
 */
public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setname("NYCheesePizza");
        System.out.println(name + "preparing");
    }
}
