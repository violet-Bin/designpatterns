package com.designpatterns.graph.pattern.struct.decorator;


/**
 * @author: jiangjiabin
 * @date: Create in 0:39 2021/11/5
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        Drink drink = new Espresso();
        Decorator milkEspresso = new Milk(drink);
        milkEspresso = new Milk(milkEspresso);
        System.out.println(milkEspresso.getDesc() + " " + milkEspresso.cost());


    }
}
