package com.designpatterns.old.pizzastore.simplefactory;

import com.designpatterns.old.pizzastore.pizza.ChinesePizza;
import com.designpatterns.old.pizzastore.pizza.GreekPizza;
import com.designpatterns.old.pizzastore.pizza.PepperPizza;
import com.designpatterns.old.pizzastore.pizza.Pizza;

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
