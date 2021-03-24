package com.designpatterns.old.decorator.coffeebar;

import com.designpatterns.old.decorator.coffeebar.coffee.Decaf;
import com.designpatterns.old.decorator.coffeebar.coffee.LongBlack;
import com.designpatterns.old.decorator.coffeebar.decorator.Chocolate;
import com.designpatterns.old.decorator.coffeebar.decorator.Milk;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:15 2019/2/19
 */
public class CoffeeBar {

    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());

        System.out.println("****************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());
    }

}
