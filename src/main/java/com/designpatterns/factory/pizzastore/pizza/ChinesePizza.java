package com.designpatterns.factory.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:40 2019/2/19
 */
public class ChinesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("ChinesePizza");
        System.out.println(name+" preparing;");
    }
}
