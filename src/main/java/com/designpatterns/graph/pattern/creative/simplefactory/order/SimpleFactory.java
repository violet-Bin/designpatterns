package com.designpatterns.graph.pattern.creative.simplefactory.order;

import com.designpatterns.graph.pattern.creative.simplefactory.pizze.CheesePizza;
import com.designpatterns.graph.pattern.creative.simplefactory.pizze.GreekPizza;
import com.designpatterns.graph.pattern.creative.simplefactory.pizze.Pizza;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: jiangjiabin
 * @date: Create in 1:28 2021/10/29
 * @description:
 */
public class SimpleFactory {

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (StringUtils.equalsIgnoreCase(orderType, "cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if (StringUtils.equalsIgnoreCase(orderType, "greek")) {
            pizza = new GreekPizza();
            pizza.setName("cheese");
        }

        return pizza;
    }
}
