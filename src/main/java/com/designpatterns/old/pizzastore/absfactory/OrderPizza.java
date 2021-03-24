package com.designpatterns.old.pizzastore.absfactory;

import com.designpatterns.old.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:05 2019/2/19
 */
public class OrderPizza {

    AbstractFactory mFactory;

    public OrderPizza(AbstractFactory mFactory) {

        setFactory(mFactory);
    }

    public void setFactory(AbstractFactory mFactory) {
        Pizza pizza;
        String orderType;

        this.mFactory = mFactory;

        do {
            orderType = getType();
            pizza = mFactory.CreatePizza(orderType);
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
