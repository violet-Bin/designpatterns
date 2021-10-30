package com.designpatterns.graph.pattern.creative.factorymethod;


import com.designpatterns.graph.pattern.creative.factorymethod.order.BJOrderPizzaFactory;
import com.designpatterns.graph.pattern.creative.factorymethod.order.LDOrderPizzaFactory;
import com.designpatterns.graph.pattern.creative.factorymethod.order.OrderPizzaFactory;

/**
 * @author: jiangjiabin
 * @date: Create in 16:45 2021/10/30
 * @description:
 */
public class MainTest {

    public static void main(String[] args) {
        OrderPizzaFactory orderPizzaFactory = new BJOrderPizzaFactory();
        orderPizzaFactory.createPizza("pepper");

        OrderPizzaFactory orderPizzaFactory2 = new LDOrderPizzaFactory();
        orderPizzaFactory2.createPizza("cheese");
    }
}
