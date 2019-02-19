package com.designpatterns.factory.pizzastore.simplefactory;

import com.designpatterns.factory.pizzastore.pizza.ChinesePizza;
import com.designpatterns.factory.pizzastore.pizza.GreekPizza;
import com.designpatterns.factory.pizzastore.pizza.PepperPizza;
import com.designpatterns.factory.pizzastore.pizza.Pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:47 2019/2/19
 */
public class SimplePizzaFactory {

    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("chinese")) {
            pizza = new ChinesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;

    }
}
