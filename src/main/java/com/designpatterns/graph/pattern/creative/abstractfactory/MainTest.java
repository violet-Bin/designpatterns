package com.designpatterns.graph.pattern.creative.abstractfactory;

import com.designpatterns.graph.pattern.creative.abstractfactory.order.OrderPizza;
import com.designpatterns.graph.pattern.creative.abstractfactory.order.OrderPizzaFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 23:53 2021/10/30
 * @description:
 */
public class MainTest {

    public static void main(String[] args) {
        OrderPizzaFactory bjPizzaFactory = OrderPizza.getOrderPizzaFactory("BJ");
        OrderPizzaFactory ldPizzaFactory = OrderPizza.getOrderPizzaFactory("ld");

        if (bjPizzaFactory != null ) {
            bjPizzaFactory.createPizza("Pepper");
        }
        if (ldPizzaFactory != null) {
            ldPizzaFactory.createPizza("Pepper");
        }
    }
}
