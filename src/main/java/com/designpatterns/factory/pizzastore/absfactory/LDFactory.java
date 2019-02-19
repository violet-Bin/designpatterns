package com.designpatterns.factory.pizzastore.absfactory;

import com.designpatterns.factory.pizzastore.pizza.LDCheesePizza;
import com.designpatterns.factory.pizzastore.pizza.LDPepperPizza;
import com.designpatterns.factory.pizzastore.pizza.Pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:09 2019/2/19
 */
public class LDFactory implements AbstractFactory {

    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }
}
