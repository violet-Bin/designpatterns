package com.designpatterns.strategy.quackbehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:36 2019/2/19
 */
public class HaHaQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("--HaHaQuackBehavior--");
    }
}
