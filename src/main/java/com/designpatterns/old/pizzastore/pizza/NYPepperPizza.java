package com.designpatterns.old.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:24 2019/2/19
 */
public class NYPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setname("NYPepperPizza");
        System.out.println(name + "preparing");
    }
}
