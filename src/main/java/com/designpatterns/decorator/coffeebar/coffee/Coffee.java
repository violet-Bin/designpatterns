package com.designpatterns.decorator.coffeebar.coffee;

import com.designpatterns.decorator.coffeebar.Drink;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:14 2019/2/19
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
