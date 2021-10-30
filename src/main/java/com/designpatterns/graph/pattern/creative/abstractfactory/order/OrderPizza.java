package com.designpatterns.graph.pattern.creative.abstractfactory.order;


import org.apache.commons.lang3.StringUtils;

/**
 * @author: jiangjiabin
 * @date: Create in 23:47 2021/10/30
 * @description:
 */
public class OrderPizza {

    public static OrderPizzaFactory getOrderPizzaFactory(String factoryType) {
        if (StringUtils.equalsIgnoreCase(factoryType, "BJ")) {
            return new BJOrderPizzaFactory();
        } else if (StringUtils.equalsIgnoreCase(factoryType, "LD")) {
            return new LDOrderPizzaFactory();
        }
        return null;
    }
}
