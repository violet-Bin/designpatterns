package com.designpatterns.old.pizzastore.factory;

import com.designpatterns.old.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:19 2019/2/19
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza;
        String orderType;

        do {
            orderType = getType();
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    abstract Pizza createPizza(String orderType);

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
