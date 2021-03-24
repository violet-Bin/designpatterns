package com.designpatterns.old.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:43 2019/2/19
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("GreekPizza");
        System.out.println(name + "preparing");
    }
}
