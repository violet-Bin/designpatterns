package com.designpatterns.old.strategy.duck;

import com.designpatterns.old.strategy.flybehavior.GoodFlyBehavior;
import com.designpatterns.old.strategy.quackbehavior.GaGaQuackBehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:32 2019/2/19
 */
public class GreenHeadDuck extends Duck{

    public GreenHeadDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("GreenHeadDuck---------");
    }


}
