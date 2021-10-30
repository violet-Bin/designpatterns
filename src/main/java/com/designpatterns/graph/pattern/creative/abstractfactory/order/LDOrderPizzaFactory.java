package com.designpatterns.graph.pattern.creative.abstractfactory.order;


import com.designpatterns.graph.pattern.creative.factorymethod.pizza.LDCheesePizza;
import com.designpatterns.graph.pattern.creative.factorymethod.pizza.LDPepperPizza;
import com.designpatterns.graph.pattern.creative.factorymethod.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: jiangjiabin
 * @date: Create in 16:35 2021/10/30
 * @description:
 */
public class LDOrderPizzaFactory implements OrderPizzaFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (StringUtils.equalsIgnoreCase(orderType, "cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        } else if (StringUtils.equalsIgnoreCase(orderType, "pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("LDPepperPizza");
        }
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
        } else {
            System.out.println("订购失败！");
        }
        return pizza;
    }
}
