package com.designpatterns.factory.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:11 2019/2/19
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("LDPepperPizza");
        System.out.println(name + "preparing");
    }
}
