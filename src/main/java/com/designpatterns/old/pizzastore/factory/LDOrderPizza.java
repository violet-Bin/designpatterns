package com.designpatterns.old.pizzastore.factory;

import com.designpatterns.old.pizzastore.pizza.LDCheesePizza;
import com.designpatterns.old.pizzastore.pizza.LDPepperPizza;
import com.designpatterns.old.pizzastore.pizza.Pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:26 2019/2/19
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }
}
