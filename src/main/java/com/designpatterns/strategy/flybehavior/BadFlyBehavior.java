package com.designpatterns.strategy.flybehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:34 2019/2/19
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("--BadFlyBehavior--");
    }
}
