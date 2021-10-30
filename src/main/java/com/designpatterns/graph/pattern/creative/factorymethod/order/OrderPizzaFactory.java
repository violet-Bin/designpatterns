package com.designpatterns.graph.pattern.creative.factorymethod.order;


import com.designpatterns.graph.pattern.creative.factorymethod.pizza.Pizza;

/**
 * @author: jiangjiabin
 * @date: Create in 16:33 2021/10/30
 * @description:
 */
public interface OrderPizzaFactory {

    Pizza createPizza(String orderType);


}
