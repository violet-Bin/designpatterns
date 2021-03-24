package com.designpatterns.old.pizzastore.absfactory;

import com.designpatterns.old.pizzastore.pizza.Pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:06 2019/2/19
 */
public interface AbstractFactory {
    Pizza CreatePizza(String orderType);
}
