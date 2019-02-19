package com.designpatterns.factory.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:44 2019/2/19
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("PepperPizza");
        System.out.println(name + "preparing");
    }
}
