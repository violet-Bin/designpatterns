package com.designpatterns.strategy.flybehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:35 2019/2/19
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("--NoFlyBehavior--");
    }
}
