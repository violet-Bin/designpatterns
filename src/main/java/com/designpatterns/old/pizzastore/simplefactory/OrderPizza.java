package com.designpatterns.old.pizzastore.simplefactory;

import com.designpatterns.old.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:47 2019/2/19
 */
public class OrderPizza {

    private SimplePizzaFactory mSimplePizzaFactory;

    public OrderPizza(SimplePizzaFactory mSimplePizzaFactory) {
        setFactory(mSimplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory mSimplePizzaFactory) {
        Pizza pizza;
        String orderType;

        this.mSimplePizzaFactory = mSimplePizzaFactory;

        do {
            orderType = getType();
            pizza = mSimplePizzaFactory.CreatePizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

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
