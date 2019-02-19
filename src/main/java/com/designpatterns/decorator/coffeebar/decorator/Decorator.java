package com.designpatterns.decorator.coffeebar.decorator;

import com.designpatterns.decorator.coffeebar.Drink;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:22 2019/2/19
 */
public class Decorator extends Drink {
    private Drink Obj;

    public Decorator(Drink Obj) {
        this.Obj = Obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "--" + super.getPrice() + " && " + Obj.getDescription();
    }

}