package com.designpatterns.factory.pizzastore.simplefactory;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:36 2019/2/19
 */
public class PizzaStroe {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimplePizzaFactory());
    }

}
