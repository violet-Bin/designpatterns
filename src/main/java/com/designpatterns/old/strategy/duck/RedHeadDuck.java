package com.designpatterns.old.strategy.duck;

import com.designpatterns.old.strategy.flybehavior.BadFlyBehavior;
import com.designpatterns.old.strategy.quackbehavior.HaHaQuackBehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:33 2019/2/19
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new HaHaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck--------");
    }
}
