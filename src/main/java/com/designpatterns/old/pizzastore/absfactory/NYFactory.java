package com.designpatterns.old.pizzastore.absfactory;

import com.designpatterns.old.pizzastore.pizza.NYCheesePizza;
import com.designpatterns.old.pizzastore.pizza.NYPepperPizza;
import com.designpatterns.old.pizzastore.pizza.Pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:53 2019/2/19
 */
public class NYFactory implements AbstractFactory {
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
