package com.designpatterns.old.decorator.coffeebar.decorator;

import com.designpatterns.old.decorator.coffeebar.Drink;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:49 2019/2/19
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink Obj) {
        super(Obj);
        super.setDescription("Chocolate");
        super.setPrice(7.0f);
    }
}
