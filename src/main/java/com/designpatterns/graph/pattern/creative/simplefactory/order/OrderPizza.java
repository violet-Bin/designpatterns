package com.designpatterns.graph.pattern.creative.simplefactory.order;

import com.designpatterns.graph.pattern.creative.simplefactory.pizze.Pizza;

/**
 * @author: jiangjiabin
 * @date: Create in 15:20 2021/10/30
 * @description:
 */
public class OrderPizza {

    public void orderPizza(String orderType){
        Pizza pizza = SimpleFactory.createPizza(orderType);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
        } else {
            System.out.println("订购失败！");
        }
    }

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.orderPizza("cheese");
    }

}
