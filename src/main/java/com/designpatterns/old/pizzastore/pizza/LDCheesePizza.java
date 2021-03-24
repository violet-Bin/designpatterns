package com.designpatterns.old.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:10 2019/2/19
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("LDCheesePizza");
        System.out.println(name + "preparing");
    }
}
