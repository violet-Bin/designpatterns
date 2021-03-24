package com.designpatterns.old.pizzastore.absfactory;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:37 2019/2/19
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
