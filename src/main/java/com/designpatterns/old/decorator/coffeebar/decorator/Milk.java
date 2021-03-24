package com.designpatterns.old.decorator.coffeebar.decorator;

import com.designpatterns.old.decorator.coffeebar.Drink;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:52 2019/2/19
 */
public class Milk extends Decorator {

    public Milk(Drink Obj) {
        super(Obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }

}
