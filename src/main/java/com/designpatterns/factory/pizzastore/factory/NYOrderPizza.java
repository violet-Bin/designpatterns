package com.designpatterns.factory.pizzastore.factory;

import com.designpatterns.factory.pizzastore.pizza.NYCheesePizza;
import com.designpatterns.factory.pizzastore.pizza.NYPepperPizza;
import com.designpatterns.factory.pizzastore.pizza.Pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:19 2019/2/19
 */
public class NYOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
